package com.doitgeek.projectmanagement.service.user;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doitgeek.projectmanagement.entity.user.Team;
import com.doitgeek.projectmanagement.repository.user.TeamRepository;

@Service
public class TeamService {

	@Autowired
	private TeamRepository teamRepository;
	
	private static final Logger LOGGER = LogManager.getLogger(TeamService.class);
	
	public List<Team> findAllTeam() {
		return teamRepository.findAll();
	}
	
	public Team findTeamById(Integer id) {
		try {
			return teamRepository.findById(id).get();
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			return null;
		}
	}
	
	public void addTeam(Team team) {
		teamRepository.save(team);
	}
	
	public void updateTeam(Team team) {
		teamRepository.save(team);
	}
	
	public void deleteTeamById(Integer id) {
		teamRepository.deleteById(id);
	}
}
