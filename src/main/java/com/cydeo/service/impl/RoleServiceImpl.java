package com.cydeo.service.impl;

import com.cydeo.Repository.RoleRepository;
import com.cydeo.dto.RoleDTO;
import com.cydeo.entity.Role;
import com.cydeo.mapper.RoleMapper;
import com.cydeo.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;
    private final RoleMapper roleMapper;

    public RoleServiceImpl(RoleRepository roleRepository,RoleMapper roleMapper) {
        this.roleRepository = roleRepository;
        this.roleMapper = roleMapper;
    }

    @Override
    public List<RoleDTO> listAllRoles() {
        //controller requesting all usrs
        //first go to db and bring all the users from there

//        List<Role> roleList =  roleRepository.findAll();
//
//        //convert entity list to roleDto list - get roles from db and convert each role to roleDto using streams
//        List<RoleDTO> list2 = roleList.stream().map(roleMapper::convertToDto).collect(Collectors.toList());

        return  roleRepository.findAll().stream().map(roleMapper::convertToDto).collect(Collectors.toList());//one line code
    }

    @Override
    public RoleDTO findById(Long id) {
        return null;
    }
}
