package com.doitgeek.projectmanagement.service.user;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doitgeek.projectmanagement.entity.user.UserAccount;
import com.doitgeek.projectmanagement.repository.user.UserAccountRepository;

@Service
public class UserAccountService {

	@Autowired
	private UserAccountRepository userAccountRepository;
	
	private static final Logger LOGGER = LogManager.getLogger(UserAccountService.class);
	
	public List<UserAccount> findAllUserAccount() {
		return userAccountRepository.findAll();
		
	}
	
	public UserAccount findUserAccountById(Integer id) {
		try {
			return userAccountRepository.findById(id).get();
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			return null;
		}
	}
	
	public void addUserAccount(UserAccount userAccount) {
		userAccountRepository.save(userAccount);
	}
	
	public void updateUserAccount(UserAccount userAccount) {
		userAccountRepository.save(userAccount);
	}
	
	public void deleteUserAccountById(Integer id) {
		userAccountRepository.deleteById(id);
	}
}
