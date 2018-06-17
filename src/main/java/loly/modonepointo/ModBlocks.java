package loly.modonepointo;

import loly.modonepointo.blocks.FirstBlock;
import loly.modonepointo.blocks.HeavySand;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder("modonepointo")
public class ModBlocks {

    @GameRegistry.ObjectHolder("firstblock")
    public static final FirstBlock firstBlock = null;

    @GameRegistry.ObjectHolder("heavysand")
    public static final HeavySand heavySand = null;

    @GameRegistry.ObjectHolder("densesand")
    public static final HeavySand denseSand = null;

    @GameRegistry.ObjectHolder("compressedsand")
    public static final HeavySand compressedSand = null;

    @GameRegistry.ObjectHolder("gravitysand")
    public static final HeavySand gravitySand = null;
}
