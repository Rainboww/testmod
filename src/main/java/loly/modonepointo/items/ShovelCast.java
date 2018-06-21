package loly.modonepointo.items;

import loly.modonepointo.ModOnePointO;
import loly.modonepointo.materials.ToolMaterials;
import net.minecraft.item.ItemSpade;

public class ShovelCast extends ItemSpade {
    public ShovelCast() {
        super(ToolMaterials.CAST_MINERAL);
        setCreativeTab(ModOnePointO.tabOnePointO);
        setMaxStackSize(1);
        setRegistryName("shovelcastmineral");
        setUnlocalizedName(ModOnePointO.MODID + ".shovelcastmineral");
    }
}
