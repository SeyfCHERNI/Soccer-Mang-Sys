package com.example.sport.soccer.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sport.soccer.models.Team;
import com.example.sport.soccer.repositories.TeamRepo;
import com.example.sport.soccer.services.TeamService;

@Service
public class TeamServiceImpl implements TeamService {
	@Autowired
	private TeamRepo TeamRepository;
	@Override
	public List<Team> getAllTeams() {
		return TeamRepository.findAll();
		
	}
	@Override
	public Team addTeam(Team t) {
		return TeamRepository.save(t);
		
	}
	@Override
	public Team findTeamById(Long id) {
		Optional<Team> Team = TeamRepository.findById(id);
		return Team.isPresent() ? Team.get() : null;
		
	}
	@Override
	public void deleteTeam(Long id) {
		TeamRepository.deleteById(id);
		
	}
	@Override
	public Team updateTeam(Team t) {
		return TeamRepository.save(t);
		
	}

	

}
