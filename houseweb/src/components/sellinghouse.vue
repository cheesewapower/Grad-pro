<template>
  <div>
    <div>
      <Header :style="{background: '#fff', boxShadow: '0 2px 3px 2px rgba(0,0,0,.1)'}">
        <div :style= "{fontSize:'16px'}"   class="title">

          <span>待售房屋信息</span>
        </div>
      </Header>
    </div>

    <div>
      <Affix :offset-top="65" style="padding: 0">
        <div class="search" >
          <Row>
            <Col :xs="24" :sm="12" :md="6" :lg="6">
              <Input v-model="keyword" size="small" placeholder="请输入房屋编号" style="width: 150px"></Input>
            </Col>
            <Col :xs="24" :sm="12" :md="6" :lg="6">
              <Button  size="small" shape="circle" icon="ios-search" @click="search"
                      :disabled="keyword.trim().length==0">搜索
              </Button>
              <Button style="margin-left: 5px" type="ghost" size="small" shape="circle"  @click="cancel">取消
              </Button>
            </Col>
          </Row>
        </div>
      </Affix>
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

    name: "sellinghouse",
    data () {
      return {

        total:100,
        page:1,
        page_size:10,
        page_opts:[10,20,50],
        rows:[],
        keyword:'',
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
            title: '房屋售价',
            key: 'houseprice'
          },
          {
            title: '所属楼盘',
            key: 'buildingid',

          },


        ],



      }
    },
    created: function () {
      this.axios.get("api/house/querySellingByPage",{
        params: {
          pageNum:1,
          pageSize:10
        }

      })
        .then(response => {
          console.log(response);
          this.rows=response.data.list;
          this.total=response.data.total;
        })
    },
    methods: {
      pageChange:function (e) {

        this.axios.get("api/house/querySellingByPage",{
          params: {
            pageNum:e,
            pageSize:this.page_size
          }
        }).then(response => {
          this.rows=response.data.list;
          this.total=response.data.total;
        })


      },
      pageSizeChange:function (e) {
        this.axios.get("api/house/querySellingByPage",{
          params: {
            pageNum:this.page,
            pageSize:e
          }
        }).then(response => {
          this.rows=response.data.list;
          this.total=response.data.total;
        })

      },
      search(){
         console.log(this.keyword);
        this.axios.get("api/house/searchSellingHouse",{
          params: {
            pageNum:1,
            pageSize:10,
            keyword:this.keyword
          }

        })
          .then(response => {

            this.rows=response.data.list;
            this.total=response.data.total;
          })

      },
      cancel(){
        this.keyword= '';
        this.axios.get("api/house/querySellingByPage",{
          params: {
            pageNum:1,
            pageSize:10
          }

        })
          .then(response => {

            this.rows=response.data.list;
            this.total=response.data.total;
          })
      },




    }

  }
</script>

<style scoped>
  .search {
    padding: 5px;
    background-color: lightskyblue;
    opacity: 99%;
  }
</style>
