package com.plaidmrdeer.geekbyte.service;

import com.plaidmrdeer.geekbyte.dao.HotTagsRepository;
import com.plaidmrdeer.geekbyte.entity.HotTags;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class HotTagsService {
    @Autowired
    private HotTagsRepository hotTagsRepository;

    public void addTag(HotTags hotTags) {
        hotTagsRepository.save(hotTags);
    }

    public HotTags findById(Long id) {
        return hotTagsRepository.findById(id).orElse(null);
    }

    public List<HotTags> getAllHotTags() {
        return hotTagsRepository.findAll(); // 查询所有 HotTags 实体
    }
}