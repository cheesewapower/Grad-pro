<style scoped>
  .layout-con{
    height: 100%;
    width: 100%;
  }
  .menu-item span{
    display: inline-block;
    overflow: hidden;
    width: 69px;
    text-overflow: ellipsis;
    white-space: nowrap;
    vertical-align: bottom;
    transition: width .2s ease .2s;
  }
  .menu-item i{
    transform: translateX(0px);
    transition: font-size .2s ease, transform .2s ease;
    vertical-align: middle;
    font-size: 16px;
  }
  .collapsed-menu span{
    width: 0px;
    transition: width .2s ease;
  }
  .collapsed-menu i{
    transform: translateX(5px);
    transition: font-size .2s ease .2s, transform .2s ease .2s;
    vertical-align: middle;
    font-size: 22px;
  }
</style>
<template>
  <div class="layout">
    <Layout :style="{minHeight: '100vh'}">

      <Sider hide-trigger :style="{background: '#fff'}">
        <Menu active-name="1-2" theme="light" width="auto" :open-names="['1']">
          <Submenu name="1">
            <template slot="title">
              <Icon type="ios-navigate"></Icon>
              基本资料
            </template>
            <router-link to="/staff"><MenuItem name="1-1">员工管理</MenuItem></router-link>
            <router-link to="/house"><MenuItem name="1-2">房屋管理</MenuItem></router-link>

          </Submenu>
          <Submenu name="2">
            <template slot="title">
              <Icon type="ios-keypad"></Icon>
              客户关系
            </template>
            <MenuItem name="2-1">一般客户</MenuItem>
            <MenuItem name="2-2">预约客户</MenuItem>
            <MenuItem name="2-3">购房客户</MenuItem>
          </Submenu>
          <Submenu name="3">
            <template slot="title">
              <Icon type="ios-analytics"></Icon>
              房屋销售
            </template>
            <MenuItem name="3-1">Option 1</MenuItem>
            <MenuItem name="3-2">Option 2</MenuItem>
          </Submenu>
        </Menu>
      </Sider>


      <Layout>
        <Header :style="{background: '#fff', boxShadow: '0 2px 3px 2px rgba(0,0,0,.1)'}">
          <div :style= "{fontSize:'24px'}"   class="title">
          <Icon type="navicon"></Icon>
          <span>房屋销售管理系统</span>
          </div>
        </Header>
        <Content :style="{padding: '0 16px 16px'}">
          <Breadcrumb :style="{margin: '16px 0'}">

          </Breadcrumb>
          <Card>

            <div style="height: 600px"> <router-view></router-view></div>


          </Card>
        </Content>
      </Layout>
    </Layout>
  </div>
</template>
<script>
  export default {
    data () {
      return {
        isCollapsed: false
      };
    },
    computed: {
      menuitemClasses: function () {
        return [
          'menu-item',
          this.isCollapsed ? 'collapsed-menu' : ''
        ]
      }
    }
  }
</script>
