package com.ullarah.urocket.recipe;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class BoosterTwo {

    public static ItemStack booster() {

        ItemStack booster = new ItemStack(Material.TNT, 1);
        ItemMeta boosterMeta = booster.getItemMeta();

        boosterMeta.setDisplayName(ChatColor.RED + "Rocket Booster");
        boosterMeta.setLore(Arrays.asList(
                ChatColor.YELLOW + "Rocket Level II"));

        boosterMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        booster.setItemMeta(boosterMeta);

        booster.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 1);

        return booster;

    }

    public ShapedRecipe recipe() {

        ShapedRecipe boosterRecipe = new ShapedRecipe(booster());
        boosterRecipe.shape("I I", "BRB", "TTT");

        boosterRecipe.setIngredient('B', Material.BLAZE_POWDER);
        boosterRecipe.setIngredient('I', Material.IRON_BLOCK);
        boosterRecipe.setIngredient('R', Material.REDSTONE_BLOCK);
        boosterRecipe.setIngredient('T', Material.TNT);

        return boosterRecipe;

    }

}
