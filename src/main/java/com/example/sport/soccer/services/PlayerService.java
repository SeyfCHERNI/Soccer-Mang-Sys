package com.example.sport.soccer.services;

import java.util.List;

import com.example.sport.soccer.models.Matche;
import com.example.sport.soccer.models.Player;

public interface PlayerService {
	public List<Player> getAllPlayers();
	public Player addPlayer(Player p);
	public Player findPlayerById(Long id);
	public void deletePlayer(Long id);
	public Player updatePlayer(Player p); 


}
