package com.app.RentVideo.dto;

import com.app.RentVideo.entity.RoleEntity;

import lombok.Data;

@Data
public class UserDto {

    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private RoleEntity role;
    
}
