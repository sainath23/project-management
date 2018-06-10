package com.doitgeek.projectmanagement.controller.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.doitgeek.projectmanagement.entity.user.UserAccount;
import com.doitgeek.projectmanagement.service.user.UserAccountService;

@RestController
public class TestController {

	@Autowired
	private UserAccountService userAccountService;
	
	@GetMapping("/users")
	public List<UserAccount> getAllUserAccount() {
		return userAccountService.findAllUserAccount();
	}
	
	@GetMapping("/users/{id}")
	public UserAccount getAllUserAccount(@PathVariable Integer id) {
		return userAccountService.findUserAccountById(id);
	}
}
