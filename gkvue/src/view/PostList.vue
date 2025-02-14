<script setup>
import { ref } from 'vue';
import axios from "axios";
const posts = ref();

axios.get('http://localhost:8080/api/post-list').then(response => {posts.value = response.data;console.log(posts.value);})
console.log(posts.value);
</script>

<template>
    <div class="space-y-4">
        <div v-for="post in posts" :key="post.id" class="bg-white rounded-lg shadow p-4">
            <div class="flex items-start space-x-4">
                <img :src="post.authorAvatar" :alt="post.authorName" class="w-10 h-10 rounded-full">
                <div class="flex-1">
                    <h2 class="text-xl font-semibold mb-2 flex items-center">
                        <a href="#" class="hover:text-blue-600">{{ post.title }}</a>
                        <span v-for="approve in post.approves" class="text-red-400 text-sm ml-5">
                            <i :class="approve.icon"></i>{{ approve.text }}
                        </span>
                    </h2>
                    <p class="text-gray-600 mb-4">{{ post.contentPreview }}</p>
                    <div class="flex items-center justify-between">
                        <div class="flex items-center space-x-4 text-sm text-gray-500">
                            <span>{{ post.authorName }}</span>
                            <span>{{ post.timeAgo }}</span>
                            <span class="flex items-center">
                                <i class="far fa-eye mr-1"></i> {{ post.views }}
                            </span>
                            <span class="flex items-center">
                                <i class="far fa-comment mr-1"></i> {{ post.comments }}
                            </span>
                            <button class="flex items-center hover:text-blue-500">
                                <i class="fa-regular fa-heart mr-1"></i>{{ post.patronize }}
                            </button>
                            <button class="flex items-center hover:text-blue-500">
                                <i class="far fa-bookmark mr-1"></i>{{ post.favorite }}
                            </button>
                        </div>
                        <div class="flex items-center space-x-2">
                            <p class="text-gray-400">标签: </p>
                            <span v-for="tag in post.tags" class="text-gray-400">#{{ tag }}</span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>