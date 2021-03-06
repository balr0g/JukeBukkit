package cc.thedudeguy.jukebukkit.jukebox.custom;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.player.SpoutPlayer;

import cc.thedudeguy.jukebukkit.CustomsManager;
import cc.thedudeguy.jukebukkit.JukeBukkit;
import cc.thedudeguy.jukebukkit.jukebox.JukeboxBlock;

public class JukeboxMidRange extends JukeboxBlock {
	public JukeboxMidRange(JukeBukkit plugin)
	{
		this(plugin, plugin.getCustomsManager().getCustomBlockTexture());
	}

	public JukeboxMidRange(JukeBukkit plugin, Texture texture)
	{
		super(
			plugin, 
			"Mid Range Jukebox",
			new GenericCubeBlockDesign(
				plugin, 
				texture, 
				new int[] { 0, 6, 6, 6, 6, 1 }
			),
			"jukebukkit.player.mid"
		);
		//ints are { bottom, north, ?, ?, ?, top }
	}

	@Override
	public int getRange()
	{
		return 30;
	}
}
