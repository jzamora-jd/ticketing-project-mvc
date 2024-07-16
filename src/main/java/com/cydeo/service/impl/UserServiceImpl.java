package com.cydeo.service.impl;

import com.cydeo.Repository.RoleRepository;
import com.cydeo.Repository.UserRepository;
import com.cydeo.dto.UserDTO;
import com.cydeo.entity.User;
import com.cydeo.mapper.RoleMapper;
import com.cydeo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleMapper roleMapper;

    public UserServiceImpl(UserRepository userRepository, RoleMapper roleMapper) {
        this.userRepository = userRepository;
        this.roleMapper = roleMapper;

    }

    @Override
    public List<UserDTO> listAllUsers() {

        List<User> userList = userRepository.findAll();
        return  userRepository.findAll().stream().map(roleMapper::convertToDto).collect(Collectors.toList());//one line code

    }

    @Override
    public UserDTO findByUserName(String username) {
        return null;
    }

    @Override
    public void save(UserDTO dto) {

    }

    @Override
    public UserDTO update(UserDTO dto) {
        return null;
    }

    @Override
    public void deleteByUserName(String username) {

    }
}
