<template>
  <div>
    <div>
      <Header :style="{background: '#fff', boxShadow: '0 2px 3px 2px rgba(0,0,0,.1)'}">
        <div :style= "{fontSize:'16px'}"   class="title">

          <span>一般客户管理</span>
        </div>
      </Header>
    </div> <Modal
    v-model="modaladd"
    title="记录客户信息"
    @on-ok="asyncOK"
    @on-cancel="cancel">
    <div class="form-con">

      <Form ref="formValidate" :model="formValidate" :rules="ruleValidate" :label-width="80">
        <FormItem label="客户类型" prop="buytype">
          <Select v-model="formValidate.buytype" placeholder="">
            <Option value="0">一般客户</Option>
            <Option value="1">预购客户</Option>
            <Option value="2">购房客户</Option>
          </Select>
        </FormItem>
        <FormItem label="客户姓名" prop="buyname">
          <Input v-model="formValidate.buyname" placeholder="输入客户姓名"></Input>
        </FormItem>
        <FormItem label="客户身份证" prop="buysti">
          <Input v-model="formValidate.buysti" placeholder="输入客户身份证号"></Input>
        </FormItem>

        <FormItem label="客户户籍" prop="buyhj">
          <Input v-model="formValidate.buyhj" placeholder="输入客户户籍"></Input>
        </FormItem>
        <FormItem label="客户收入" prop="buyincome">
          <Input v-model="formValidate.buyincome" placeholder="输入客户年收入"></Input>
        </FormItem>
        <FormItem label="联系方式" prop="buyphone">
          <Input v-model="formValidate.buyphone" placeholder="输入客户联系方式"></Input>
        </FormItem>
        <FormItem label="房屋id" prop="houseid">
          <Input v-model="formValidate.houseid" placeholder="输入购买房屋id"></Input>
        </FormItem>

        <FormItem label="Date">
          <Row>
            <Col span="11">
              <FormItem prop="date">
                <DatePicker type="date" placeholder="选择日期" v-model="formValidate.date"></DatePicker>
              </FormItem>
            </Col>
            <Col span="2" style="text-align: center">-</Col>
            <Col span="11">
              <FormItem prop="time">
                <TimePicker type="time" placeholder="选择时间" v-model="formValidate.time"></TimePicker>
              </FormItem>
            </Col>
          </Row>
        </FormItem>
        <FormItem label="备注" prop="buydesc">
          <Input v-model="formValidate.buydesc" type="textarea" :autosize="{minRows: 2,maxRows: 5}" placeholder="请输入详情"></Input>
        </FormItem>
        <FormItem>
          <Button type="primary" @click="handleSubmit('formValidate')">提交</Button>
          <Button type="ghost" @click="handleReset('formValidate')" style="margin-left: 8px">重置</Button>
        </FormItem>
      </Form>



    </div>


  </Modal>



<div id="addbuyer">
  <template>
    <Button type="primary" @click="modaladd = true">新增</Button>

  </template>
</div>


    <div>
      <Table stripe :columns="columns1" :data="rows"></Table>
    </div>
    <div>
      <Page :style="{textAlign:'center',marginTop:'10px'}":total="total" :page-size-opts="page_opts" :current="page" :page-size="page_size"
            v-on:on-change="pageChange" v-on:on-page-size-change="pageSizeChange"
            show-sizer show-total show-elevator></Page>
    </div>


  </div>
</template>

