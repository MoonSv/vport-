import Vue from 'vue'
import Router from 'vue-router'
import Homepage from '@/components/Homepage'
import CourseForm from '@/components/CourseForm'
import ClassForm from '@/components/ClassForm'

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
      ]
    }
  ]
})
