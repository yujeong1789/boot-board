import { createApp } from 'vue';
import App from './App.vue';
import { createRouter, createWebHistory } from 'vue-router';
import axios from 'axios';

import Home from '@/pages/Home';
import Login from '@/pages/Login';

axios.defaults.baseURL = 'http://localhost:8081';

const routes = [
    // root 경로로 들어오면 Home 페이지 내보내기
    { path: '/', component: Home },
    { path: '/login', component: Login }
];

const router = createRouter({
    history: createWebHistory(),
    routes
});

const app = createApp(App);
app.config.globalProperties.axios = axios;
app.use(router).mount('#app');