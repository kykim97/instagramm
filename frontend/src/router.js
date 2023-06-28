
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import PostManager from "./components/listers/PostCards"
import PostDetail from "./components/listers/PostDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/posts',
                name: 'PostManager',
                component: PostManager
            },
            {
                path: '/posts/:id',
                name: 'PostDetail',
                component: PostDetail
            },



    ]
})
