package loly.modonepointo.items;

import loly.modonepointo.ModOnePointO;
import loly.modonepointo.materials.ToolMaterials;
import net.minecraft.item.ItemSpade;

public class ShovelSturdy extends ItemSpade {
    public ShovelSturdy() {
        super(ToolMaterials.STURDY_MINERAL);
        setCreativeTab(ModOnePointO.tabOnePointO);
        setMaxStackSize(1);
        setRegistryName("shovelsturdymineral");
        setUnlocalizedName(ModOnePointO.MODID + ".shovelsturdymineral");
    }
}
