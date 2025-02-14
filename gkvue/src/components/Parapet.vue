<template>
    <nav class="bg-white shadow-lg">
        <div class="max-w-7xl mx-auto px-4">
            <div class="flex justify-between items-center h-16">

                <!-- logo -->
                <div class="flex items-center">
                    <a href="#" class="text-2xl font-bold text-blue-600">GeekByte</a>
                </div>

                <!-- 搜索框 -->
                <div class="flex-1 max-w-xl px-4">
                    <div class="relative">
                        <input type="text"
                            class="w-full px-4 py-2 rounded-lg bg-gray-100 focus:outline-none focus:ring-2 focus:ring-blue-500"
                            placeholder="搜索帖子、用户或话题...">
                        <button class="absolute right-3 top-2.5 text-gray-400 hover:text-blue-500">
                            <i class="fas fa-search"></i>
                        </button>
                    </div>
                </div>

                <!-- 用户头像 -->
                <div class="flex items-center space-x-4">
                    <button class="px-4 py-2 rounded-lg bg-blue-600 text-white hover:bg-blue-700">发帖</button>
                    <div class="relative">
                        <img src="/src/assets/user/icon/qdao44qasb51.jpg" alt="用户头像" class="w-10 h-10 rounded-full cursor-pointer">
                    </div>
                </div>
            </div>
        </div>
    </nav>
</template>