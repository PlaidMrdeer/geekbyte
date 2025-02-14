<script setup>
import { ref } from 'vue';
import axios from "axios";
const communityCount = ref({
  register: 0,
  post: 0,
  onlineRegister: 0,
  onlineTravelers: 0,
});

axios.get('http://localhost:8080/api/community-count').then(response => {communityCount.value = response.data;})
</script>

<template>
    <div class="bg-white rounded-lg shadow p-4 mb-4" v-if="communityCount">
        <h3 class="font-bold text-lg mb-3">社区统计</h3>
        <div class="space-y-2">
            <div class="flex justify-between">
                <span class="text-gray-600">注册用户</span>
                <span class="font-medium">{{ communityCount.register }}</span>
            </div>
            <div class="flex justify-between">
                <span class="text-gray-600">帖子</span>
                <span class="font-medium">{{ communityCount.post }}</span>
            </div>
            <div class="flex justify-between">
                <span class="text-gray-600">在线注册用户</span>
                <span class="font-medium">{{ communityCount.onlineRegister }}</span>
            </div>
            <div class="flex justify-between">
                <span class="text-gray-600">在线游客</span>
                <span class="font-medium">{{ communityCount.onlineTravelers }}</span>
            </div>
        </div>
    </div>
</template>