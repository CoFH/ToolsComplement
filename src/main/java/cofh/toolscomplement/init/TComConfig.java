package cofh.toolscomplement.init;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class TComConfig {

    private static boolean registered = false;

    public static void register() {

        if (registered) {
            return;
        }
        FMLJavaModLoadingContext.get().getModEventBus().register(TComConfig.class);
        registered = true;

        genServerConfig();
        genClientConfig();

        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, serverSpec);
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

        serverSpec = SERVER_CONFIG.build();

        refreshServerConfig();
    }

    private static void genClientConfig() {

        enableCreativeTab = CLIENT_CONFIG
                .comment("If TRUE, Tool's Complement will have its own Item Group (Creative Tab).")
                .define("Enable Item Group", true);

        clientSpec = CLIENT_CONFIG.build();

        refreshClientConfig();
    }

    private static void refreshServerConfig() {

    }

    private static void refreshClientConfig() {

    }
    // endregion

    // region VARIABLES
    public static BooleanValue enableCreativeTab;

    public static BooleanValue enableWoodTools;
    public static BooleanValue enableStoneTools;
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
    public static void configLoading(ModConfig.Loading event) {

        switch (event.getConfig().getType()) {
            case CLIENT:
                refreshClientConfig();
                break;
            case SERVER:
                refreshServerConfig();
        }
    }

    @SubscribeEvent
    public static void configReloading(ModConfig.Reloading event) {

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
