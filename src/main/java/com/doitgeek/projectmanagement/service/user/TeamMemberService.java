package com.doitgeek.projectmanagement.service.user;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doitgeek.projectmanagement.entity.user.TeamMember;
import com.doitgeek.projectmanagement.repository.user.TeamMemberRepository;

@Service
public class TeamMemberService {

	@Autowired
	private TeamMemberRepository teamMemberRepository;
	
	private static final Logger LOGGER = LogManager.getLogger(TeamMemberService.class);
	
	public List<TeamMember> findAllTeamMember() {
		return teamMemberRepository.findAll();
	}
	
	public TeamMember findTeamMemberById(Integer id) {
		try {
			return teamMemberRepository.findById(id).get();
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			return null;
		}
	}
	
	public void addTeamMember(TeamMember teamMember) {
		teamMemberRepository.save(teamMember);
	}
	
	public void updateTeamMember(TeamMember teamMember) {
		teamMemberRepository.save(teamMember);
	}
	
	public void deleteTeamMemberById(Integer id) {
		teamMemberRepository.deleteById(id);
	}
}
