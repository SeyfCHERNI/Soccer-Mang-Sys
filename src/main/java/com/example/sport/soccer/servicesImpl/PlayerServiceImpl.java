package com.example.sport.soccer.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sport.soccer.models.Matche;
import com.example.sport.soccer.models.Player;
import com.example.sport.soccer.repositories.PlayerRepo;
import com.example.sport.soccer.services.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {
	@Autowired
	private PlayerRepo PlayerRepository;
	@Override
	public List<Player> getAllPlayers() {
		return PlayerRepository.findAll();
		
	}
	@Override
	public Player addPlayer(Player p) {
		return PlayerRepository.save(p);
		
	}
	@Override
	public Player findPlayerById(Long id) {
		Optional<Player> Player = PlayerRepository.findById(id);
		return Player.isPresent() ? Player.get() : null;
		
	}
	@Override
	public void deletePlayer(Long id) {
		PlayerRepository.deleteById(id);
		
	}
	@Override
	public Player updatePlayer(Player p) {
		return PlayerRepository.save(p);
		
	}

}
