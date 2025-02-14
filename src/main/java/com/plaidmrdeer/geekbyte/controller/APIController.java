package com.plaidmrdeer.geekbyte.controller;

import com.plaidmrdeer.geekbyte.entity.HotTags;
import com.plaidmrdeer.geekbyte.service.CommunityStaService;
import com.plaidmrdeer.geekbyte.service.HotTagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class APIController {
    @Autowired
    private HotTagsService hotTagsService;
    private CommunityStaService communityStaService;

    @GetMapping("/hottag")
    public ResponseEntity<List<String>> getHotTags() {
        hotTagsService.addTag(new HotTags("asdsad"));
        List<HotTags> hotTagsEntities = hotTagsService.getAllHotTags(); // 调用 Service 层的方法
        List<String> hotTags = hotTagsEntities.stream().map(HotTags::getHotTag).collect(Collectors.toList());
        return ResponseEntity.ok(hotTags);
    }

    @GetMapping("/community-count")
    public ResponseEntity<Map<String, Integer>> getCommunityCount() {
        Map<String, Integer>  count = new HashMap<>();
        count.put("register", 800);
        count.put("post", 10124512);
        count.put("onlineRegister", 1242);
        count.put("onlineTravelers", 1234);
        return ResponseEntity.ok(count);
    }

    @GetMapping("/active-user")
    public ResponseEntity<List<Map<String, Object>>> getActiveUser() {
        List<Map<String, Object>>  users = new ArrayList<>();
        Map<String, Object> user = new HashMap<>();
        user.put("id", 1);
        user.put("name", "活跃用户1");
        user.put("avatar", "/src/assets/user/icon/qdao44qasb51.jpg");
        user.put("postCount", 123);
        user.put("likeCount", 456);

        users.add(user);
        users.add(user);
        return ResponseEntity.ok(users);
    }

    @GetMapping("/post-list")
    public ResponseEntity<List<Map<String, Object>>> postList() {
        List<Map<String, String>> approveData = List.of(
                Map.of("text", "置顶", "icon", "fa-solid fa-thumbtack"),
                Map.of("text", "精华", "icon", "fa-solid fa-award")
        );
        List<Map<String, String>> approves = new ArrayList<>(approveData);

        List<String> tags = new ArrayList<>();
        tags.add("闲聊");
        tags.add("摸鱼");

        List<Map<String, Object>>  postList = new ArrayList<>();
        Map<String, Object> post = new HashMap<>();
        post.put("id", 1);
        post.put("authorName", "用户A");
        post.put("authorAvatar", "/src/assets/user/icon/qdao44qasb51.jpg");
        post.put("title", "Vue.js 动态渲染帖子列表示例");
        post.put("contentPreview", "这是一个使用 Vue.js 动态渲染的帖子列表示例，展示了如何使用 v-for 指令以及数据绑定来动态生成 HTML 内容...");
        post.put("timeAgo", "1小时前");
        post.put("views", 1500);
        post.put("comments", 30);
        post.put("patronize", 100);
        post.put("favorite", 90);
        post.put("approves", approves);
        post.put("tags", tags);

        postList.add(post);
        return ResponseEntity.ok(postList);
    }

    @GetMapping("/boards")
    public ResponseEntity<List<Map<String, Object>>> getBoards() {
        List<Map<String, Object>> board = List.of(
                Map.of("id", 1, "name", "综合讨论", "description",  "综合性的讨论版块，涵盖各种话题。"),
                Map.of("id", 2, "name", "技术交流", "description",  "技术爱好者和开发者交流技术的版块。")
        );
        List<Map<String, Object>> boards = new ArrayList<>(board);
        return ResponseEntity.ok(boards);
    }
}
