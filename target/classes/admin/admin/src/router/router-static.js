import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import dictionary from '@/views/modules/dictionary/list'
    import jiaolian from '@/views/modules/jiaolian/list'
    import jiarudeqiudui from '@/views/modules/jiarudeqiudui/list'
    import news from '@/views/modules/news/list'
    import qiudui from '@/views/modules/qiudui/list'
    import shoufamingdan from '@/views/modules/shoufamingdan/list'
    import xunlianjihua from '@/views/modules/xunlianjihua/list'
    import xunlianjindu from '@/views/modules/xunlianjindu/list'
    import xunliankaoqin from '@/views/modules/xunliankaoqin/list'
    import yonghu from '@/views/modules/yonghu/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionaryQiudui from '@/views/modules/dictionaryQiudui/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryNews',
        name: '公告类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionaryQiudui',
        name: '球队类型',
        component: dictionaryQiudui
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }


    ,{
        path: '/dictionary',
        name: '字典表',
        component: dictionary
      }
    ,{
        path: '/jiaolian',
        name: '教练',
        component: jiaolian
      }
    ,{
        path: '/jiarudeqiudui',
        name: '加入的球队',
        component: jiarudeqiudui
      }
    ,{
        path: '/news',
        name: '公告信息',
        component: news
      }
    ,{
        path: '/qiudui',
        name: '球队信息',
        component: qiudui
      }
    ,{
        path: '/shoufamingdan',
        name: '比赛首发名单',
        component: shoufamingdan
      }
    ,{
        path: '/xunlianjihua',
        name: '训练计划',
        component: xunlianjihua
      }
    ,{
        path: '/xunlianjindu',
        name: '训练进度',
        component: xunlianjindu
      }
    ,{
        path: '/xunliankaoqin',
        name: '考勤信息',
        component: xunliankaoqin
      }
    ,{
        path: '/yonghu',
        name: '球员',
        component: yonghu
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
