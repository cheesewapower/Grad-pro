<template>
  <div>
    <div>

    </div>

    <div>
      <Header :style="{background: '#fff', boxShadow: '0 2px 3px 2px rgba(0,0,0,.1)'}">
        <div :style= "{fontSize:'16px'}"   class="title">

          <span>统计报表</span>
        </div>
      </Header>
    </div>

    <div>
      <Affix :offset-top="65" style="padding: 0">
        <div class="search">
          <Row>
            <Col :xs="24" :sm="12" :md="6" :lg="6">
              <Select v-model="model1" style="width:200px" placeholder="请选择报表类型" size="small">
                <Option v-for="item in List" :value="item.value" :key="item.value">{{ item.label }}</Option>
              </Select>
            </Col>
            <Col :xs="24" :sm="12" :md="6" :lg="6">
              <DatePicker v-model="startDate" type="date" size="small" placeholder="开始日期"
                          style="width: 150px"></DatePicker>
            </Col>
            <Col :xs="24" :sm="12" :md="6" :lg="6">
              <DatePicker v-model="endDate" type="date" size="small" placeholder="结束日期"
                          style="width: 150px"></DatePicker>
            </Col>
            <Col :xs="24" :sm="12" :md="6" :lg="6">
              <Button size="small" shape="circle" icon="calculator" @click="search"
                      :disabled="model1.trim().length==0||startDate.length==0||endDate.length==0">生成数据
              </Button>

            </Col>
          </Row>
        </div>
      </Affix>
    </div>

    　　　　　
    <div>
      <Row>
        <Col span="18">
          <Table stripe :columns="columns1" :data="rows" stripe ref="table2image"></Table>
        </Col>
        <Col span="6" class="padding-left-20">
          <div id="showImage" class="margin-bottom-10">
            <span>输入文件名：</span>
            <Input v-model="imageName" icon="document" placeholder="请输入图片名" style="width: 190px"/>
          </div>
          <Button id = "button2" type="primary" @click="exportImage">导出表格为图片</Button>
          <div id="showImage2" class="show-image margin-top-20">
            <img id="exportedImage" />
          </div>
        </Col>

      </Row>
    </div>

  </div>
</template>

<script>
  export default {
    name: "statistics",
    data() {
      return {
        imageName:'',
        startDate: '',
        endDate: '',
        rows: [],
        List: [
          {
            value: 'New York',
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
        model1: '',
        rows: [],
        columns1: [
          {
            title: '房屋累计销量',
            key: 'count'
          },
          {
            title: '总计金额',
            key: 'sum'
          },

        ],
      }
    },
    created: function () {

      this.initFormatter();                  // 为Date 对象添加Format方法

    },
    methods: {
      search() {

        console.log(new Date(this.startDate).Format('yyyy-MM-dd '));
        let params = {}
        if (this.startDate instanceof Date) {
          params.startDate = this.startDate.getTime()
        }
        if (this.endDate instanceof Date) {
          params.endDate = this.endDate.getTime()
        }
        this.axios.get("api/house/statistics", {
          params: {
            startDate: new Date(this.startDate).Format('yyyy-MM-dd '),
            endDate: new Date(this.endDate).Format('yyyy-MM-dd '),
          }

        })
          .then(response => {
            console.log(response);
            this.rows.push(response.data)

          })

      },

      initFormatter() {
        Date.prototype.Format = function (fmt) { //
          let o = {
            "M+": this.getMonth() + 1,                 //月份
            "d+": this.getDate(),                    //日
            "h+": this.getHours(),                   //小时
            "m+": this.getMinutes(),                 //分
            "s+": this.getSeconds(),                 //秒
            "q+": Math.floor((this.getMonth() + 3) / 3), //季度
            "S": this.getMilliseconds()             //毫秒
          };
          if (/(y+)/.test(fmt))
            fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
          for (var k in o)
            if (new RegExp("(" + k + ")").test(fmt))
              fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
          return fmt;
        }
      },
      exportImage () {

      }

    }

  }
</script>

<style scoped>
  .search {
    padding: 5px;
    background-color: lightskyblue;
    opacity: 99%;
  }

  #showImage{
    padding: 20px;
  }

</style>
