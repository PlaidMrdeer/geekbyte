<script setup>
import { ref } from "vue";
import axios from "axios";
const activeUsers = ref();

axios.get('http://localhost:8080/api/active-user').then(response => {activeUsers.value = response.data;})
</script>

<template>
    <div class="bg-white rounded-lg shadow p-4">
        <h3 class="font-bold text-lg mb-3">活跃用户</h3>
        <div class="space-y-4">
            <div v-for="user in activeUsers" :key="user.id" class="flex items-center space-x-3">
                <img :src="user.avatar" :alt="user.name" class="w-8 h-8 rounded-full" />
                <div>
                    <div class="font-medium">{{ user.name }}</div>
                    <div class="text-sm text-gray-500">
                      发帖 {{ user.postCount }} · 获赞 {{ user.likeCount }}
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>