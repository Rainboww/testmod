package loly.modonepointo.materials;

import loly.modonepointo.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class ToolMaterials {
    public static Item.ToolMaterial CAST_MINERAL = EnumHelper.addToolMaterial(
            "cast mineral",
            6,
            200,
            11F,
            5F,
            15);
    public static Item.ToolMaterial STURDY_MINERAL = EnumHelper.addToolMaterial(
            "sturdy mineral",
            4,
            420,
            10.0F,
            5F,
            5);
    public static Item.ToolMaterial FORGED_MINERAL = EnumHelper.addToolMaterial(
            "forged mineral",
            5,
            750,
            10.5F,
            5F,
            8);
    public static Item.ToolMaterial GRAVITON = EnumHelper.addToolMaterial(
            "graviton",
            7,
            -1,
            11F,
            5F,
            10);

    public static void initializeRepairMaterials() {
        CAST_MINERAL.setRepairItem(new ItemStack(ModItems.mineralChunk));
        STURDY_MINERAL.setRepairItem(new ItemStack(ModItems.mineralChunk));
        FORGED_MINERAL.setRepairItem(new ItemStack(ModItems.mineralChunk));
    }
}
