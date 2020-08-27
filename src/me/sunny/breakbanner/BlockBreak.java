package me.sunny.breakbanner;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreak implements Listener {

	@EventHandler
	public void a(BlockBreakEvent e) {
		Player p = e.getPlayer();
		String d = p.getName();
		List<String> a = Main.getPlugin().getConfig().getStringList("blocks");
		String f = Main.getPlugin().getConfig().getString("command");
		Material m = e.getBlock().getType();
		for (String c : a) {
			if (m.equals(Material.getMaterial(c))) {
				Bukkit.getServer().dispatchCommand((CommandSender) Bukkit.getConsoleSender(), f.replace("%player%", d).replace("&", "§"));
				return;
			}
		}
	}
}
