<template>

  <div>
    <div>
      <Header :style="{background: '#fff', boxShadow: '0 2px 3px 2px rgba(0,0,0,.1)'}">
        <div :style="{fontSize:'16px'}" class="title">

          <span>员工管理</span>
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
    name: "staff",
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
          console.log(response.data.list[0].staffname);
          console.log(response);
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


    }

  }
</script>

<style scoped>

</style>
