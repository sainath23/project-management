package com.doitgeek.projectmanagement.service.user;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doitgeek.projectmanagement.entity.user.Employee;
import com.doitgeek.projectmanagement.repository.user.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	private static final Logger LOGGER = LogManager.getLogger(EmployeeService.class);
	
	public List<Employee> findAllEmployee() {
		return employeeRepository.findAll();
	}
	
	public Employee findEmployeeById(Integer id) {
		try {
			return employeeRepository.findById(id).get();
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			return null;
		}
	}
	
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public void deleteEmployeeById(Integer id) {
		employeeRepository.deleteById(id);
	}
}
