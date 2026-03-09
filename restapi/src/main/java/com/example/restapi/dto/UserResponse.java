package com.example.restapi.dto;

import com.example.restapi.domain.User;

// Response用DTOクラスの作成
public class UserResponse {

    private int id;
    private String name;
    private String email;
    
    public UserResponse() {
    }

    public UserResponse(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public UserResponse(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        // this.createdAt = user.getCreatedAt();
        // this.updatedAt = user.getUpdatedAt();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserResponse [id=" + id + ", name=" + name + ", email=" + email + "]";
    }

    
}
