package me.sunny.breakbanner;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		saveDefaultConfig();
		this.getServer().getPluginManager().registerEvents(new BlockBreak(), this);
	}
	
	public static Main getPlugin() {
		return (Main) getPlugin(Main.class);
	}
}
