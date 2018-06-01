<template>
<div>
      <div>
        <Select v-model="model1" style="width:200px">
          <Option v-for="item in List" :value="item.value" :key="item.value">{{ item.label }}</Option>
        </Select>
      </div>



</div>
</template>

<script>
    export default {
        name: "statistics",
      data () {
        return {
          List: [
            {
              value: '',
              label: '销售情况汇总表'
            },
            {
              value: 'London',
              label: '销售情况明细表'
            },
            {
              value: 'Sydney',
              label: '销售情况汇总表（客户）'
            },
            {
              value: 'Ottawa',
              label: '销售情况排行榜'
            },

          ],
          model1: ''
        }
      }
    }
</script>

<style scoped>

</style>
