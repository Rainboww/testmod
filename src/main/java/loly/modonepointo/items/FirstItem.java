package loly.modonepointo.items;

import loly.modonepointo.ModOnePointO;
import net.minecraft.item.Item;

public class FirstItem extends Item {
    public FirstItem() {
        setRegistryName("FirstItem");
        setUnlocalizedName(ModOnePointO.MODID + ".firstitem");
        setCreativeTab(ModOnePointO.tabOnePointO);
    }
}
