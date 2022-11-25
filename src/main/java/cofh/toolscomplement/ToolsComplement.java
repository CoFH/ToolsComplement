package cofh.toolscomplement;

import cofh.lib.util.DeferredRegisterCoFH;
import cofh.toolscomplement.init.TComItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static cofh.lib.util.constants.ModIds.ID_TOOLS_COMPLEMENT;
import static cofh.toolscomplement.init.TComFlags.*;

@Mod (ID_TOOLS_COMPLEMENT)
public class ToolsComplement {

    public static final Logger LOG = LogManager.getLogger(ID_TOOLS_COMPLEMENT);
    // public static final ConfigManager CONFIG_MANAGER = new ConfigManager();

    public static final DeferredRegisterCoFH<Item> ITEMS = DeferredRegisterCoFH.create(ForgeRegistries.ITEMS, ID_TOOLS_COMPLEMENT);

    public static CreativeModeTab TCOM_GROUP = new CreativeModeTab(-1, ID_TOOLS_COMPLEMENT) {

        @Override
        @OnlyIn (Dist.CLIENT)
        public ItemStack makeIcon() {

            return new ItemStack(ITEMS.get("diamond_sickle"));
        }
    };

    public ToolsComplement() {

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        //        CONFIG_MANAGER.register(modEventBus)
        //                .addServerConfig(new ArmorConfigGroup())
        //                .addServerConfig(new ToolConfigGroup());

        ITEMS.register(modEventBus);

        TComItems.register();

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
    // endregion
}
