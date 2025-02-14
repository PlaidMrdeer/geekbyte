package com.plaidmrdeer.geekbyte.service;

import com.plaidmrdeer.geekbyte.dao.CommunityStaRepository;
import com.plaidmrdeer.geekbyte.entity.CommunitySta;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CommunityStaService {
    @Autowired
    CommunityStaRepository communityStaRepository;
    @PersistenceContext
    private EntityManager entityManager;
    private CommunitySta communitySta;

    public void updateRegister(long id, int register) {
        communitySta = entityManager.find(CommunitySta.class, id);
        communitySta.setRegister(register);
    }
    public void updatePost(long id, int post) {
        communitySta = entityManager.find(CommunitySta.class, id);
        communitySta.setPost(post);
    }
    public void updateOnlineRegister(long id, int onlineRegister) {
        communitySta = entityManager.find(CommunitySta.class, id);
        communitySta.setOnlineRegister(onlineRegister);
    }
    public void updateOnlineTravelers(long id, int onlineTravelers) {
        communitySta = entityManager.find(CommunitySta.class, id);
        communitySta.setOnlineTravelers(onlineTravelers);
    }

    public CommunitySta getCommunityStaById(long id) {
        return communityStaRepository.findById(id).orElse(null);
    }


}
