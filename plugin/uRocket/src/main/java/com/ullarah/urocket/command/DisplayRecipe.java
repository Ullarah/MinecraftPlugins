package com.ullarah.urocket.command;

import com.ullarah.urocket.RocketInit;
import com.ullarah.urocket.recipe.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class DisplayRecipe {

    public static void open(CommandSender sender) {

        Player player = (Player) sender;

        Inventory rocketRecipeInventory = Bukkit.createInventory(null, 36, ChatColor.GOLD + "Rocket Recipes");

        rocketRecipeInventory.setContents(recipeMainMenu());
        player.openInventory(rocketRecipeInventory);

    }

    private static ItemStack[] recipeMainMenu() {

        ItemStack variantMoney = null;

        if (RocketInit.getVaultEconomy() != null)
            variantMoney = RocketVariant.variant(ChatColor.DARK_GREEN + "Robin Hood");

        return new ItemStack[]{
                RocketBooster.booster("I"),
                RocketBooster.booster("II"),
                RocketBooster.booster("III"),
                RocketBooster.booster("IV"),
                RocketBooster.booster("V"),
                null,
                RocketEfficient.efficient(),
                RocketSolar.solar(),
                null,

                RocketControls.control(),
                RepairTank.tank(),
                RepairStation.station(),
                RepairStand.stand(),
                RocketFlyZone.zone(),
                RocketSaddle.saddle(),
                RocketHealer.healer(),
                null,
                null,

                RocketVariant.variant(ChatColor.LIGHT_PURPLE + "Gay Agenda"),
                RocketVariant.variant(ChatColor.AQUA + "Pole Vaulter"),
                RocketVariant.variant(ChatColor.GRAY + "Coal Miner"),
                RocketVariant.variant(ChatColor.DARK_AQUA + "Essence of Ender"),
                RocketVariant.variant(ChatColor.GRAY + "Glazed Over"),
                RocketVariant.variant(ChatColor.YELLOW + "Shooting Star"),
                RocketVariant.variant(ChatColor.GREEN + "Health Zapper"),
                RocketVariant.variant(ChatColor.RED + "TNT Overload"),
                RocketVariant.variant(ChatColor.WHITE + "Loud Silence"),

                RocketVariant.variant(ChatColor.GOLD + "Musical Madness"),
                RocketVariant.variant(ChatColor.YELLOW + "Radical Rainbows"),
                RocketVariant.variant(ChatColor.DARK_RED + "Red Fury"),
                RocketVariant.variant(ChatColor.GOLD + "Rocket Runner"),
                RocketVariant.variant(ChatColor.WHITE + "Super Stealth"),
                RocketVariant.variant(ChatColor.BLUE + "Water Slider"),
                RocketVariant.variant(ChatColor.YELLOW + "Patient Zero"),
                null,
                variantMoney
        };

    }

}