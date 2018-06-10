package com.doitgeek.projectmanagement.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doitgeek.projectmanagement.entity.user.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
