<script setup>
import { ref } from 'vue';
import axios from 'axios';
const popularTags = ref([]);

axios.get('http://localhost:8080/api/hottag').then(response => {popularTags.value = response.data;})
</script>

<template>
    <div class="bg-white rounded-lg shadow p-4 mb-4" v-if="popularTags">
        <h3 class="font-bold text-lg mb-3">热门标签</h3>
        <div class="flex flex-wrap gap-2">
            <span v-for="tag in popularTags" :key="tag" class="px-3 py-1 bg-gray-100 rounded-full text-sm">
                #{{ tag }}
            </span>
        </div>
    </div>
</template>