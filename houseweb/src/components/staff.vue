<template>

<div>



    <div>
      <Table stripe :columns="columns1" :data="data1"></Table>


    </div>



</div>

</template>


<script>
    export default {
        name: "staff",
      data () {
        return {
          columns1: [
            {
              title: 'Name',
              key: 'name'
            },
            {
              title: 'Age',
              key: 'age'
            },
            {
              title: 'Address',
              key: 'address'
            }
          ],
          data1: [
            {
              name: 'John Brown',
              age: 18,
              address: 'New York No. 1 Lake Park',
              date: '2016-10-03'
            },
            {
              name: 'Jim Green',
              age: 24,
              address: 'London No. 1 Lake Park',
              date: '2016-10-01'
            },
            {
              name: 'Joe Black',
              age: 30,
              address: 'Sydney No. 1 Lake Park',
              date: '2016-10-02'
            },
            {
              name: 'Jon Snow',
              age: 26,
              address: 'Ottawa No. 2 Lake Park',
              date: '2016-10-04'
            }
          ]
        }
      },
      mounted() {
        this.axios.get("api/user/getUserByUserName?id=1")
          .then(response => {
            this.results = response.data.user
            console.log(response);
          })
      }
    }
</script>

<style scoped>

</style>
