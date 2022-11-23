package cofh.toolscomplement.init;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static cofh.toolscomplement.init.TComFlags.*;

public class TComConfig {

    private static boolean registered = false;

    public static void register() {

        if (registered) {
            return;
        }
        FMLJavaModLoadingContext.get().getModEventBus().register(TComConfig.class);
        registered = true;

        // genServerConfig();
        genClientConfig();

        // ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, serverSpec);
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, clientSpec);
    }

    private TComConfig() {

    }

    // region CONFIG SPEC
    private static final ForgeConfigSpec.Builder SERVER_CONFIG = new ForgeConfigSpec.Builder();
    private static ForgeConfigSpec serverSpec;

    private static final ForgeConfigSpec.Builder CLIENT_CONFIG = new ForgeConfigSpec.Builder();
    private static ForgeConfigSpec clientSpec;

    private static void genServerConfig() {

        SERVER_CONFIG.push("Tools");

        enableIronTools = SERVER_CONFIG
                .comment("If TRUE, Iron Tools are enabled.")
                .define("Iron Tools", true);

        enableGoldTools = SERVER_CONFIG
                .comment("If TRUE, Gold Tools are enabled.")
                .define("Gold Tools", true);

        enableDiamondTools = SERVER_CONFIG
                .comment("If TRUE, Diamond Tools are enabled.")
                .define("Diamond Tools", true);

        enableNetheriteTools = SERVER_CONFIG
                .comment("If TRUE, Netherite Tools are enabled.")
                .define("Netherite Tools", true);

        enableCopperTools = SERVER_CONFIG
                .comment("If TRUE, Copper Tools are enabled.")
                .define("Copper Tools", true);

        enableTinTools = SERVER_CONFIG
                .comment("If TRUE, Tin Tools are enabled.")
                .define("Tin Tools", true);

        enableLeadTools = SERVER_CONFIG
                .comment("If TRUE, Lead Tools are enabled.")
                .define("Lead Tools", true);

        enableSilverTools = SERVER_CONFIG
                .comment("If TRUE, Silver Tools are enabled.")
                .define("Silver Tools", true);

        enableNickelTools = SERVER_CONFIG
                .comment("If TRUE, Nickel Tools are enabled.")
                .define("Nickel Tools", true);

        enableBronzeTools = SERVER_CONFIG
                .comment("If TRUE, Bronze Tools are enabled.")
                .define("Bronze Tools", true);

        enableElectrumTools = SERVER_CONFIG
                .comment("If TRUE, Electrum Tools are enabled.")
                .define("Electrum Tools", true);

        enableInvarTools = SERVER_CONFIG
                .comment("If TRUE, Invar Tools are enabled.")
                .define("Invar Tools", true);

        enableConstantanTools = SERVER_CONFIG
                .comment("If TRUE, Constantan Tools are enabled.")
                .define("Constantan Tools", true);

        SERVER_CONFIG.pop();

        SERVER_CONFIG.push("Armor");

        enableCopperArmor = SERVER_CONFIG
                .comment("If TRUE, Copper Armor is enabled.")
                .define("Copper Armor", true);

        enableTinArmor = SERVER_CONFIG
                .comment("If TRUE, Tin Armor is enabled.")
                .define("Tin Armor", true);

        enableLeadArmor = SERVER_CONFIG
                .comment("If TRUE, Lead Armor is enabled.")
                .define("Lead Armor", true);

        enableSilverArmor = SERVER_CONFIG
                .comment("If TRUE, Silver Armor is enabled.")
                .define("Silver Armor", true);

        enableNickelArmor = SERVER_CONFIG
                .comment("If TRUE, Nickel Armor is enabled.")
                .define("Nickel Armor", true);

        enableBronzeArmor = SERVER_CONFIG
                .comment("If TRUE, Bronze Armor is enabled.")
                .define("Bronze Armor", true);

        enableElectrumArmor = SERVER_CONFIG
                .comment("If TRUE, Electrum Armor is enabled.")
                .define("Electrum Armor", true);

        enableInvarArmor = SERVER_CONFIG
                .comment("If TRUE, Invar Armor is enabled.")
                .define("Invar Armor", true);

        enableConstantanArmor = SERVER_CONFIG
                .comment("If TRUE, Constantan Armor is enabled.")
                .define("Constantan Armor", true);

        SERVER_CONFIG.pop();

        serverSpec = SERVER_CONFIG.build();
    }

    private static void genClientConfig() {

        enableCreativeTab = CLIENT_CONFIG
                .comment("If TRUE, Tool's Complement will have its own Item Group (Creative Tab).")
                .define("Enable Item Group", true);

        clientSpec = CLIENT_CONFIG.build();
    }

    private static void refreshServerConfig() {

        setFlag(FLAG_IRON_TOOLS, enableIronTools.get());
        setFlag(FLAG_GOLD_TOOLS, enableGoldTools.get());
        setFlag(FLAG_DIAMOND_TOOLS, enableDiamondTools.get());
        setFlag(FLAG_NETHERITE_TOOLS, enableNetheriteTools.get());

        setFlag(FLAG_COPPER_TOOLS, enableCopperTools.get());
        setFlag(FLAG_TIN_TOOLS, enableTinTools.get());
        setFlag(FLAG_LEAD_TOOLS, enableLeadTools.get());
        setFlag(FLAG_SILVER_TOOLS, enableSilverTools.get());
        setFlag(FLAG_NICKEL_TOOLS, enableNickelTools.get());
        setFlag(FLAG_BRONZE_TOOLS, enableBronzeTools.get());
        setFlag(FLAG_ELECTRUM_TOOLS, enableElectrumTools.get());
        setFlag(FLAG_INVAR_TOOLS, enableInvarTools.get());
        setFlag(FLAG_CONSTANTAN_TOOLS, enableConstantanTools.get());

        setFlag(FLAG_COPPER_ARMOR, enableCopperArmor.get());
        setFlag(FLAG_TIN_ARMOR, enableTinArmor.get());
        setFlag(FLAG_LEAD_ARMOR, enableLeadArmor.get());
        setFlag(FLAG_SILVER_ARMOR, enableSilverArmor.get());
        setFlag(FLAG_NICKEL_ARMOR, enableNickelArmor.get());
        setFlag(FLAG_BRONZE_ARMOR, enableBronzeArmor.get());
        setFlag(FLAG_ELECTRUM_ARMOR, enableElectrumArmor.get());
        setFlag(FLAG_INVAR_ARMOR, enableInvarArmor.get());
        setFlag(FLAG_CONSTANTAN_ARMOR, enableConstantanArmor.get());
    }

    private static void refreshClientConfig() {

    }
    // endregion

    // region VARIABLES
    public static BooleanValue enableCreativeTab;

    public static BooleanValue enableIronTools;
    public static BooleanValue enableGoldTools;
    public static BooleanValue enableDiamondTools;
    public static BooleanValue enableNetheriteTools;

    public static BooleanValue enableCopperTools;
    public static BooleanValue enableTinTools;
    public static BooleanValue enableLeadTools;
    public static BooleanValue enableSilverTools;
    public static BooleanValue enableNickelTools;
    public static BooleanValue enableBronzeTools;
    public static BooleanValue enableElectrumTools;
    public static BooleanValue enableInvarTools;
    public static BooleanValue enableConstantanTools;

    public static BooleanValue enableCopperArmor;
    public static BooleanValue enableTinArmor;
    public static BooleanValue enableLeadArmor;
    public static BooleanValue enableSilverArmor;
    public static BooleanValue enableNickelArmor;
    public static BooleanValue enableBronzeArmor;
    public static BooleanValue enableElectrumArmor;
    public static BooleanValue enableInvarArmor;
    public static BooleanValue enableConstantanArmor;
    // endregion

    // region CONFIGURATION
    @SubscribeEvent
    public static void configLoading(ModConfigEvent.Loading event) {

        switch (event.getConfig().getType()) {
            case CLIENT:
                refreshClientConfig();
                break;
            case SERVER:
                refreshServerConfig();
        }
    }

    @SubscribeEvent
    public static void configReloading(ModConfigEvent.Reloading event) {

        switch (event.getConfig().getType()) {
            case CLIENT:
                refreshClientConfig();
                break;
            case SERVER:
                refreshServerConfig();
        }
    }
    // endregion
}
