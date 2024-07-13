package cofh.toolscomplement.init.data.providers;

import cofh.lib.common.conditions.FlagSetCondition;
import cofh.lib.common.conditions.TagExistsCondition;
import cofh.lib.init.data.RecipeProviderCoFH;
import cofh.lib.init.tags.ItemTagsCoFH;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.Tags;

import static cofh.lib.util.constants.ModIds.ID_TOOLS_COMPLEMENT;
import static cofh.toolscomplement.ToolsComplement.ITEMS;

public class ModRecipeProvider extends RecipeProviderCoFH {

    public ModRecipeProvider(PackOutput output) {

        super(output, ID_TOOLS_COMPLEMENT);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        generateExtraToolSet("iron", "iron_ingot", Tags.Items.INGOTS_IRON, Tags.Items.STORAGE_BLOCKS_IRON, recipeOutput);
        generateExtraToolSet("gold", "gold_ingot", Tags.Items.INGOTS_GOLD, Tags.Items.STORAGE_BLOCKS_GOLD, recipeOutput);
        generateExtraToolSet("diamond", "diamond", Tags.Items.GEMS_DIAMOND, Tags.Items.STORAGE_BLOCKS_DIAMOND, recipeOutput);
        // generateExtraToolSet("netherite", "netherite_ingot", Tags.Items.INGOTS_NETHERITE, Tags.Items.STORAGE_BLOCKS_NETHERITE, recipeOutput);

        generateFullToolSet("copper", "copper_ingot", Tags.Items.INGOTS_COPPER, Tags.Items.STORAGE_BLOCKS_COPPER, recipeOutput);
        generateFullToolSet("tin", "tin_ingot", ItemTagsCoFH.INGOTS_TIN, ItemTagsCoFH.STORAGE_BLOCKS_TIN, recipeOutput);
        generateFullToolSet("lead", "lead_ingot", ItemTagsCoFH.INGOTS_LEAD, ItemTagsCoFH.STORAGE_BLOCKS_LEAD, recipeOutput);
        generateFullToolSet("silver", "silver_ingot", ItemTagsCoFH.INGOTS_SILVER, ItemTagsCoFH.STORAGE_BLOCKS_SILVER, recipeOutput);
        generateFullToolSet("nickel", "nickel_ingot", ItemTagsCoFH.INGOTS_NICKEL, ItemTagsCoFH.STORAGE_BLOCKS_NICKEL, recipeOutput);
        generateFullToolSet("bronze", "bronze_ingot", ItemTagsCoFH.INGOTS_BRONZE, ItemTagsCoFH.STORAGE_BLOCKS_BRONZE, recipeOutput);
        generateFullToolSet("electrum", "electrum_ingot", ItemTagsCoFH.INGOTS_ELECTRUM, ItemTagsCoFH.STORAGE_BLOCKS_ELECTRUM, recipeOutput);
        generateFullToolSet("invar", "invar_ingot", ItemTagsCoFH.INGOTS_INVAR, ItemTagsCoFH.STORAGE_BLOCKS_INVAR, recipeOutput);
        generateFullToolSet("constantan", "constantan_ingot", ItemTagsCoFH.INGOTS_CONSTANTAN, ItemTagsCoFH.STORAGE_BLOCKS_CONSTANTAN, recipeOutput);

        generateArmorSet("copper", "copper_ingot", Tags.Items.INGOTS_COPPER, recipeOutput);
        generateArmorSet("tin", "tin_ingot", ItemTagsCoFH.INGOTS_TIN, recipeOutput);
        generateArmorSet("lead", "lead_ingot", ItemTagsCoFH.INGOTS_LEAD, recipeOutput);
        generateArmorSet("silver", "silver_ingot", ItemTagsCoFH.INGOTS_SILVER, recipeOutput);
        generateArmorSet("nickel", "nickel_ingot", ItemTagsCoFH.INGOTS_NICKEL, recipeOutput);
        generateArmorSet("bronze", "bronze_ingot", ItemTagsCoFH.INGOTS_BRONZE, recipeOutput);
        generateArmorSet("electrum", "electrum_ingot", ItemTagsCoFH.INGOTS_ELECTRUM, recipeOutput);
        generateArmorSet("invar", "invar_ingot", ItemTagsCoFH.INGOTS_INVAR, recipeOutput);
        generateArmorSet("constantan", "constantan_ingot", ItemTagsCoFH.INGOTS_CONSTANTAN, recipeOutput);
    }

    // region HELPERS
    private void generateFullToolSet(String prefix, String itemName, TagKey<Item> tag, TagKey<Item> storage, RecipeOutput recipeOutput) {

        generateStandardToolSet(prefix, itemName, tag, recipeOutput);
        generateExtraToolSet(prefix, itemName, tag, storage, recipeOutput);
    }

