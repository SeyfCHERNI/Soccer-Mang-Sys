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

import com.example.sport.soccer.models.Matche;
import com.example.sport.soccer.models.Player;
import com.example.sport.soccer.services.MatcheService;
import com.example.sport.soccer.services.PlayerService;

@CrossOrigin("*") 
@RestController
@RequestMapping("api/players")
public class PlayerController {
	@Autowired //injection de dependance
	private PlayerService playerService; // instance de la service PlayerService nommé playerService
	@GetMapping("")
	public List<Player> getAllPlayers() {
		return playerService.getAllPlayers();
	}
	@PostMapping("")
	public Player addPlayer(@RequestBody Player p) {
	    return playerService.addPlayer(p);
	}
	@PutMapping("/{id}")
	public Player updatePlayer(@PathVariable Long id ,@RequestBody Player p) {
	return playerService.updatePlayer(p);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
	playerService.deletePlayer(id);
	}
	@GetMapping("/{id}")
	public Player findPlayerById(@PathVariable Long id) {
		return playerService.findPlayerById(id);
	}

}
