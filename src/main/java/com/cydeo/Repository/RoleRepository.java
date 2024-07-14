package com.cydeo.Repository;

import com.cydeo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {

    //all queries that will get data from db
    //jpa repository - ready crud methods - 20 available
    //derive query
    //@Query(Jpa-Native)



}
