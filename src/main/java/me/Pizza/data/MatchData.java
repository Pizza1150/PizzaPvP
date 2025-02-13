package me.Pizza.data;

import org.bukkit.entity.Player;

import java.util.List;
import java.util.UUID;

public class MatchData {

	UUID matchUUID;
	List<Player> players;

	public MatchData(UUID matchUUID, List<Player> players) {
		this.matchUUID = matchUUID;
		this.players = players;
	}

}
