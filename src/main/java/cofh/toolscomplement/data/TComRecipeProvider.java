package cofh.toolscomplement.data;

import cofh.lib.data.RecipeProviderCoFH;
import cofh.lib.tags.ItemTagsCoFH;
import cofh.lib.util.flags.FlagRecipeCondition;
import cofh.lib.util.flags.TagExistsRecipeCondition;
import cofh.toolscomplement.init.TComFlags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

import static cofh.lib.util.constants.ModIds.ID_TOOLS_COMPLEMENT;
import static cofh.toolscomplement.ToolsComplement.ITEMS;

public class TComRecipeProvider extends RecipeProviderCoFH {

    public TComRecipeProvider(DataGenerator generatorIn) {

        super(generatorIn, ID_TOOLS_COMPLEMENT);
        manager = TComFlags.manager();
    }

    @Override
    public String getName() {

        return "Tool's Complement: Recipes";
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        generateExtraToolSet("iron", "iron_ingot", Tags.Items.INGOTS_IRON, Tags.Items.STORAGE_BLOCKS_IRON, consumer);
        generateExtraToolSet("gold", "gold_ingot", Tags.Items.INGOTS_GOLD, Tags.Items.STORAGE_BLOCKS_GOLD, consumer);
        generateExtraToolSet("diamond", "diamond", Tags.Items.GEMS_DIAMOND, Tags.Items.STORAGE_BLOCKS_DIAMOND, consumer);
        // generateExtraToolSet("netherite", "netherite_ingot", Tags.Items.INGOTS_NETHERITE, Tags.Items.STORAGE_BLOCKS_NETHERITE, consumer);

        generateFullToolSet("copper", "copper_ingot", Tags.Items.INGOTS_COPPER, Tags.Items.STORAGE_BLOCKS_COPPER, consumer);
        generateFullToolSet("tin", "tin_ingot", ItemTagsCoFH.INGOTS_TIN, ItemTagsCoFH.STORAGE_BLOCKS_TIN, consumer);
        generateFullToolSet("lead", "lead_ingot", ItemTagsCoFH.INGOTS_LEAD, ItemTagsCoFH.STORAGE_BLOCKS_LEAD, consumer);
        generateFullToolSet("silver", "silver_ingot", ItemTagsCoFH.INGOTS_SILVER, ItemTagsCoFH.STORAGE_BLOCKS_SILVER, consumer);
        generateFullToolSet("nickel", "nickel_ingot", ItemTagsCoFH.INGOTS_NICKEL, ItemTagsCoFH.STORAGE_BLOCKS_NICKEL, consumer);
        generateFullToolSet("bronze", "bronze_ingot", ItemTagsCoFH.INGOTS_BRONZE, ItemTagsCoFH.STORAGE_BLOCKS_BRONZE, consumer);
        generateFullToolSet("electrum", "electrum_ingot", ItemTagsCoFH.INGOTS_ELECTRUM, ItemTagsCoFH.STORAGE_BLOCKS_ELECTRUM, consumer);
        generateFullToolSet("invar", "invar_ingot", ItemTagsCoFH.INGOTS_INVAR, ItemTagsCoFH.STORAGE_BLOCKS_INVAR, consumer);
        generateFullToolSet("constantan", "constantan_ingot", ItemTagsCoFH.INGOTS_CONSTANTAN, ItemTagsCoFH.STORAGE_BLOCKS_CONSTANTAN, consumer);

        generateArmorSet("copper", "copper_ingot", Tags.Items.INGOTS_COPPER, consumer);
        generateArmorSet("tin", "tin_ingot", ItemTagsCoFH.INGOTS_TIN, consumer);
        generateArmorSet("lead", "lead_ingot", ItemTagsCoFH.INGOTS_LEAD, consumer);
        generateArmorSet("silver", "silver_ingot", ItemTagsCoFH.INGOTS_SILVER, consumer);
        generateArmorSet("nickel", "nickel_ingot", ItemTagsCoFH.INGOTS_NICKEL, consumer);
        generateArmorSet("bronze", "bronze_ingot", ItemTagsCoFH.INGOTS_BRONZE, consumer);
        generateArmorSet("electrum", "electrum_ingot", ItemTagsCoFH.INGOTS_ELECTRUM, consumer);
        generateArmorSet("invar", "invar_ingot", ItemTagsCoFH.INGOTS_INVAR, consumer);
        generateArmorSet("constantan", "constantan_ingot", ItemTagsCoFH.INGOTS_CONSTANTAN, consumer);
    }

    // region HELPERS
    private void generateFullToolSet(String prefix, String itemName, TagKey<Item> tag, TagKey<Item> storage, Consumer<FinishedRecipe> consumer) {

        generateStandardToolSet(prefix, itemName, tag, consumer);
        generateExtraToolSet(prefix, itemName, tag, storage, consumer);
    }

