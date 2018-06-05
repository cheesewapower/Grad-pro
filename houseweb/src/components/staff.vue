<template>

  <div>
    <div>
      <Header :style="{background: '#fff', boxShadow: '0 2px 3px 2px rgba(0,0,0,.1)'}">
        <div :style="{fontSize:'16px'}" class="title">

          <span>员工管理</span>
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
            <FormItem label="员工姓名" prop="staffname">
              <Input v-model="formValidate.staffname" placeholder="输入员工姓名"></Input>
            </FormItem>
            <FormItem label="员工所属部门" prop="staffde">
              <Input v-model="formValidate.staffde" placeholder="输入员工所属部门"></Input>
            </FormItem>
            <FormItem label="员工工资" prop="staffmoney">
              <Input v-model="formValidate.staffmoney" placeholder="输入员工工资"></Input>
            </FormItem>
            <FormItem label="员工等级" prop="stafflever">
              <Input v-model="formValidate.stafflever" placeholder="输入员工等级"></Input>
            </FormItem>
            <FormItem label="员工描述" prop="staffdesc">
              <Input v-model="formValidate.staffdesc" placeholder="输入员工描述"></Input>
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
    name: "staff",
    data() {
      return {formValidate: {
          staffname:'',
          staffde:'',
          staffmoney:'',
          stafflever:'',
          staffdesc:'',
        },
        ruleValidate: {
          staffname: [
            { required: true, message: '员工姓名不能为空', trigger: 'blur' }
          ],
          staffde: [
            { required: true, message: '员工所属部门不能为空', trigger: 'blur' }
          ],
          staffmoney: [
            { required: true, message: '员工工资不能为空', trigger: 'blur' },
          ],
          stafflever: [
            { required: true, message: '员工等级不能为空', trigger: 'blur' },
          ],

        },
        modaladd:false,
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
            title: '员工姓名',
            key: 'staffname'
          },
          {
            title: '员工所属部门',
            key: 'staffde'
          },
          {
            title: '年工资',
            key: 'staffmoney'
          },
          {
            title: '员工级别',
            key: 'stafflever'
          },
          {
            title: '员工描述',
            key: 'staffdesc'
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
                  on: {
                    click: () => {

                    }
                  }
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
      this.axios.get("api/staff/findAllByPage", {
        params: {
          pageNum: 1,
          pageSize: 10
        }

      })
        .then(response => {
          this.rows = response.data.list;
          this.total = response.data.total;
        })
    },

    methods: {
      pageChange: function (e) {

        this.axios.get("api/staff/findAllByPage", {
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
        this.axios.get("api/staff/findAllByPage", {
          params: {
            pageNum: this.page,
            pageSize: e
          }
        }).then(response => {

          this.rows = response.data.list;
          this.total = response.data.total;
        })

      },
      handleSubmit (name) {
        this.$refs[name].validate((valid) => {
          if (valid) {
            this.axios.post("api/staff/insertSelective", {
              staffname:this.formValidate.staffname,
              staffde:this.formValidate.staffde,
              staffmoney:this.formValidate.staffmoney,
              stafflever:this.formValidate.stafflever,
              staffdesc:this.formValidate.staffdesc,
            }).then(response => {
              this.modaladd=false;
              this.axios.get("api/staff/findAllByPage", {
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

      },
      remove(params) {
        this.axios.delete("api/staff/deleteByPrimaryKey", {
          params: {
            id: params.row.id
          }
        }).then(response => {
          this.axios.get("api/staff/findAllByPage", {
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

      },


    }

  }
</script>

<style scoped>

</style>
