package com.ullarah.umagic.event;

import com.ullarah.umagic.MagicFunctions;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDamageEvent;

public class BlockDamage extends MagicFunctions implements Listener {

    public BlockDamage() {
        super(false);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void event(BlockDamageEvent event) {

        for (String meta : new String[]{metaWool, metaLadd, metaFurn, metaVoid, metaCact}) {

            if (event.getBlock().hasMetadata(meta)) {

                if (!usingMagicHoe(event.getPlayer())) {

                    getActionMessage().message(event.getPlayer(), "" + ChatColor.AQUA + ChatColor.BOLD
                            + "Magical Block Detected!"
                            + ChatColor.RED + ChatColor.BOLD + " Convert back using Magical Hoe!");

                    event.setCancelled(true);

                }

            }

        }


    }

}
