package cofh.toolscomplement.init;

import cofh.lib.util.flags.FlagManager;

import java.util.function.BooleanSupplier;

import static cofh.lib.util.constants.ModIds.ID_TOOLS_COMPLEMENT;

public class TComFlags {

    private TComFlags() {

    }

    private static final FlagManager FLAG_MANAGER = new FlagManager(ID_TOOLS_COMPLEMENT);

    public static FlagManager manager() {

        return FLAG_MANAGER;
    }

    public static void setFlag(String flag, boolean enable) {

        FLAG_MANAGER.setFlag(flag, enable);
    }

    public static void setFlag(String flag, BooleanSupplier condition) {

        FLAG_MANAGER.setFlag(flag, condition);
    }

    public static BooleanSupplier getFlag(String flag) {

        return FLAG_MANAGER.getFlag(flag);
    }

    // region SPECIFIC FEATURES
    public static String FLAG_IRON_TOOLS = "iron_tools";
    public static String FLAG_GOLD_TOOLS = "gold_tools";
    public static String FLAG_DIAMOND_TOOLS = "diamond_tools";
    public static String FLAG_NETHERITE_TOOLS = "netherite_tools";

    public static String FLAG_COPPER_TOOLS = "copper_tools";
    public static String FLAG_TIN_TOOLS = "tin_tools";
    public static String FLAG_LEAD_TOOLS = "lead_tools";
    public static String FLAG_SILVER_TOOLS = "silver_tools";
    public static String FLAG_NICKEL_TOOLS = "nickel_tools";
    public static String FLAG_BRONZE_TOOLS = "bronze_tools";
    public static String FLAG_ELECTRUM_TOOLS = "electrum_tools";
    public static String FLAG_INVAR_TOOLS = "invar_tools";
    public static String FLAG_CONSTANTAN_TOOLS = "constantan_tools";

    public static String FLAG_COPPER_ARMOR = "copper_armor";
    public static String FLAG_TIN_ARMOR = "tin_armor";
    public static String FLAG_LEAD_ARMOR = "lead_armor";
    public static String FLAG_SILVER_ARMOR = "silver_armor";
    public static String FLAG_NICKEL_ARMOR = "nickel_armor";
    public static String FLAG_BRONZE_ARMOR = "bronze_armor";
    public static String FLAG_ELECTRUM_ARMOR = "electrum_armor";
    public static String FLAG_INVAR_ARMOR = "invar_armor";
    public static String FLAG_CONSTANTAN_ARMOR = "constantan_armor";
    // endregion
}
