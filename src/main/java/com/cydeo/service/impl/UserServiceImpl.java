package com.cydeo.service.impl;

import com.cydeo.Repository.UserRepository;
import com.cydeo.dto.UserDTO;
import com.cydeo.entity.User;
import com.cydeo.mapper.UserMapper;
import com.cydeo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;

    }

    @Override
    public List<UserDTO> listAllUsers() {

        List<User> userList = userRepository.findAll();
        return  userRepository.findAll().stream().map(userMapper::convertToDto).collect(Collectors.toList());//one line code
    }

    @Override
    public UserDTO findByUserName(String username) {
        User user = userRepository.findByUserName(username);
        return userMapper.convertToDto(user);
    }

    @Override
    public void save(UserDTO dto) {
        userRepository.save(userMapper.convertToEntity(dto));
    }

    @Override
    public UserDTO update(UserDTO dto) {

        User user = userRepository.findByUserName(dto.getUserName()); //find user first
        User convertedUser = userMapper.convertToEntity(dto); //Map updated user dto to entity object
        convertedUser.setId(user.getId()); //set id to converted user
        userRepository.save(convertedUser); //save updated user

        userRepository.save(userMapper.convertToEntity(dto));
        return findByUserName(dto.getUserName());
    }

    @Override
    public void deleteByUserName(String username) {

    }
}
