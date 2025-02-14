<script setup>
import HotTags from "../view/HotTags.vue";
import CommunitySta from "../view/CommunitySta.vue";
import ActiveUser from "../view/ActiveUser.vue";
</script>

<template>
    <div class="w-64 hidden lg:block">
        <!-- 热门标签 -->
        <HotTags></HotTags>

        <!-- 社区统计 -->
        <CommunitySta></CommunitySta>

        <!-- 活跃用户 -->
        <ActiveUser></ActiveUser>
    </div>
</template>
