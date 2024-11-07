package com.app.RentVideo.mapper;

import com.app.RentVideo.dto.UserDto;
import com.app.RentVideo.entity.UserEntity;

public class UserMapper {

    public static UserDto convertTDto(UserEntity userEntity){

        UserDto userDto=new UserDto();

        userDto.setEmail(userEntity.getEmail());
        userDto.setPassword(userEntity.getPassword());
        userDto.setFirstName(userEntity.getFirstName());
        userDto.setLastName(userEntity.getLastName());
        userDto.setRole(userEntity.getRole());

        return userDto;
    }

    public static UserEntity convertToEntity(UserDto userDto){

        UserEntity userEntity=new UserEntity();

        userEntity.setEmail(userDto.getEmail());
        userEntity.setPassword(userDto.getPassword());
        userEntity.setFirstName(userDto.getFirstName());
        userEntity.setLastName(userDto.getLastName());
        userEntity.setRole(userDto.getRole());

        return userEntity;

    }
    
}
