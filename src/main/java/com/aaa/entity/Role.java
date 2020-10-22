package com.aaa.entity;

import lombok.Data;

import java.util.List;

@Data
public class Role {
    private int id;
    private String roleName;
    private List<User> users;
}
