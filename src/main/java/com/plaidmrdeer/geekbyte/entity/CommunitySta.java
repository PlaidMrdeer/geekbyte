package com.plaidmrdeer.geekbyte.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CommunitySta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    int register;
    int post;
    int onlineRegister;
    int onlineTravelers;

    public CommunitySta(int onlineTravelers, int onlineRegister, int post, int register) {
        this.onlineTravelers = onlineTravelers;
        this.onlineRegister = onlineRegister;
        this.post = post;
        this.register = register;
    }

    public CommunitySta() {

    }

    public int getOnlineTravelers() {
        return onlineTravelers;
    }

    public void setOnlineTravelers(int onlineTravelers) {
        this.onlineTravelers = onlineTravelers;
    }

    public int getOnlineRegister() {
        return onlineRegister;
    }

    public void setOnlineRegister(int onlineRegister) {
        this.onlineRegister = onlineRegister;
    }

    public int getPost() {
        return post;
    }

    public void setPost(int post) {
        this.post = post;
    }

    public int getRegister() {
        return register;
    }

    public void setRegister(int register) {
        this.register = register;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
