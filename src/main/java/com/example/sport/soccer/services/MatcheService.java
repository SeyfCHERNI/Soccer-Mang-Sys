package com.example.sport.soccer.services;

import java.util.List;

import com.example.sport.soccer.models.Matche;

public interface MatcheService {
	public List<Matche> getAllMatches();

	public Matche updateMatche(Matche m);  // Matche = type = nom du model , m = nom du var

	public void deleteMatche(Long id);

	public Matche addMatche(Matche m);

	public Matche findMatcheById(Long id);

}
