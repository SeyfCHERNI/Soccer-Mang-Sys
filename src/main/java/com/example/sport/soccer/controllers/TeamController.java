package com.example.sport.soccer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sport.soccer.models.Team;
import com.example.sport.soccer.services.TeamService;
import com.example.sport.soccer.services.TeamService;

@CrossOrigin("*") 
@RestController
@RequestMapping("api/teams")
public class TeamController {
	@Autowired //injection de dependance
	private TeamService teamService; // instance de la service TeamService nommé teamService
	@GetMapping("")
	public List<Team> getAllMatches() {
		return teamService.getAllTeams();
	}
	@PostMapping("")
	public Team addTeam(@RequestBody Team t) {
	    return teamService.addTeam(t);
	}
	@PutMapping("/{id}")
	public Team updateTeam(@PathVariable Long id ,@RequestBody Team t) {
	return teamService.updateTeam(t);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
	teamService.deleteTeam(id);
	}
	@GetMapping("/{id}")
	public Team findTeamById(@PathVariable Long id) {
		return teamService.findTeamById(id);
	}

}
