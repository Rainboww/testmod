package loly.modonepointo.materials;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class MaterialHeavySand extends Material {
    public MaterialHeavySand() {
        super(MapColor.SAND);
        this.setRequiresTool();
    }
}
