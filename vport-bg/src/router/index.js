import Vue from 'vue'
import Router from 'vue-router'
import Homepage from '@/components/Homepage'
import CourseForm from '@/components/Course/CourseForm'
import ClassForm from '@/components/Class/ClassForm'
import CourseList from '@/components/Course/CourseList'
import ClassList from '@/components/Class/ClassList'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Homepage',
      component: Homepage,
      children: [
        {
          path: 'crsform',
          name: 'CourseForm',
          component: CourseForm
        },
        {
          path: 'clsform',
          name: 'ClassForm',
          component: ClassForm
        },
        {
          path: 'crsList',
          name: 'CourseList',
          component: CourseList
        },
        {
          path: 'clsList',
          name: 'ClassList',
          component: ClassList
        },
      ]
    }
  ]
})
