import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import axios from 'axios'
import VueAxios from 'vue-axios'
import staff from '@/components/staff'
import buyer from '@/components/buyer'

Vue.use(Router)
Vue.use(VueAxios, axios)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld,
      children: [
        { path: 'staff', title: '权限管理', name: 'staff', component: staff },
        { path: 'buyer', title: '权限管理', name: 'buyer', component: buyer }
      ]
    }
  ]
})


