package cofh.toolscomplement.init.registries;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;

import static cofh.lib.util.constants.ModIds.ID_TOOLS_COMPLEMENT;
import static cofh.toolscomplement.ToolsComplement.CREATIVE_TABS;
import static cofh.toolscomplement.ToolsComplement.ITEMS;

public class ModCreativeTabs {

    private ModCreativeTabs() {

    }

    public static void register() {

    }

    private static final RegistryObject<CreativeModeTab> TAB = CREATIVE_TABS.register(ID_TOOLS_COMPLEMENT, () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.tools_complement"))
            .icon(() -> new ItemStack(ITEMS.get("diamond_sickle")))
            .displayItems((parameters, output) -> ModItems.CREATIVE_TAB_ITEMS.forEach((item) -> output.accept(item.get())))
            .build());

}