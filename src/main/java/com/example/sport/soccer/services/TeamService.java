package com.example.sport.soccer.services;

import java.util.List;

import com.example.sport.soccer.models.Player;
import com.example.sport.soccer.models.Team;

public interface TeamService {
	public List<Team> getAllTeams();
	public Team addTeam(Team t);
	public Team findTeamById(Long id);
	public void deleteTeam(Long id);
	public Team updateTeam(Team t); 

}
