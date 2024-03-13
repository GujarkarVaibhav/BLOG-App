package com.blog.services.impl;

import com.blog.entities.User;
import com.blog.payloads.UserDto;
import com.blog.repositories.UserRepo;
import com.blog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo ;

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = dtoToUser(userDto) ;
        User savedUser = userRepo.save(user) ;
        return userToDto(savedUser);
    }


    @Override
    public UserDto updateUser(UserDto userDto, Integer userId) {
        return null;
    }

    @Override
    public UserDto getUserById(Integer id) {
        return null;
    }

    @Override
    public List<UserDto> getAllUsers() {
        return null;
    }

    @Override
    public void deleteUser(Integer id) {

    }

    private UserDto userToDto(User user) {
        UserDto userDto = new UserDto() ;
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setPassword(user.getPassword());
        userDto.setEmail(userDto.getEmail());
        userDto.setAbout(user.getAbout());
        return  userDto ;
    }

    private User dtoToUser(UserDto userDto) {
        User user = new User() ;
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());
        user.setAbout(userDto.getAbout());
        return  user ;
    }
}
