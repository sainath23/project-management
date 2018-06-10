package com.doitgeek.projectmanagement.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doitgeek.projectmanagement.entity.user.UserAccount;

public interface UserAccountRepository extends JpaRepository<UserAccount, Integer> {

}
