package loly.modonepointo.items;

import loly.modonepointo.ModOnePointO;
import loly.modonepointo.materials.ToolMaterials;
import net.minecraft.item.ItemSpade;

public class ShovelForged extends ItemSpade {
    public ShovelForged() {
        super(ToolMaterials.FORGED_MINERAL);
        setCreativeTab(ModOnePointO.tabOnePointO);
        setMaxStackSize(1);
        setRegistryName("shovelforgedmineral");
        setUnlocalizedName(ModOnePointO.MODID + ".shovelforgedmineral");
    }
}
