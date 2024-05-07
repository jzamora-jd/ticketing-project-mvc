package com.cydeo.service;
import com.cydeo.dto.UserDTO;
import java.util.List;

public interface UserService {
    UserDTO save(UserDTO userDTO);
    UserDTO findById(String username);
    List<UserDTO> findAll();
    void delete(UserDTO userDTO);
    void deleteById(String username);
}
