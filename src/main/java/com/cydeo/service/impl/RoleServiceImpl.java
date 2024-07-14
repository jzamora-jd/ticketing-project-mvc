package com.cydeo.service.impl;

import com.cydeo.Repository.RoleRepository;
import com.cydeo.dto.RoleDTO;
import com.cydeo.entity.Role;
import com.cydeo.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<RoleDTO> listAllRoles() {
        //controller requesting all usrs
        //first go to db and bring all the users from there

        List<Role> roleList =  roleRepository.findAll();

        //convert entity list to roleDto list


        return null;
    }

    @Override
    public RoleDTO findById(Long id) {
        return null;
    }
}
