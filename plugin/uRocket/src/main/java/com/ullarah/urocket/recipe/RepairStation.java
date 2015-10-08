package com.ullarah.urocket.recipe;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class RepairStation {

    public static ItemStack station() {

        ItemStack station = new ItemStack(Material.BEACON, 1);

        ItemMeta stationMeta = station.getItemMeta();
        stationMeta.setDisplayName(ChatColor.RED + "Rocket Repair Station");
        stationMeta.setLore(Arrays.asList(
                ChatColor.YELLOW + "Place it on top of a Repair Tank!"));
        stationMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        station.setItemMeta(stationMeta);

        station.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 1);

        return station;

    }

    public ShapedRecipe recipe() {

        ShapedRecipe bootRecipe = new ShapedRecipe(station());
        bootRecipe.shape("E", "B");

        bootRecipe.setIngredient('B', Material.BEACON);
        bootRecipe.setIngredient('E', Material.ENCHANTMENT_TABLE);

        return bootRecipe;

    }

}