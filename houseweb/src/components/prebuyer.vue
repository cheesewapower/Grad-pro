<template>
  <div>
    <div>
      <Header :style="{background: '#fff', boxShadow: '0 2px 3px 2px rgba(0,0,0,.1)'}">
        <div :style= "{fontSize:'16px'}"   class="title">

          <span>预购客户管理</span>
        </div>
      </Header>
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
    name: "prebuyer",
    data () {
      return {
        total:100,
        page:1,
        page_size:10,
        page_opts:[10,20,50],
        buytype:0,
        rows:[],
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
            title: '购买日期',
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
            buytype:1
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
            buytype:1
          }
        }).then(response => {

          this.rows=response.data.list;
          this.total=response.data.total;
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
      }
    }

  }
</script>

<style scoped>

</style>
