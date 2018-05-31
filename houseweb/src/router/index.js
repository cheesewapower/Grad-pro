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
        { path: 'sellinghouse', title: '权限管理', name: 'sellinghouse', component: sellinghouse },
        { path: 'soldhouse', title: '权限管理', name: 'soldhouse', component: soldhouse },
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




