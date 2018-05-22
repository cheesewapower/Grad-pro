<template>
<div>
    <div>
      <Table stripe :columns="columns1" :data="rows"></Table>

    </div>


    <div>
      <Page :style="{textAlign:'center',marginTop:'10px'}":total="total" :page-size-opts="page_opts" :current="page" :page-size="page_size"

            show-sizer show-total show-elevator></Page>


    </div>







</div>
</template>

<script>
    export default {
        name: "buyer",
        data () {
        return {
          total:100,
          page:1,
          page_size:10,
          page_opts:[10,20,50],
          rows:[],
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
              key: 'housestatus'
            },
            {
              title: '房屋售价',
              key: 'houseprice'
            },
            {
              title: '所属楼盘',
              key: 'buildingid'
            }
          ],
          created: function () {
            this.axios.get("api/house/findAllByPage",{
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


          }


        }
      },
    }
</script>

<style scoped>

</style>
