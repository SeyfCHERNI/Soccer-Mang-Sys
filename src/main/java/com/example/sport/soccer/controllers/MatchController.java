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
import com.example.sport.soccer.services.MatcheService;

@CrossOrigin("*") 
@RestController
@RequestMapping("api/matches")
public class MatchController {
	@Autowired //injection de dependance
	private MatcheService matchService; // instance de la service MatcheService nommé matchService
	@GetMapping("")
	public List<Matche> getAllMatches(){
	    return matchService.getAllMatches(); // appelle de l'instance creé precedament
	}
	@GetMapping("/{id}")
	public Matche getMatch(@PathVariable Long id) {
		return matchService.findMatcheById(id);
	}
	@PostMapping("")
	public Matche addMatch(@RequestBody Matche m) {
	    return matchService.addMatche(m);
	}
	@PutMapping("/{id}")
	public Matche updateMatch(@PathVariable Long id ,@RequestBody Matche m) {
	return matchService.updateMatche(m);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
	matchService.deleteMatche(id);
	}

}
