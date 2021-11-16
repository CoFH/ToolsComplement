package cofh.toolscomplement.init;

import cofh.core.item.ArmorItemCoFH;
import cofh.lib.item.ArmorMaterialCoFH;
import cofh.lib.item.ItemTierCoFH;
import cofh.lib.item.impl.*;
import cofh.lib.util.helpers.MathHelper;
import cofh.lib.util.references.ItemTagsCoFH;
import cofh.toolscomplement.ToolsComplement;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvents;

import static cofh.lib.util.constants.Constants.ID_TOOLS_COMPLEMENT;
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

        registerArmorSet("copper", ARMOR_MATERIAL_COPPER, combat);
        registerArmorSet("tin", ARMOR_MATERIAL_TIN, combat);
        registerArmorSet("lead", ARMOR_MATERIAL_LEAD, combat);
        registerArmorSet("silver", ARMOR_MATERIAL_SILVER, combat);
        registerArmorSet("nickel", ARMOR_MATERIAL_NICKEL, combat);
        registerArmorSet("bronze", ARMOR_MATERIAL_BRONZE, combat);
        registerArmorSet("electrum", ARMOR_MATERIAL_ELECTRUM, combat);
        registerArmorSet("invar", ARMOR_MATERIAL_INVAR, combat);
        registerArmorSet("constantan", ARMOR_MATERIAL_CONSTANTAN, combat);
    }

    // region TOOL MATERIALS
    public static final IItemTier TOOL_MATERIAL_COPPER = new ItemTierCoFH(1, 160, 4.5F, 1.5F, 9, () -> Ingredient.of(ItemTagsCoFH.INGOTS_COPPER));
    public static final IItemTier TOOL_MATERIAL_TIN = new ItemTierCoFH(0, 16, 13.0F, 0.0F, 18, () -> Ingredient.of(ItemTagsCoFH.INGOTS_TIN));
    public static final IItemTier TOOL_MATERIAL_LEAD = new ItemTierCoFH(1, 32, 12.0F, 1.0F, 16, () -> Ingredient.of(ItemTagsCoFH.INGOTS_LEAD));
    public static final IItemTier TOOL_MATERIAL_SILVER = new ItemTierCoFH(0, 24, 14.0F, 0.0F, 30, () -> Ingredient.of(ItemTagsCoFH.INGOTS_SILVER));
    public static final IItemTier TOOL_MATERIAL_NICKEL = new ItemTierCoFH(2, 225, 7.0F, 2.5F, 12, () -> Ingredient.of(ItemTagsCoFH.INGOTS_NICKEL));

    public static final IItemTier TOOL_MATERIAL_BRONZE = new ItemTierCoFH(2, 325, 5.5F, 2.0F, 16, () -> Ingredient.of(ItemTagsCoFH.INGOTS_BRONZE));
    public static final IItemTier TOOL_MATERIAL_ELECTRUM = new ItemTierCoFH(0, 96, 13.0F, 0.0F, 28, () -> Ingredient.of(ItemTagsCoFH.INGOTS_ELECTRUM));
    public static final IItemTier TOOL_MATERIAL_INVAR = new ItemTierCoFH(2, 300, 7.0F, 2.5F, 13, () -> Ingredient.of(ItemTagsCoFH.INGOTS_INVAR));
    public static final IItemTier TOOL_MATERIAL_CONSTANTAN = new ItemTierCoFH(1, 250, 5.5F, 2.0F, 10, () -> Ingredient.of(ItemTagsCoFH.INGOTS_CONSTANTAN));
    // endregion

    // region ARMOR MATERIALS
    public static final ArmorMaterialCoFH ARMOR_MATERIAL_COPPER = new ArmorMaterialCoFH(ID_TOOLS_COMPLEMENT + ":copper", 7, new int[]{1, 3, 4, 1}, 11, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ItemTagsCoFH.INGOTS_COPPER));
    public static final ArmorMaterialCoFH ARMOR_MATERIAL_TIN = new ArmorMaterialCoFH(ID_TOOLS_COMPLEMENT + ":tin", 8, new int[]{1, 3, 4, 1}, 20, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ItemTagsCoFH.INGOTS_TIN));
    public static final ArmorMaterialCoFH ARMOR_MATERIAL_LEAD = new ArmorMaterialCoFH(ID_TOOLS_COMPLEMENT + ":lead", 12, new int[]{2, 4, 5, 2}, 18, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ItemTagsCoFH.INGOTS_LEAD));
    public static final ArmorMaterialCoFH ARMOR_MATERIAL_SILVER = new ArmorMaterialCoFH(ID_TOOLS_COMPLEMENT + ":silver", 6, new int[]{1, 3, 5, 2}, 32, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> Ingredient.of(ItemTagsCoFH.INGOTS_SILVER));
    public static final ArmorMaterialCoFH ARMOR_MATERIAL_NICKEL = new ArmorMaterialCoFH(ID_TOOLS_COMPLEMENT + ":nickel", 14, new int[]{2, 5, 5, 2}, 14, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ItemTagsCoFH.INGOTS_NICKEL));

    public static final ArmorMaterialCoFH ARMOR_MATERIAL_BRONZE = new ArmorMaterialCoFH(ID_TOOLS_COMPLEMENT + ":bronze", 16, new int[]{2, 5, 6, 2}, 18, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ItemTagsCoFH.INGOTS_BRONZE));
    public static final ArmorMaterialCoFH ARMOR_MATERIAL_ELECTRUM = new ArmorMaterialCoFH(ID_TOOLS_COMPLEMENT + ":electrum", 7, new int[]{1, 3, 5, 2}, 30, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> Ingredient.of(ItemTagsCoFH.INGOTS_ELECTRUM));
    public static final ArmorMaterialCoFH ARMOR_MATERIAL_INVAR = new ArmorMaterialCoFH(ID_TOOLS_COMPLEMENT + ":invar", 15, new int[]{2, 5, 7, 2}, 15, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ItemTagsCoFH.INGOTS_INVAR));
    public static final ArmorMaterialCoFH ARMOR_MATERIAL_CONSTANTAN = new ArmorMaterialCoFH(ID_TOOLS_COMPLEMENT + ":constantan", 8, new int[]{1, 4, 4, 2}, 12, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ItemTagsCoFH.INGOTS_CONSTANTAN));
    // endregion

    // region HELPERS
    private static void registerFullToolSet(String prefix, IItemTier tier, ItemGroup toolGroup, ItemGroup combatGroup) {

        registerStandardToolSet(prefix, tier, toolGroup, combatGroup);
        registerExtraToolSet(prefix, tier, toolGroup, combatGroup);
    }

    private static void registerStandardToolSet(String prefix, IItemTier tier, ItemGroup toolGroup, ItemGroup combatGroup) {

        ITEMS.register(prefix + "_shovel", () -> new ShovelItemCoFH(tier, 1.5F, -3.0F, new Item.Properties().tab(toolGroup)).setDisplayGroup(() -> ToolsComplement.itemGroup));
        ITEMS.register(prefix + "_pickaxe", () -> new PickaxeItemCoFH(tier, 1, -2.8F, new Item.Properties().tab(toolGroup)).setDisplayGroup(() -> ToolsComplement.itemGroup));
        ITEMS.register(prefix + "_axe", () -> new AxeItemCoFH(tier, tier.getAttackDamageBonus() > 0 ? 8.0F - tier.getAttackDamageBonus() : 6.0F, MathHelper.clamp(-3.7F + tier.getSpeed() / 10, -3.2F, -3.0F), new Item.Properties().tab(toolGroup)).setDisplayGroup(() -> ToolsComplement.itemGroup));
        ITEMS.register(prefix + "_hoe", () -> new HoeItemCoFH(tier, -tier.getLevel(), Math.min(-3.0F + tier.getLevel(), 0.0F), new Item.Properties().tab(toolGroup)).setDisplayGroup(() -> ToolsComplement.itemGroup));

        ITEMS.register(prefix + "_sword", () -> new SwordItemCoFH(tier, 3, -2.4F, new Item.Properties().tab(combatGroup)).setDisplayGroup(() -> ToolsComplement.itemGroup));
    }

    private static void registerExtraToolSet(String prefix, IItemTier tier, ItemGroup toolGroup, ItemGroup combatGroup) {

        ITEMS.register(prefix + "_excavator", () -> new ExcavatorItem(tier, new Item.Properties().tab(toolGroup)).setDisplayGroup(() -> ToolsComplement.itemGroup));
        ITEMS.register(prefix + "_hammer", () -> new HammerItem(tier, new Item.Properties().tab(toolGroup)).setDisplayGroup(() -> ToolsComplement.itemGroup));
        ITEMS.register(prefix + "_sickle", () -> new SickleItem(tier, new Item.Properties().tab(toolGroup)).setDisplayGroup(() -> ToolsComplement.itemGroup));

        ITEMS.register(prefix + "_knife", () -> new KnifeItem(tier, new Item.Properties().tab(combatGroup)).setDisplayGroup(() -> ToolsComplement.itemGroup));
    }

    private static void registerArmorSet(String prefix, IArmorMaterial material, ItemGroup armorGroup) {

        ITEMS.register(prefix + "_helmet", () -> new ArmorItemCoFH(material, EquipmentSlotType.HEAD, new Item.Properties().tab(armorGroup)).setDisplayGroup(() -> ToolsComplement.itemGroup));
        ITEMS.register(prefix + "_chestplate", () -> new ArmorItemCoFH(material, EquipmentSlotType.CHEST, new Item.Properties().tab(armorGroup)).setDisplayGroup(() -> ToolsComplement.itemGroup));
        ITEMS.register(prefix + "_leggings", () -> new ArmorItemCoFH(material, EquipmentSlotType.LEGS, new Item.Properties().tab(armorGroup)).setDisplayGroup(() -> ToolsComplement.itemGroup));
        ITEMS.register(prefix + "_boots", () -> new ArmorItemCoFH(material, EquipmentSlotType.FEET, new Item.Properties().tab(armorGroup)).setDisplayGroup(() -> ToolsComplement.itemGroup));
    }
    // endregion
}
