<script setup>
import { ref } from 'vue';
import axios from "axios";

const boards = ref();

axios.get('http://localhost:8080/api/boards').then(response => {boards.value = response.data;})
</script>

<template>
    <div class="flex-1">
        <div class="space-y-4">
            <div v-for="board in boards" :key="board.id" class="bg-white rounded-lg shadow p-4">
                <div class="flex items-start space-x-4">
                    <div class="flex-1">
                        <h2 class="text-xl font-semibold mb-2 flex items-center">
                            <router-link :to="`/board/${board.id}`" class="hover:text-blue-600">{{ board.name }}</router-link>
                        </h2>
                        <p v-if="board.description" class="text-gray-600 mb-4">{{ board.description }}</p>
                        <div class="flex items-center justify-between">
                            <div class="flex items-center space-x-4 text-sm text-gray-500">
                                <span>版块版主: 暂无</span>  <span>帖子数: 暂无</span>
                            </div>
                            <div class="flex items-center space-x-2">
                                <span v-if="board.adminOnly" class="text-red-500 text-sm">[管理员专区]</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>