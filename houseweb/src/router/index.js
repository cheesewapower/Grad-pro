import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import axios from 'axios'
import VueAxios from 'vue-axios'
import staff from '@/components/staff'
import house from '@/components/house'
import login from '@/components/login'
import soldhouse from '@/components/soldhouse'
import sellinghouse from '@/components/sellinghouse'

import generalbuyer from '@/components/generalbuyer'
import prebuyer from '@/components/prebuyer'
import buyer from '@/components/buyer'

import statistics from '@/components/statistics'

Vue.use(Router)
Vue.use(VueAxios, axios)


const router = new Router({

  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld,
      children: [
        { path: 'staff', title: '权限管理', name: 'staff', component: staff },
        { path: 'house', title: '权限管理', name: 'house', component: house },
        { path: 'generalbuyer', title: '一般客户', name: 'generalbuyer', component: generalbuyer },
        { path: 'prebuyer', title: '预购客户', name: 'prebuyer', component: prebuyer },
        { path: 'buyer', title: '购房客户', name: 'buyer', component: buyer },
        { path: 'sellinghouse', title: '权限管理', name: 'sellinghouse', component: sellinghouse },
        { path: 'soldhouse', title: '权限管理', name: 'soldhouse', component: soldhouse },
        { path: 'statistics', title: '统计报表', name: 'statistics', component: statistics },
      ]
    },
    {
      path: '/login',
      name: 'login',
      component: login
    },

  ]

})
router.beforeEach((to, from, next) => {
  next();
})


export default router




