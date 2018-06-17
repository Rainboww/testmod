package loly.modonepointo;

import loly.modonepointo.blocks.FirstBlock;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModTab extends CreativeTabs {
    public ModTab(int i, String s) {
        super(i, s);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack getTabIconItem() {
        return new ItemStack(ModBlocks.firstBlock);
    }
    @Override
    public String getTranslatedTabLabel(){
        return "1.0 blocks";
    }
}
