package com.ullarah.umagic.block;

import com.ullarah.umagic.MagicFunctions;
import org.bukkit.block.Block;

public class Terracotta extends MagicFunctions {

    public Terracotta(Block block) {

        super(false);

        block.setData(block.getData() >= 7 ? (byte) 0 : (byte) (block.getData() + 1));

    }

}
