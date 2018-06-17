package loly.modonepointo.blocks;

import loly.modonepointo.MaterialHeavySand;
import loly.modonepointo.ModOnePointO;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class HeavySand extends Block {
    public HeavySand(int harvestLevel) {
        super(new MaterialHeavySand());
        setCreativeTab(ModOnePointO.tabOnePointO);
        setHarvestLevel("shovel", harvestLevel);
        switch (harvestLevel) {
            case 3: setHardness(5);
                    setRegistryName("heavysand");
                    setUnlocalizedName(ModOnePointO.MODID + ".heavysand");
                    break;
            case 4: setHardness(8);
                    setRegistryName("densesand");
                    setUnlocalizedName(ModOnePointO.MODID + ".densesand");
                    break;
            case 5: setHardness(10);
                    setRegistryName("compressedsand");
                    setUnlocalizedName(ModOnePointO.MODID + ".compressedsand");
                    break;
            case 6: setHardness(20);
                    setRegistryName("gravitysand");
                    setUnlocalizedName(ModOnePointO.MODID + ".gravitysand");
                    break;
        }
    }
}
