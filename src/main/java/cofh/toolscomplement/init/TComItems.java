package cofh.toolscomplement.init;

import cofh.lib.item.ItemTierCoFH;
import cofh.lib.item.impl.*;
import cofh.lib.util.helpers.MathHelper;
import cofh.lib.util.references.ItemTagsCoFH;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.crafting.Ingredient;

import static cofh.toolscomplement.ToolsComplement.ITEMS;

public class TComItems {

    private TComItems() {

    }

    public static void register() {

        ItemGroup combat = ItemGroup.TAB_COMBAT;
        ItemGroup tools = ItemGroup.TAB_TOOLS;

        registerExtraToolSet("iron", ItemTier.IRON, tools, combat);
        registerExtraToolSet("gold", ItemTier.GOLD, tools, combat);
        registerExtraToolSet("diamond", ItemTier.DIAMOND, tools, combat);
        registerExtraToolSet("netherite", ItemTier.NETHERITE, tools, combat);

        registerFullToolSet("copper", TOOL_MATERIAL_COPPER, tools, combat);
        registerFullToolSet("tin", TOOL_MATERIAL_TIN, tools, combat);
        registerFullToolSet("lead", TOOL_MATERIAL_LEAD, tools, combat);
        registerFullToolSet("silver", TOOL_MATERIAL_SILVER, tools, combat);
        registerFullToolSet("nickel", TOOL_MATERIAL_NICKEL, tools, combat);

        registerFullToolSet("bronze", TOOL_MATERIAL_BRONZE, tools, combat);
        registerFullToolSet("electrum", TOOL_MATERIAL_ELECTRUM, tools, combat);
        registerFullToolSet("invar", TOOL_MATERIAL_INVAR, tools, combat);
        registerFullToolSet("constantan", TOOL_MATERIAL_CONSTANTAN, tools, combat);
    }

    // region TOOL MATERIALS
    public static final IItemTier TOOL_MATERIAL_COPPER = new ItemTierCoFH(1, 160, 4.5F, 1.5F, 9, () -> Ingredient.of(ItemTagsCoFH.INGOTS_COPPER));
    public static final IItemTier TOOL_MATERIAL_TIN = new ItemTierCoFH(0, 16, 13.0F, 0.0F, 18, () -> Ingredient.of(ItemTagsCoFH.INGOTS_TIN));
    public static final IItemTier TOOL_MATERIAL_LEAD = new ItemTierCoFH(1, 32, 12.0F, 1.0F, 16, () -> Ingredient.of(ItemTagsCoFH.INGOTS_LEAD));
    public static final IItemTier TOOL_MATERIAL_SILVER = new ItemTierCoFH(0, 24, 14.0F, 0.0F, 30, () -> Ingredient.of(ItemTagsCoFH.INGOTS_SILVER));
    public static final IItemTier TOOL_MATERIAL_NICKEL = new ItemTierCoFH(2, 225, 7.0F, 2.5F, 12, () -> Ingredient.of(ItemTagsCoFH.INGOTS_NICKEL));

    public static final IItemTier TOOL_MATERIAL_BRONZE = new ItemTierCoFH(2, 275, 5.5F, 2.0F, 16, () -> Ingredient.of(ItemTagsCoFH.INGOTS_BRONZE));
    public static final IItemTier TOOL_MATERIAL_ELECTRUM = new ItemTierCoFH(0, 96, 13.0F, 0.0F, 28, () -> Ingredient.of(ItemTagsCoFH.INGOTS_ELECTRUM));
    public static final IItemTier TOOL_MATERIAL_INVAR = new ItemTierCoFH(2, 375, 8.0F, 2.5F, 13, () -> Ingredient.of(ItemTagsCoFH.INGOTS_INVAR));
    public static final IItemTier TOOL_MATERIAL_CONSTANTAN = new ItemTierCoFH(1, 250, 5.5F, 2.0F, 10, () -> Ingredient.of(ItemTagsCoFH.INGOTS_CONSTANTAN));
    // endregion

    // region HELPERS
    private static void registerFullToolSet(String prefix, IItemTier tier, ItemGroup toolGroup, ItemGroup combatGroup) {

        registerStandardToolSet(prefix, tier, toolGroup, combatGroup);
        registerExtraToolSet(prefix, tier, toolGroup, combatGroup);
    }

    private static void registerStandardToolSet(String prefix, IItemTier tier, ItemGroup toolGroup, ItemGroup combatGroup) {

        ITEMS.register(prefix + "_shovel", () -> new ShovelItemCoFH(tier, 1.5F, -3.0F, new Item.Properties().tab(toolGroup)));
        ITEMS.register(prefix + "_pickaxe", () -> new PickaxeItemCoFH(tier, 1, -2.8F, new Item.Properties().tab(toolGroup)));
        ITEMS.register(prefix + "_axe", () -> new AxeItemCoFH(tier, tier.getAttackDamageBonus() > 0 ? 8.0F - tier.getAttackDamageBonus() : 6.0F, MathHelper.clamp(-3.7F + tier.getSpeed() / 10, -3.2F, -3.0F), new Item.Properties().tab(toolGroup)));
        ITEMS.register(prefix + "_hoe", () -> new HoeItemCoFH(tier, -tier.getLevel(), Math.min(-3.0F + tier.getLevel(), 0.0F), new Item.Properties().tab(toolGroup)));

        ITEMS.register(prefix + "_sword", () -> new SwordItemCoFH(tier, 3, -2.4F, new Item.Properties().tab(combatGroup)));
    }

    private static void registerExtraToolSet(String prefix, IItemTier tier, ItemGroup toolGroup, ItemGroup combatGroup) {

        ITEMS.register(prefix + "_excavator", () -> new ExcavatorItem(tier, new Item.Properties().tab(toolGroup)));
        ITEMS.register(prefix + "_hammer", () -> new HammerItem(tier, new Item.Properties().tab(toolGroup)));
        ITEMS.register(prefix + "_sickle", () -> new SickleItem(tier, new Item.Properties().tab(toolGroup)));

        ITEMS.register(prefix + "_knife", () -> new KnifeItem(tier, 1, -1.0F, new Item.Properties().tab(combatGroup)));
    }
    // endregion
}
