package com.app.RentVideo.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.RentVideo.dto.UserDto;
import com.app.RentVideo.entity.UserEntity;
import com.app.RentVideo.mapper.UserMapper;
import com.app.RentVideo.repository.UserRepository;
import com.app.RentVideo.service.UserService;

@Service
public class UserServiceImp implements UserService  {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto user) {
       
        UserEntity userEntity=UserMapper.convertToEntity(user);

        UserEntity savedEntity=userRepository.save(userEntity);
        return UserMapper.convertTDto(savedEntity);
    }


    
}
