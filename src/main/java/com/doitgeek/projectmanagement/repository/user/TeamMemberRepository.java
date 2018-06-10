package com.doitgeek.projectmanagement.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doitgeek.projectmanagement.entity.user.TeamMember;

public interface TeamMemberRepository extends JpaRepository<TeamMember, Integer> {

}
