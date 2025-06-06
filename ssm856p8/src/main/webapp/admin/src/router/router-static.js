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
import adminexam from '@/views/modules/exampaperlist/exam'
    import kaoshiyuyue from '@/views/modules/kaoshiyuyue/list'
    import news from '@/views/modules/news/list'
    import examfailrecord from '@/views/modules/examfailrecord/list'
    import baomingrukou from '@/views/modules/baomingrukou/list'
    import discussjiakaowenzhang from '@/views/modules/discussjiakaowenzhang/list'
    import examquestion from '@/views/modules/examquestion/list'
    import discussbaomingrukou from '@/views/modules/discussbaomingrukou/list'
    import liancheyuyue from '@/views/modules/liancheyuyue/list'
    import xueyuan from '@/views/modules/xueyuan/list'
    import xueyuanbaoming from '@/views/modules/xueyuanbaoming/list'
    import kaoshixinxi from '@/views/modules/kaoshixinxi/list'
    import exampaper from '@/views/modules/exampaper/list'
    import storeup from '@/views/modules/storeup/list'
    import kaoshichangci from '@/views/modules/kaoshichangci/list'
    import jiaxiao from '@/views/modules/jiaxiao/list'
    import kaoshichangdi from '@/views/modules/kaoshichangdi/list'
    import jiakaowenzhang from '@/views/modules/jiakaowenzhang/list'
    import exampaperlist from '@/views/modules/exampaperlist/list'
    import jiazhaoleixing from '@/views/modules/jiazhaoleixing/list'
    import discusskaoshixinxi from '@/views/modules/discusskaoshixinxi/list'
    import config from '@/views/modules/config/list'
    import examrecord from '@/views/modules/examrecord/list'


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
    }
      ,{
	path: '/kaoshiyuyue',
        name: '考试预约',
        component: kaoshiyuyue
      }
      ,{
	path: '/news',
        name: '公告信息',
        component: news
      }
      ,{
	path: '/examfailrecord',
        name: '错题本',
        component: examfailrecord
      }
      ,{
	path: '/baomingrukou',
        name: '报名入口',
        component: baomingrukou
      }
      ,{
	path: '/discussjiakaowenzhang',
        name: '驾考文章评论',
        component: discussjiakaowenzhang
      }
      ,{
	path: '/examquestion',
        name: '试题管理',
        component: examquestion
      }
      ,{
	path: '/discussbaomingrukou',
        name: '报名入口评论',
        component: discussbaomingrukou
      }
      ,{
	path: '/liancheyuyue',
        name: '练车预约',
        component: liancheyuyue
      }
      ,{
	path: '/xueyuan',
        name: '学员',
        component: xueyuan
      }
      ,{
	path: '/xueyuanbaoming',
        name: '学员报名',
        component: xueyuanbaoming
      }
      ,{
	path: '/kaoshixinxi',
        name: '考试信息',
        component: kaoshixinxi
      }
      ,{
	path: '/exampaper',
        name: '试卷管理',
        component: exampaper
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/kaoshichangci',
        name: '考试场次',
        component: kaoshichangci
      }
      ,{
	path: '/jiaxiao',
        name: '驾校',
        component: jiaxiao
      }
      ,{
	path: '/kaoshichangdi',
        name: '考试场地',
        component: kaoshichangdi
      }
      ,{
	path: '/jiakaowenzhang',
        name: '驾考文章',
        component: jiakaowenzhang
      }
      ,{
	path: '/exampaperlist',
        name: '试卷列表',
        component: exampaperlist
      }
      ,{
	path: '/jiazhaoleixing',
        name: '驾照类型',
        component: jiazhaoleixing
      }
      ,{
	path: '/discusskaoshixinxi',
        name: '考试信息评论',
        component: discusskaoshixinxi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/examrecord',
        name: '理论考试记录',
        component: examrecord
      }
    ]
  },
  {
    path: '/adminexam',
    name: 'adminexam',
    component: adminexam,
    meta: {icon:'', title:'adminexam'}
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
