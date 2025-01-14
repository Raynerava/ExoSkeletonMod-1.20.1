package ra.exomod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import ra.exomod.Exomod;

public class ModItemGroups {
    public static final ItemGroup EXO_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Exomod.MOD_ID,"exo"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.exo"))
                    .icon(()->new ItemStack(ModItems.CANON)).entries((displayContext, entries) -> {
                        // icon is what to display on the top of item stack. Here I refers to ModItems.CANON, which means CANON's texture will be used.
                        entries.add(new ItemStack(ModItems.CANON));
                        entries.add(new ItemStack(ModItems.COCKPIT));
//the order of adding item here is also the order of in game display.


                    }).build());

    public static void registerItemGroups() {
        Exomod.LOGGER.info("Registering Mod Item Groups for " + Exomod.MOD_ID);
    }
}
