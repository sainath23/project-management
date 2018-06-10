package com.doitgeek.projectmanagement.service.user;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doitgeek.projectmanagement.entity.user.Role;
import com.doitgeek.projectmanagement.repository.user.RoleRepository;

@Service
public class RoleService {

	@Autowired
	private RoleRepository roleRepository;
	
	private static final Logger LOGGER = LogManager.getLogger(RoleService.class);
	
	public List<Role> findAllRole() {
		return roleRepository.findAll();
	}
	
	public Role findRoleById(Integer id) {
		try {
			return roleRepository.findById(id).get();
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			return null;
		}
	}
	
	public void addRole(Role role) {
		roleRepository.save(role);
	}
	
	public void updateRole(Role role) {
		roleRepository.save(role);
	}
	
	public void deleteRoleById(Integer id) {
		roleRepository.deleteById(id);
	}
}