<script>
    export default {
        name: "generalbuyer",
      data () {
        return {
          formValidate: {
            buyname: '',
            buysti: '',
            buytype: '',
            date: '',
            time: '',
            buydesc: '',
            houseid:'',
            buyincome:'',
            buyhj:'',
            buyphone:'',
          },
          ruleValidate: {
            buyname: [
              { required: true, message: '姓名不能为空', trigger: 'blur' }
            ],
            buytype: [
              { required: true, message: '选择客户类型', trigger: 'change' }
            ],
            buydesc: [
              { required: true, message: '请输入备注信息', trigger: 'blur' },
              { type: 'string', min: 10, message: '请输入至少10个字', trigger: 'blur' }
            ],

          },
          total:100,
          page:1,
          page_size:10,
          page_opts:[10,20,50],
          buytype:0,
          rows:[],
          modaladd: false,
          columns1: [
            {
              title: 'ID',
              key: 'id'
            },
            {
              title: '客户姓名',
              key: 'buyname'
            },
            {
              title: '客户身份证',
              key: 'buysti'
            },
            {
              title: '来访日期',
              key: 'buydate',
              width: 150,
              render: function (h, params) {
                return h('div',
                  new Date(this.row.buydate).Format('yyyy-MM-dd hh:mm'));/*这里的this.row能够获取当前行的数据*/
              }
            },
            {
              title: '房屋id',
              key: 'houseid'
            },
            {
              title: '客户收入',
              key: 'buyincome'
            },
            {
              title: '客户户籍',
              key: 'buyhj'
            },
            {
              title: '客户联系方式',
              key: 'buyphone'
            },
            {
              title: '备注',
              key: 'buydesc'
            },
            {
              title: 'Action',
              key: 'action',
              width: 150,
              align: 'center',
              render: (h, params) => {
                return h('div', [
                  h('Button', {
                    props: {
                      type: 'error',
                      size: 'small'
                    },
                    on: {
                      click: () => {
                        this.remove(params)
                      }
                    }
                  }, '删除')
                ]);
              }
            }
          ],


        }
      },

      created: function () {
        this.initFormatter();                  // 为Date 对象添加Format方法
      },
      methods: {
        pageChange:function (e) {

          this.axios.get("api/buyer/queryAllByType",{
            params: {
              pageNum:e,
              pageSize:this.page_size,
              buytype:0
            }
          }).then(response => {

            this.rows=response.data.list;
            this.total=response.data.total;
          })


        },
        pageSizeChange:function (e) {
          this.axios.get("api/buyer/queryAllByType",{
            params: {
              pageNum:this.page,
              pageSize:e,
              buytype:0
            }
          }).then(response => {

            this.rows=response.data.list;
            this.total=response.data.total;
          })

        },

        remove (params) {
          console.log(params);
          this.axios.delete("api/buyer/deleteByPrimaryKey",{
            params: {
              id:params.row.id
            }
          }).then(response => {
            this.axios.get("api/buyer/queryAllByType",{
              params: {
                pageNum:1,
                pageSize:10,
                buytype:0
              }

            })
              .then(response => {

                this.rows=response.data.list;
                this.total=response.data.total;
              })

          })

        },

        initFormatter(){
          Date.prototype.Format = function(fmt) { //
            let o = {
              "M+" : this.getMonth()+1,                 //月份
              "d+" : this.getDate(),                    //日
              "h+" : this.getHours(),                   //小时
              "m+" : this.getMinutes(),                 //分
              "s+" : this.getSeconds(),                 //秒
              "q+" : Math.floor((this.getMonth()+3)/3), //季度
              "S"  : this.getMilliseconds()             //毫秒
            };
            if(/(y+)/.test(fmt))
              fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length));
            for(var k in o)
              if(new RegExp("("+ k +")").test(fmt))
                fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));
            return fmt;
          }
        },


        asyncOK () {

        },

        cancel () {

        },

          handleSubmit (name) {
            this.$refs[name].validate((valid) => {
              if (valid) {
               console.log(new Date(this.formValidate.date).Format('yyyy-MM-dd ')+this.formValidate.time);
                this.axios.post("api/buyer/insert",{

                    buyname:this.formValidate.buyname,
                    buysti:this.formValidate.buysti,
                    buydate:new Date(new Date(this.formValidate.date).Format('yyyy-MM-dd ')+this.formValidate.time).getTime(),
                    houseid:this.formValidate.houseid,
                    buyincome:this.formValidate.buyincome,
                    buydesc:this.formValidate.buydesc,
                    buyhj:this.formValidate.buyhj,
                    buyphone:this.formValidate.buyphone,
                    buytype:this.formValidate.buytype,

                }).then(response => {
                  this.modaladd=false;
                  this.axios.get("api/buyer/queryAllByType",{
                    params: {
                      pageNum:1,
                      pageSize:10,
                      buytype:0
                    }
                  }).then(response => {

                    this.rows=response.data.list;
                    this.total=response.data.total;
                  })
                })

              } else {
                this.$Message.error('Fail!');

              }
            })
          },
          handleReset (name) {
            this.$refs[name].resetFields();

          }


      }

    }
</script>

<style scoped>

</style>
