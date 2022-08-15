package com.example.sport.soccer.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sport.soccer.models.Matche;
import com.example.sport.soccer.repositories.MatchRepo;
import com.example.sport.soccer.services.MatcheService;
@Service
public class MatcheServiceImpl implements MatcheService  {
	@Autowired
	private MatchRepo matchRepository; // instace de l'interface MatchRepo nommé match Repository
	@Override
	public List<Matche> getAllMatches() {
		return matchRepository.findAll();
	}
	@Override
	public Matche updateMatche(Matche m) {
		return matchRepository.save(m);
	
	}
	@Override
	public void deleteMatche(Long id) {
		matchRepository.deleteById(id);
		
	}
	@Override
	public Matche addMatche(Matche m) {
		return matchRepository.save(m);
		
	}
	@Override
	public Matche findMatcheById(Long id) {
		Optional<Matche> Matche = matchRepository.findById(id);
		return Matche.isPresent() ? Matche.get() : null;
	}
}
