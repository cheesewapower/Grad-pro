<template>
  <div>
    <div>
      <Header :style="{background: '#fff', boxShadow: '0 2px 3px 2px rgba(0,0,0,.1)'}">
        <div :style="{fontSize:'16px'}" class="title">

          <span>房屋管理</span>
        </div>
      </Header>
    </div>
    <div>
      <Modal
        v-model="modaladd"
        title="添加房屋"
        :mask-closable="false"
      >
        <div class="form-con">
          <Form ref="formValidate" :model="formValidate" :rules="ruleValidate" :label-width="80">

            <FormItem label="所属楼房" prop="buildingid">
              <Input v-model="formValidate.buildingid" placeholder="输入所属楼房"></Input>
            </FormItem>
            <FormItem label="房屋编号" prop="housesn">
              <Input v-model="formValidate.housesn" placeholder="输入房屋编号"></Input>
            </FormItem>
            <FormItem label="房屋剩余年限" prop="houseyear">
              <Input v-model="formValidate.houseyear" placeholder="输入房屋剩余年限"></Input>
            </FormItem>
            <FormItem label="房屋面积" prop="housesize">
              <Input v-model="formValidate.housesize" placeholder="输入房屋面积"></Input>
            </FormItem>
            <FormItem label="房产证号" prop="housecq">
              <Input v-model="formValidate.housecq" placeholder="输入房产证号"></Input>
            </FormItem>
            <FormItem label="房屋价格" prop="houseprice">
              <Input v-model="formValidate.houseprice" placeholder="输入房屋价格"></Input>
            </FormItem>
          </Form>

        </div>
        <div slot="footer">
          <Button type="primary" @click="handleSubmit('formValidate')">提交</Button>
          <Button type="ghost" @click="handleReset('formValidate')" style="margin-left: 8px">重置</Button>
        </div>

      </Modal>
    </div>



    <div id="addstaff">
      <Button type="primary" @click="modaladd = true">新增</Button>
    </div>
    <div>
      <Table stripe :columns="columns1" :data="rows"></Table>

    </div>


    <div>
      <Page :style="{textAlign:'center',marginTop:'10px'}" :total="total" :page-size-opts="page_opts" :current="page"
            :page-size="page_size"
            v-on:on-change="pageChange" v-on:on-page-size-change="pageSizeChange"
            show-sizer show-total show-elevator></Page>


    </div>


  </div>
</template>

<script>
  export default {
    name: "buyer",
    data() {
      return {
        formValidate: {
          buildingid: '',
          housesn: '',
          houseyear: '',
          housesize: '',
          housecq: '',
          houseprice: '',
          housestatus:0,
        },
        ruleValidate: {
          buildingid: [
            { required: true, message: '所属楼盘不能为空', trigger: 'blur' }
          ],
          housesn: [
            { required: true, message: '房屋编号不能为空', trigger: 'blur' }
          ],
          houseyear: [
            { required: true, message: '房屋年限不能为空', trigger: 'blur' },

          ],
          housesize: [
            { required: true, message: '房屋面积不能为空', trigger: 'blur' },

          ],
          housecq: [
            { required: true, message: '房产证号不能为空', trigger: 'blur' },

          ],
          houseprice: [
            { required: true, message: '房屋面积不能为空', trigger: 'blur' },

          ],

        },
        modaladd: false,
        total: 100,
        page: 1,
        page_size: 10,
        page_opts: [10, 20, 50],
        rows: [],
        columns1: [
          {
            title: 'ID',
            key: 'id'
          },
          {
            title: '房屋编号',
            key: 'housesn'
          },
          {
            title: '房屋年限',
            key: 'houseyear'
          },
          {
            title: '房屋面积',
            key: 'housesize'
          },
          {
            title: '房产证号',
            key: 'housecq'
          },
          {
            title: '房屋状态',
            key: 'housestatus',
            render: (h, params) => {
              let _this = this;
              let texts = '';
              if (params.row.housestatus == 0) {
                texts = "待售中"
              } else if (params.row.housestatus == 1) {
                texts = "已售出"
              }
              return h('div', {
                props: {},
              }, texts)
            }
          },
          {
            title: '房屋售价',
            key: 'houseprice'
          },
          {
            title: '所属楼盘',
            key: 'buildingid'
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
                    type: 'primary',
                    size: 'small'
                  },
                  style: {
                    marginRight: '5px'
                  },
                  on: {}
                }, '编辑'),
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
      this.axios.get("api/house/findAllByPage", {
        params: {
          pageNum: 1,
          pageSize: 10
        }

      })
        .then(response => {
          console.log(response);
          this.rows = response.data.list;
          this.total = response.data.total;
        })
    },
    methods: {
      pageChange: function (e) {

        this.axios.get("api/house/findAllByPage", {
          params: {
            pageNum: e,
            pageSize: this.page_size
          }
        }).then(response => {
          this.rows = response.data.list;
          this.total = response.data.total;
        })


      },
      pageSizeChange: function (e) {
        this.axios.get("api/house/findAllByPage", {
          params: {
            pageNum: this.page,
            pageSize: e
          }
        }).then(response => {
          this.rows = response.data.list;
          this.total = response.data.total;
        })

      },

      remove(params) {
        console.log(params);
        this.axios.delete("api/house/deleteByPrimaryKey", {
          params: {
            id: params.row.id
          }
        }).then(response => {
          this.axios.get("api/house/findAllByPage", {
            params: {
              pageNum: 1,
              pageSize: 10
            }

          })
            .then(response => {
              console.log(response);
              this.rows = response.data.list;
              this.total = response.data.total;
            })

        })

      },

      handleSubmit (name) {
        this.$refs[name].validate((valid) => {
          if (valid) {
            this.axios.post("api/house/insertSelective", {
              buildingid: this.formValidate.buildingid,
              housesn: this.formValidate.housesn,
              houseyear: this.formValidate.houseyear,
              housesize: this.formValidate.housesize,
              housecq: this.formValidate.housecq,
              houseprice: this.formValidate.houseprice,
              housestatus:0,
            }).then(response => {
              this.modaladd=false;
              this.axios.get("api/house/findAllByPage", {
                params: {
                  pageNum: 1,
                  pageSize: 10
                }
              })
                .then(response => {
                  this.rows = response.data.list;
                  this.total = response.data.total;
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
