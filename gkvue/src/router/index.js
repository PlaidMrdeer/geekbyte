import { createRouter, createWebHistory } from 'vue-router'
import Newest from '../components/Newest.vue'
import Popular from '../components/Popular.vue'
import Board from '../components/Board.vue'
import Extracts from '../components/Extracts.vue'
const router = createRouter({
    history: createWebHistory(import.meta.env.BASE_URL),
    routes: [
        {
            path: '/',
            name: 'Newest',
            component: Newest
        },
        {
            path: '/popular',
            name: 'Popular',
            component: Popular
        },
        {
            path: '/extracts',
            name: 'Extracts',
            component: Extracts
        },
        {
            path: '/board',
            name: 'Board',
            component: Board
        }
    ]
})

export default router