package me.Pizza.algorithm;

import me.Pizza.PizzaPvP;
import me.Pizza.data.MatchData;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scheduler.BukkitTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Queue {

	private BukkitTask queueTask;
	private final Random random = new Random();
	private final List<Player> queues = new ArrayList<>();
	private final BukkitScheduler scheduler = Bukkit.getScheduler();

	public Queue() {
		start();
	}

	private void start() {
		queueTask = scheduler.runTaskTimer(PizzaPvP.getPlugin(), () -> {
			if (queues.size() >= 2) {
				Player player1 = queues.get(random.nextInt(queues.size()));
				queues.remove(player1);

				Player player2 = queues.get(random.nextInt(queues.size()));
				queues.remove(player2);

				UUID matchID = UUID.randomUUID();

				MatchData match = new MatchData(matchID, List.of(player1, player2));

				Bukkit.broadcastMessage(player1.getName() + " และ " + player2.getName() + " ได้รับการจับคู่แล้ว!");
			}
		}, 0L, 20L);
	}

	public List<Player> getQueues() {
		return queues;
	}

	public BukkitTask getQueueTask() {
		return queueTask;
	}

}
