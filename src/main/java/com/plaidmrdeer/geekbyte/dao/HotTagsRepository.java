package com.plaidmrdeer.geekbyte.dao;

import com.plaidmrdeer.geekbyte.entity.HotTags;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotTagsRepository extends JpaRepository<HotTags, Long> {
}