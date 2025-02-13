package me.Pizza;

import me.Pizza.algorithm.Queue;
import org.bukkit.plugin.java.JavaPlugin;

public final class PizzaPvP extends JavaPlugin {

	private static PizzaPvP plugin;
	private Queue queue;

	@Override
	public void onEnable() {
		plugin = this;

		queue = new Queue();
	}

	@Override
	public void onDisable() {
		queue.getQueueTask().cancel();
	}

	public static PizzaPvP getPlugin() {
		return plugin;
	}

}
