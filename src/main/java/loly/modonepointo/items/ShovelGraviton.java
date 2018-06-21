package loly.modonepointo.items;

import loly.modonepointo.ModItems;
import loly.modonepointo.ModOnePointO;
import loly.modonepointo.materials.ToolMaterials;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class ShovelGraviton extends ItemSpade {
    public ShovelGraviton() {
        super(ToolMaterials.GRAVITON);
        setCreativeTab(ModOnePointO.tabOnePointO);
        setMaxStackSize(1);
        setRegistryName("shovelgraviton");
        setUnlocalizedName(ModOnePointO.MODID + ".shovelgraviton");
    }
}
