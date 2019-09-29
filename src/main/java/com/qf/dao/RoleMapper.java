package com.qf.dao;

import com.qf.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleMapper extends JpaRepository<Role,Integer> {
    Role findByRoleName(String roleName);
}
