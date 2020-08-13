package com.Assign5;

import java.util.List;

public class Player {

	private String playerId;
	private String playerName;
	country country;
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public country getCountry() {
		return country;
	}
	public void setCountry(country country) {
		this.country = country;
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", country=" + country + "]";
	}

	
	
}
