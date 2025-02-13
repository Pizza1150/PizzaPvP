package me.Pizza.data;

import org.bukkit.entity.Player;

import java.util.UUID;

public class PlayerData {

	Player opponent;
	UUID currentMatchID;

	public PlayerData(Player opponent, UUID currentMatchID) {
		this.opponent = opponent;
		this.currentMatchID = currentMatchID;
	}

}
