package com.cydeo.service;

import com.cydeo.dto.RoleDTO;

import java.util.List;

public interface RoleService {
    RoleDTO save(RoleDTO roleDTO);
    RoleDTO findById(Long id);
    List<RoleDTO> findAll();
    void delete(RoleDTO roleDTO);
    void deleteById(Long id);
}
