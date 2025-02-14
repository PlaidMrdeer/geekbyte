<script setup>
import ContentNav from '../view/ContentNav.vue';
import PostList from '../view/PostList.vue';
</script>

<template>
    <div class="flex-1">

        <!-- 内容导航栏 -->
        <ContentNav></ContentNav>
        <router-view></router-view>

        <!-- <div class="flex justify-center mt-6">
            <nav class="flex items-center space-x-2">
                <a href="#"
                    class="px-3 py-2 rounded-lg bg-gray-100 text-gray-600 hover:bg-blue-600 hover:text-white">上一页</a>
                <a href="#" class="px-3 py-2 rounded-lg bg-blue-600 text-white">1</a>
                <a href="#"
                    class="px-3 py-2 rounded-lg bg-gray-100 text-gray-600 hover:bg-blue-600 hover:text-white">2</a>
                <a href="#"
                    class="px-3 py-2 rounded-lg bg-gray-100 text-gray-600 hover:bg-blue-600 hover:text-white">3</a>
                <span class="px-3 py-2">...</span>
                <a href="#"
                    class="px-3 py-2 rounded-lg bg-gray-100 text-gray-600 hover:bg-blue-600 hover:text-white">10</a>
                <a href="#"
                    class="px-3 py-2 rounded-lg bg-gray-100 text-gray-600 hover:bg-blue-600 hover:text-white">下一页</a>
            </nav>
        </div> -->
    </div>
</template>