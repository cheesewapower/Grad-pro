<template>
  <Page :total="100" show-sizer></Page>
</template>

<script>
    export default {
        name: "staff"
    }
    getFound:function () {
      Vue.axios.get('pro/user/getUserByUserName?id=1').then((response) => {
        console.log(response.data)
      })
    }
</script>

<style scoped>

</style>
