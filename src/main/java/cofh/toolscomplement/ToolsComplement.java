package cofh.toolscomplement;

import cofh.core.client.event.CoreClientEvents;
import cofh.core.common.capability.CoreCapabilities;
import cofh.core.common.capability.templates.AreaEffectMiningItemWrapper;
import cofh.core.common.item.ExcavatorItem;
import cofh.core.common.item.HammerItem;
import cofh.core.common.item.SickleItem;
import cofh.lib.util.DeferredRegisterCoFH;
import cofh.toolscomplement.init.registries.ModCreativeTabs;
import cofh.toolscomplement.init.registries.ModItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static cofh.lib.util.FlagManager.setFlag;
import static cofh.lib.util.constants.ModIds.ID_TOOLS_COMPLEMENT;
import static cofh.toolscomplement.util.ModFlags.*;

@Mod (ID_TOOLS_COMPLEMENT)
public class ToolsComplement {

    public static final Logger LOG = LogManager.getLogger(ID_TOOLS_COMPLEMENT);
    // public static final ConfigManager CONFIG_MANAGER = new ConfigManager();

    public static final DeferredRegisterCoFH<Item> ITEMS = DeferredRegisterCoFH.create(BuiltInRegistries.ITEM, ID_TOOLS_COMPLEMENT);
    public static final DeferredRegisterCoFH<CreativeModeTab> CREATIVE_TABS = DeferredRegisterCoFH.create(BuiltInRegistries.CREATIVE_MODE_TAB, ID_TOOLS_COMPLEMENT);

    public ToolsComplement(ModContainer modContainer, IEventBus modEventBus) {

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::clientSetup);
        modEventBus.addListener(this::capabilitySetup);
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

    private void capabilitySetup(RegisterCapabilitiesEvent event) {

        ITEMS.getRegistryObjects().values().forEach((holder) -> {

            if (holder.value() instanceof ExcavatorItem excavator) {
                event.registerItem(CoreCapabilities.AreaEffectHandler.ITEM, (itemStack, context) -> new AreaEffectMiningItemWrapper(itemStack, excavator.radius, AreaEffectMiningItemWrapper.Type.EXCAVATOR), holder.value());
            }
            if (holder.value() instanceof HammerItem hammer) {
                event.registerItem(CoreCapabilities.AreaEffectHandler.ITEM, (itemStack, context) -> new AreaEffectMiningItemWrapper(itemStack, hammer.radius, AreaEffectMiningItemWrapper.Type.HAMMER), holder.value());
            }
            if (holder.value() instanceof SickleItem sickle) {
                event.registerItem(CoreCapabilities.AreaEffectHandler.ITEM, (itemStack, context) -> new AreaEffectMiningItemWrapper(itemStack, sickle.radius, sickle.height, AreaEffectMiningItemWrapper.Type.SICKLE), holder.value());
            }
        });
    }

    private void creativeTabSetup(final BuildCreativeModeTabContentsEvent event) {

        if (event.getTabKey() == CreativeModeTabs.COMBAT) {

        }
    }
    // endregion
}
