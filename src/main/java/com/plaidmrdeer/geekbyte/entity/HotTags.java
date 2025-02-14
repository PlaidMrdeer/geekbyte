package com.plaidmrdeer.geekbyte.entity;

import jakarta.persistence.*;

@Entity
public class HotTags {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String hotTag;

    // 无参构造函数，JPA需要
    public HotTags() {}

    public HotTags(String hotTag) {  // 添加一个构造函数，方便创建 HotTags 对象
        this.hotTag = hotTag;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHotTag() {
        return hotTag;
    }

    public void setHotTag(String hotTag) {
        this.hotTag = hotTag;
    }
}
