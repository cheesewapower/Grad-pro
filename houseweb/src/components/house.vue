<template>
  <div>
    <div>
      <Header :style="{background: '#fff', boxShadow: '0 2px 3px 2px rgba(0,0,0,.1)'}">
        <div :style="{fontSize:'16px'}" class="title">

          <span>房屋管理</span>
        </div>
      </Header>
    </div>
    <div id="addstaff">
      <Button type="primary" v-on:click="add">新增</Button>
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
                  on: {
                    click: () => {
                      this.show(params.index)
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

      }


    }

  }
</script>

<style scoped>

</style>
