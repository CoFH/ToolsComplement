package cofh.toolscomplement.init.registries;

import cofh.core.common.item.*;
import cofh.lib.common.item.*;
import cofh.lib.init.tags.ItemTagsCoFH;
import cofh.lib.util.helpers.MathHelper;
import com.google.common.collect.Sets;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashSet;
import java.util.function.Supplier;

import static cofh.lib.util.Utils.itemProperties;
import static cofh.lib.util.constants.ModIds.ID_TOOLS_COMPLEMENT;
import static cofh.toolscomplement.ToolsComplement.ITEMS;

public class ModItems {

    private ModItems() {

    }

    public static LinkedHashSet<RegistryObject<Item>> CREATIVE_TAB_ITEMS = Sets.newLinkedHashSet();

    public static RegistryObject<Item> registerWithTab(final String name, final Supplier<Item> supplier) {

        RegistryObject<Item> reg = ITEMS.register(name, supplier);
        CREATIVE_TAB_ITEMS.add(reg);
        return reg;
    }

    public static void register() {

        armorMaterialCopper = new ArmorMaterialCoFH(ID_TOOLS_COMPLEMENT + ":copper", 7, new int[]{1, 3, 4, 1}, 11, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(Tags.Items.INGOTS_COPPER));
        armorMaterialTin = new ArmorMaterialCoFH(ID_TOOLS_COMPLEMENT + ":tin", 8, new int[]{1, 3, 4, 1}, 20, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ItemTagsCoFH.INGOTS_TIN));
        armorMaterialLead = new ArmorMaterialCoFH(ID_TOOLS_COMPLEMENT + ":lead", 12, new int[]{2, 4, 5, 2}, 18, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ItemTagsCoFH.INGOTS_LEAD));
        armorMaterialSilver = new ArmorMaterialCoFH(ID_TOOLS_COMPLEMENT + ":silver", 6, new int[]{1, 3, 5, 2}, 32, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> Ingredient.of(ItemTagsCoFH.INGOTS_SILVER));
        armorMaterialNickel = new ArmorMaterialCoFH(ID_TOOLS_COMPLEMENT + ":nickel", 14, new int[]{2, 5, 5, 2}, 14, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ItemTagsCoFH.INGOTS_NICKEL));
        armorMaterialBronze = new ArmorMaterialCoFH(ID_TOOLS_COMPLEMENT + ":bronze", 16, new int[]{2, 5, 6, 2}, 18, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ItemTagsCoFH.INGOTS_BRONZE));
        armorMaterialElectrum = new ArmorMaterialCoFH(ID_TOOLS_COMPLEMENT + ":electrum", 7, new int[]{1, 3, 5, 2}, 30, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> Ingredient.of(ItemTagsCoFH.INGOTS_ELECTRUM));
        armorMaterialInvar = new ArmorMaterialCoFH(ID_TOOLS_COMPLEMENT + ":invar", 15, new int[]{2, 5, 7, 2}, 15, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ItemTagsCoFH.INGOTS_INVAR));
        armorMaterialConstantan = new ArmorMaterialCoFH(ID_TOOLS_COMPLEMENT + ":constantan", 8, new int[]{1, 4, 4, 2}, 12, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(ItemTagsCoFH.INGOTS_CONSTANTAN));

        registerExtraToolSet("iron", Tiers.IRON);
        registerExtraToolSet("gold", Tiers.GOLD);
        registerExtraToolSet("diamond", Tiers.DIAMOND);
        registerExtraToolSet("netherite", Tiers.NETHERITE);

        registerFullToolSet("copper", TOOL_MATERIAL_COPPER);
        registerFullToolSet("tin", TOOL_MATERIAL_TIN);
        registerFullToolSet("lead", TOOL_MATERIAL_LEAD);
        registerFullToolSet("silver", TOOL_MATERIAL_SILVER);
        registerFullToolSet("nickel", TOOL_MATERIAL_NICKEL);
        registerFullToolSet("bronze", TOOL_MATERIAL_BRONZE);
        registerFullToolSet("electrum", TOOL_MATERIAL_ELECTRUM);
        registerFullToolSet("invar", TOOL_MATERIAL_INVAR);
        registerFullToolSet("constantan", TOOL_MATERIAL_CONSTANTAN);

        registerArmorSet("copper", armorMaterialCopper);
        registerArmorSet("tin", armorMaterialTin);
        registerArmorSet("lead", armorMaterialLead);
        registerArmorSet("silver", armorMaterialSilver);
        registerArmorSet("nickel", armorMaterialNickel);
        registerArmorSet("bronze", armorMaterialBronze);
        registerArmorSet("electrum", armorMaterialElectrum);
        registerArmorSet("invar", armorMaterialInvar);
        registerArmorSet("constantan", armorMaterialConstantan);
    }

    // region TOOL MATERIALS
    public static final Tier TOOL_MATERIAL_COPPER = new ItemTierCoFH(1, 160, 4.5F, 1.5F, 9, () -> Ingredient.of(Tags.Items.INGOTS_COPPER));
    public static final Tier TOOL_MATERIAL_TIN = new ItemTierCoFH(0, 16, 13.0F, 0.0F, 18, () -> Ingredient.of(ItemTagsCoFH.INGOTS_TIN));
    public static final Tier TOOL_MATERIAL_LEAD = new ItemTierCoFH(1, 32, 12.0F, 1.0F, 16, () -> Ingredient.of(ItemTagsCoFH.INGOTS_LEAD));
    public static final Tier TOOL_MATERIAL_SILVER = new ItemTierCoFH(0, 24, 14.0F, 0.0F, 30, () -> Ingredient.of(ItemTagsCoFH.INGOTS_SILVER));
    public static final Tier TOOL_MATERIAL_NICKEL = new ItemTierCoFH(2, 225, 7.0F, 2.5F, 12, () -> Ingredient.of(ItemTagsCoFH.INGOTS_NICKEL));

    public static final Tier TOOL_MATERIAL_BRONZE = new ItemTierCoFH(2, 325, 5.5F, 2.0F, 16, () -> Ingredient.of(ItemTagsCoFH.INGOTS_BRONZE));
    public static final Tier TOOL_MATERIAL_ELECTRUM = new ItemTierCoFH(0, 96, 13.0F, 0.0F, 28, () -> Ingredient.of(ItemTagsCoFH.INGOTS_ELECTRUM));
    public static final Tier TOOL_MATERIAL_INVAR = new ItemTierCoFH(2, 300, 7.0F, 2.5F, 13, () -> Ingredient.of(ItemTagsCoFH.INGOTS_INVAR));
    public static final Tier TOOL_MATERIAL_CONSTANTAN = new ItemTierCoFH(1, 250, 5.5F, 2.0F, 10, () -> Ingredient.of(ItemTagsCoFH.INGOTS_CONSTANTAN));
    // endregion

    // region ARMOR MATERIALS
    public static ArmorMaterialCoFH armorMaterialCopper;
    public static ArmorMaterialCoFH armorMaterialTin;
    public static ArmorMaterialCoFH armorMaterialLead;
    public static ArmorMaterialCoFH armorMaterialSilver;
    public static ArmorMaterialCoFH armorMaterialNickel;
    public static ArmorMaterialCoFH armorMaterialBronze;
    public static ArmorMaterialCoFH armorMaterialElectrum;
    public static ArmorMaterialCoFH armorMaterialInvar;
    public static ArmorMaterialCoFH armorMaterialConstantan;
    // endregion

    // region HELPERS
    private static void registerFullToolSet(String prefix, Tier tier) {

        registerStandardToolSet(prefix, tier);
        registerExtraToolSet(prefix, tier);
    }

    private static void registerStandardToolSet(String prefix, Tier tier) {

        registerWithTab(prefix + "_shovel", () -> new ShovelItemCoFH(tier, 1.5F, -3.0F, itemProperties()));
        registerWithTab(prefix + "_pickaxe", () -> new PickaxeItemCoFH(tier, 1, -2.8F, itemProperties()));
        registerWithTab(prefix + "_axe", () -> new AxeItemCoFH(tier, tier.getAttackDamageBonus() > 0 ? 8.0F - tier.getAttackDamageBonus() : 6.0F, MathHelper.clamp(-3.7F + tier.getSpeed() / 10, -3.2F, -3.0F), itemProperties()));
        registerWithTab(prefix + "_hoe", () -> new HoeItemCoFH(tier, -tier.getLevel(), Math.min(-3.0F + tier.getLevel(), 0.0F), itemProperties()));
        registerWithTab(prefix + "_sword", () -> new SwordItemCoFH(tier, 3, -2.4F, itemProperties()));
    }

    private static void registerExtraToolSet(String prefix, Tier tier) {

        registerWithTab(prefix + "_excavator", () -> new ExcavatorItem(tier, itemProperties()));
        registerWithTab(prefix + "_hammer", () -> new HammerItem(tier, itemProperties()));
        registerWithTab(prefix + "_sickle", () -> new SickleItem(tier, itemProperties()));
        registerWithTab(prefix + "_knife", () -> new KnifeItem(tier, itemProperties()));
    }

    private static void registerArmorSet(String prefix, ArmorMaterial material) {

        registerWithTab(prefix + "_helmet", () -> new ArmorItemCoFH(material, ArmorItem.Type.HELMET, itemProperties()));
        registerWithTab(prefix + "_chestplate", () -> new ArmorItemCoFH(material, ArmorItem.Type.CHESTPLATE, itemProperties()));
        registerWithTab(prefix + "_leggings", () -> new ArmorItemCoFH(material, ArmorItem.Type.LEGGINGS, itemProperties()));
        registerWithTab(prefix + "_boots", () -> new ArmorItemCoFH(material, ArmorItem.Type.BOOTS, itemProperties()));
    }
    // endregion
}
