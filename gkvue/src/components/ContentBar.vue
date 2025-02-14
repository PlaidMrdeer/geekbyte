<script setup>
import LeftContentBar from './LeftContentBar.vue';
import RightContentBar from'./RightContentBar.vue';
</script>

<template>
    <div class="max-w-7xl mx-auto px-4 py-8" id="app">
        <div class="flex gap-6">
            
            <!-- 左侧内容栏 -->
            <LeftContentBar></LeftContentBar>

            <!-- 右侧内容栏 -->
            <RightContentBar></RightContentBar>
        </div>
    </div>
</template>