    private void generateStandardToolSet(String prefix, String itemName, TagKey<Item> tag, Consumer<FinishedRecipe> consumer) {

        var reg = ITEMS;

        ShapedRecipeBuilder.shaped(reg.get(prefix + "_shovel"))
                .define('#', Items.STICK)
                .define('X', tag)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .unlockedBy("has_" + itemName, has(tag))
                .save(withConditions(consumer)
                        //.addCondition(new FlagRecipeCondition(manager, prefix + "_tools"))
                        .addCondition(new TagExistsRecipeCondition(tag.location()))
                );

        ShapedRecipeBuilder.shaped(reg.get(prefix + "_pickaxe"))
                .define('#', Items.STICK)
                .define('X', tag)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .unlockedBy("has_" + itemName, has(tag))
                .save(withConditions(consumer)
                        //.addCondition(new FlagRecipeCondition(manager, prefix + "_tools"))
                        .addCondition(new TagExistsRecipeCondition(tag.location()))
                );

        ShapedRecipeBuilder.shaped(reg.get(prefix + "_axe"))
                .define('#', Items.STICK)
                .define('X', tag)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .unlockedBy("has_" + itemName, has(tag))
                .save(withConditions(consumer)
                        //.addCondition(new FlagRecipeCondition(manager, prefix + "_tools"))
                        .addCondition(new TagExistsRecipeCondition(tag.location()))
                );

        ShapedRecipeBuilder.shaped(reg.get(prefix + "_hoe"))
                .define('#', Items.STICK)
                .define('X', tag)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .unlockedBy("has_" + itemName, has(tag))
                .save(withConditions(consumer)
                        //.addCondition(new FlagRecipeCondition(manager, prefix + "_tools"))
                        .addCondition(new TagExistsRecipeCondition(tag.location()))
                );

        ShapedRecipeBuilder.shaped(reg.get(prefix + "_sword"))
                .define('#', Items.STICK)
                .define('X', tag)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .unlockedBy("has_" + itemName, has(tag))
                .save(withConditions(consumer)
                        //.addCondition(new FlagRecipeCondition(manager, prefix + "_tools"))
                        .addCondition(new TagExistsRecipeCondition(tag.location()))
                );
    }

    private void generateExtraToolSet(String prefix, String itemName, TagKey<Item> tag, TagKey<Item> storage, Consumer<FinishedRecipe> consumer) {

        var reg = ITEMS;

        ShapedRecipeBuilder.shaped(reg.get(prefix + "_excavator"))
                .define('#', Items.STICK)
                .define('X', tag)
                .define('Y', storage)
                .pattern(" Y ")
                .pattern("X#X")
                .pattern(" # ")
                .unlockedBy("has_" + itemName, has(tag))
                .save(withConditions(consumer)
                        //.addCondition(new FlagRecipeCondition(manager, prefix + "_tools"))
                        .addCondition(new TagExistsRecipeCondition(tag.location()))
                );

        ShapedRecipeBuilder.shaped(reg.get(prefix + "_hammer"))
                .define('#', Items.STICK)
                .define('X', tag)
                .define('Y', storage)
                .pattern("XYX")
                .pattern("X#X")
                .pattern(" # ")
                .unlockedBy("has_" + itemName, has(tag))
                .save(withConditions(consumer)
                        //.addCondition(new FlagRecipeCondition(manager, prefix + "_tools"))
                        .addCondition(new TagExistsRecipeCondition(tag.location()))
                );

        ShapedRecipeBuilder.shaped(reg.get(prefix + "_sickle"))
                .define('#', Items.STICK)
                .define('X', tag)
                .pattern(" X ")
                .pattern("  X")
                .pattern("#X ")
                .unlockedBy("has_" + itemName, has(tag))
                .save(withConditions(consumer)
                        //.addCondition(new FlagRecipeCondition(manager, prefix + "_tools"))
                        .addCondition(new TagExistsRecipeCondition(tag.location()))
                );

        ShapedRecipeBuilder.shaped(reg.get(prefix + "_knife"))
                .define('#', Items.STICK)
                .define('X', tag)
                .pattern("X")
                .pattern("#")
                .unlockedBy("has_" + itemName, has(tag))
                .save(withConditions(consumer)
                        //.addCondition(new FlagRecipeCondition(manager, prefix + "_tools"))
                        .addCondition(new TagExistsRecipeCondition(tag.location()))
                );
    }

    private void generateArmorSet(String prefix, String itemName, TagKey<Item> tag, Consumer<FinishedRecipe> consumer) {

        var reg = ITEMS;

        ShapedRecipeBuilder.shaped(reg.get(prefix + "_helmet"))
                .define('X', tag)
                .pattern("XXX")
                .pattern("X X")
                .unlockedBy("has_" + itemName, has(tag))
                .save(withConditions(consumer)
                        //.addCondition(new FlagRecipeCondition(manager, prefix + "_armor"))
                        .addCondition(new TagExistsRecipeCondition(tag.location()))
                );

        ShapedRecipeBuilder.shaped(reg.get(prefix + "_chestplate"))
                .define('X', tag)
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_" + itemName, has(tag))
                .save(withConditions(consumer)
                        //.addCondition(new FlagRecipeCondition(manager, prefix + "_armor"))
                        .addCondition(new TagExistsRecipeCondition(tag.location()))
                );

        ShapedRecipeBuilder.shaped(reg.get(prefix + "_leggings"))
                .define('X', tag)
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .unlockedBy("has_" + itemName, has(tag))
                .save(withConditions(consumer)
                        //.addCondition(new FlagRecipeCondition(manager, prefix + "_armor"))
                        .addCondition(new TagExistsRecipeCondition(tag.location()))
                );

        ShapedRecipeBuilder.shaped(reg.get(prefix + "_boots"))
                .define('X', tag)
                .pattern("X X")
                .pattern("X X")
                .unlockedBy("has_" + itemName, has(tag))
                .save(withConditions(consumer)
                        //.addCondition(new FlagRecipeCondition(manager, prefix + "_armor"))
                        .addCondition(new TagExistsRecipeCondition(tag.location()))
                );
    }
    // endregion
}