    private void generateStandardToolSet(String prefix, String itemName, TagKey<Item> tag, RecipeOutput recipeOutput) {

        var reg = ITEMS;

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, reg.get(prefix + "_shovel"))
                .define('#', Items.STICK)
                .define('X', tag)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .unlockedBy("has_" + itemName, has(tag))
                .save(recipeOutput.withConditions(new FlagSetCondition(ID_TOOLS_COMPLEMENT + ":" + prefix + "_tools"), new TagExistsCondition(tag.location()))
                );

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, reg.get(prefix + "_pickaxe"))
                .define('#', Items.STICK)
                .define('X', tag)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .unlockedBy("has_" + itemName, has(tag))
                .save(recipeOutput.withConditions(new FlagSetCondition(ID_TOOLS_COMPLEMENT + ":" + prefix + "_tools"), new TagExistsCondition(tag.location()))
                );

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, reg.get(prefix + "_axe"))
                .define('#', Items.STICK)
                .define('X', tag)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .unlockedBy("has_" + itemName, has(tag))
                .save(recipeOutput.withConditions(new FlagSetCondition(ID_TOOLS_COMPLEMENT + ":" + prefix + "_tools"), new TagExistsCondition(tag.location()))
                );

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, reg.get(prefix + "_hoe"))
                .define('#', Items.STICK)
                .define('X', tag)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .unlockedBy("has_" + itemName, has(tag))
                .save(recipeOutput.withConditions(new FlagSetCondition(ID_TOOLS_COMPLEMENT + ":" + prefix + "_tools"), new TagExistsCondition(tag.location()))
                );

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, reg.get(prefix + "_sword"))
                .define('#', Items.STICK)
                .define('X', tag)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .unlockedBy("has_" + itemName, has(tag))
                .save(recipeOutput.withConditions(new FlagSetCondition(ID_TOOLS_COMPLEMENT + ":" + prefix + "_tools"), new TagExistsCondition(tag.location()))
                );
    }

    private void generateExtraToolSet(String prefix, String itemName, TagKey<Item> tag, TagKey<Item> storage, RecipeOutput recipeOutput) {

        var reg = ITEMS;

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, reg.get(prefix + "_excavator"))
                .define('#', Items.STICK)
                .define('X', tag)
                .define('Y', storage)
                .pattern(" Y ")
                .pattern("X#X")
                .pattern(" # ")
                .unlockedBy("has_" + itemName, has(tag))
                .save(recipeOutput.withConditions(new FlagSetCondition(ID_TOOLS_COMPLEMENT + ":" + prefix + "_tools"), new TagExistsCondition(tag.location()))
                );

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, reg.get(prefix + "_hammer"))
                .define('#', Items.STICK)
                .define('X', tag)
                .define('Y', storage)
                .pattern("XYX")
                .pattern("X#X")
                .pattern(" # ")
                .unlockedBy("has_" + itemName, has(tag))
                .save(recipeOutput.withConditions(new FlagSetCondition(ID_TOOLS_COMPLEMENT + ":" + prefix + "_tools"), new TagExistsCondition(tag.location()))
                );

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, reg.get(prefix + "_sickle"))
                .define('#', Items.STICK)
                .define('X', tag)
                .pattern(" X ")
                .pattern("  X")
                .pattern("#X ")
                .unlockedBy("has_" + itemName, has(tag))
                .save(recipeOutput.withConditions(new TagExistsCondition(tag.location()))
                );

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, reg.get(prefix + "_knife"))
                .define('#', Items.STICK)
                .define('X', tag)
                .pattern("X")
                .pattern("#")
                .unlockedBy("has_" + itemName, has(tag))
                .save(recipeOutput.withConditions(new FlagSetCondition(ID_TOOLS_COMPLEMENT + ":" + prefix + "_tools"), new TagExistsCondition(tag.location()))
                );
    }

    private void generateArmorSet(String prefix, String itemName, TagKey<Item> tag, RecipeOutput recipeOutput) {

        var reg = ITEMS;

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, reg.get(prefix + "_helmet"))
                .define('X', tag)
                .pattern("XXX")
                .pattern("X X")
                .unlockedBy("has_" + itemName, has(tag))
                .save(recipeOutput.withConditions(new FlagSetCondition(ID_TOOLS_COMPLEMENT + ":" + prefix + "_armor"), new TagExistsCondition(tag.location()))
                );

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, reg.get(prefix + "_chestplate"))
                .define('X', tag)
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_" + itemName, has(tag))
                .save(recipeOutput.withConditions(new FlagSetCondition(ID_TOOLS_COMPLEMENT + ":" + prefix + "_armor"), new TagExistsCondition(tag.location()))
                );

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, reg.get(prefix + "_leggings"))
                .define('X', tag)
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .unlockedBy("has_" + itemName, has(tag))
                .save(recipeOutput.withConditions(new FlagSetCondition(ID_TOOLS_COMPLEMENT + ":" + prefix + "_armor"), new TagExistsCondition(tag.location()))
                );

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, reg.get(prefix + "_boots"))
                .define('X', tag)
                .pattern("X X")
                .pattern("X X")
                .unlockedBy("has_" + itemName, has(tag))
                .save(recipeOutput.withConditions(new FlagSetCondition(ID_TOOLS_COMPLEMENT + ":" + prefix + "_armor"), new TagExistsCondition(tag.location()))
                );
    }
    // endregion
}
