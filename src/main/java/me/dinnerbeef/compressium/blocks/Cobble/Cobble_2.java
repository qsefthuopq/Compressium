package me.dinnerbeef.compressium.blocks.Cobble;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Cobble_2 extends Block {
    public Cobble_2() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE).hardnessAndResistance(2.0f));
        setRegistryName("cobble_2");
    }
}
