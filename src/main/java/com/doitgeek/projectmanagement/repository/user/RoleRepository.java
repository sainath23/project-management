package com.doitgeek.projectmanagement.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doitgeek.projectmanagement.entity.user.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
