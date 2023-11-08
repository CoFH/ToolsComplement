package cofh.toolscomplement;

import cofh.core.client.event.CoreClientEvents;
import cofh.lib.util.DeferredRegisterCoFH;
import cofh.toolscomplement.init.registries.ModCreativeTabs;
import cofh.toolscomplement.init.registries.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static cofh.lib.util.constants.ModIds.ID_TOOLS_COMPLEMENT;
import static cofh.toolscomplement.util.ModFlags.*;

@Mod (ID_TOOLS_COMPLEMENT)
public class ToolsComplement {

    public static final Logger LOG = LogManager.getLogger(ID_TOOLS_COMPLEMENT);
    // public static final ConfigManager CONFIG_MANAGER = new ConfigManager();

    public static final DeferredRegisterCoFH<Item> ITEMS = DeferredRegisterCoFH.create(ForgeRegistries.ITEMS, ID_TOOLS_COMPLEMENT);
    public static final DeferredRegisterCoFH<CreativeModeTab> CREATIVE_TABS = DeferredRegisterCoFH.create(Registries.CREATIVE_MODE_TAB, ID_TOOLS_COMPLEMENT);

    public ToolsComplement() {

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::clientSetup);
        // modEventBus.addListener(this::creativeTabSetup);

        //        CONFIG_MANAGER.register(modEventBus)
        //                .addServerConfig(new ArmorConfigGroup())
        //                .addServerConfig(new ToolConfigGroup());

        ITEMS.register(modEventBus);
        CREATIVE_TABS.register(modEventBus);

        ModItems.register();
        ModCreativeTabs.register();

        // TODO: Temporary; waiting on new config system.
        setFlag(FLAG_IRON_TOOLS, true);
        setFlag(FLAG_GOLD_TOOLS, true);
        setFlag(FLAG_DIAMOND_TOOLS, true);
        setFlag(FLAG_NETHERITE_TOOLS, true);

        setFlag(FLAG_COPPER_TOOLS, true);
        setFlag(FLAG_TIN_TOOLS, true);
        setFlag(FLAG_LEAD_TOOLS, true);
        setFlag(FLAG_SILVER_TOOLS, true);
        setFlag(FLAG_NICKEL_TOOLS, true);
        setFlag(FLAG_BRONZE_TOOLS, true);
        setFlag(FLAG_ELECTRUM_TOOLS, true);
        setFlag(FLAG_INVAR_TOOLS, true);
        setFlag(FLAG_CONSTANTAN_TOOLS, true);

        setFlag(FLAG_COPPER_ARMOR, true);
        setFlag(FLAG_TIN_ARMOR, true);
        setFlag(FLAG_LEAD_ARMOR, true);
        setFlag(FLAG_SILVER_ARMOR, true);
        setFlag(FLAG_NICKEL_ARMOR, true);
        setFlag(FLAG_BRONZE_ARMOR, true);
        setFlag(FLAG_ELECTRUM_ARMOR, true);
        setFlag(FLAG_INVAR_ARMOR, true);
        setFlag(FLAG_CONSTANTAN_ARMOR, true);
    }

    // region INITIALIZATION
    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void clientSetup(final FMLClientSetupEvent event) {

        event.enqueueWork(() -> CoreClientEvents.addNamespace(ID_TOOLS_COMPLEMENT));
    }

    private void creativeTabSetup(final BuildCreativeModeTabContentsEvent event) {

        if (event.getTabKey() == CreativeModeTabs.COMBAT) {

        }
    }
    // endregion
}
