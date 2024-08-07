package com.cydeo.Repository;

import com.cydeo.entity.Role;
import com.cydeo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {

    //    User findByUsername
    User findByUserName(String username);

    @Transactional
    void deleteByUserName(String username);

    List<User> findAllByRoleDescriptionIgnoreCase(String description);

}
