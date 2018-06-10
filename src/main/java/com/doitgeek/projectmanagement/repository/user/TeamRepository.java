package com.doitgeek.projectmanagement.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doitgeek.projectmanagement.entity.user.Team;

public interface TeamRepository extends JpaRepository<Team, Integer> {

}
