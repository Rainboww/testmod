package loly.modonepointo.blocks;

import loly.modonepointo.ModOnePointO;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class FirstBlock extends Block {
    public FirstBlock() {
        super(Material.ROCK);
        setUnlocalizedName(ModOnePointO.MODID + ".firstblock");     // Used for localization (en_US.lang)
        setRegistryName("firstblock");        // The unique name (within your mod) that identifies this block
    }
}
