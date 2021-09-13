package cofh.toolscomplement.data;

import cofh.lib.data.RecipeProviderCoFH;
import cofh.lib.util.DeferredRegisterCoFH;
import cofh.lib.util.references.ItemTagsCoFH;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tags.ITag;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

import static cofh.lib.util.constants.Constants.ID_TOOLS_COMPLEMENT;
import static cofh.toolscomplement.ToolsComplement.ITEMS;

public class TComRecipeProvider extends RecipeProviderCoFH {

    public TComRecipeProvider(DataGenerator generatorIn) {

        super(generatorIn, ID_TOOLS_COMPLEMENT);
    }

    @Override
    public String getName() {

        return "Tool's Complement: Recipes";
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {

        DeferredRegisterCoFH<Item> reg = ITEMS;

        generateExtraToolSet("iron", "iron_ingot", Tags.Items.INGOTS_IRON, Tags.Items.STORAGE_BLOCKS_IRON, consumer);
        generateExtraToolSet("gold", "gold_ingot", Tags.Items.INGOTS_GOLD, Tags.Items.STORAGE_BLOCKS_GOLD, consumer);
        generateExtraToolSet("diamond", "diamond", Tags.Items.GEMS_DIAMOND, Tags.Items.STORAGE_BLOCKS_DIAMOND, consumer);
        generateExtraToolSet("netherite", "netherite_ingot", Tags.Items.INGOTS_NETHERITE, Tags.Items.STORAGE_BLOCKS_NETHERITE, consumer);

        generateFullToolSet("copper", "copper_ingot", ItemTagsCoFH.INGOTS_COPPER, ItemTagsCoFH.STORAGE_BLOCKS_COPPER, consumer);
        generateFullToolSet("tin", "tin_ingot", ItemTagsCoFH.INGOTS_TIN, ItemTagsCoFH.STORAGE_BLOCKS_TIN, consumer);
        generateFullToolSet("lead", "lead_ingot", ItemTagsCoFH.INGOTS_LEAD, ItemTagsCoFH.STORAGE_BLOCKS_LEAD, consumer);
        generateFullToolSet("silver", "silver_ingot", ItemTagsCoFH.INGOTS_SILVER, ItemTagsCoFH.STORAGE_BLOCKS_SILVER, consumer);
        generateFullToolSet("nickel", "nickel_ingot", ItemTagsCoFH.INGOTS_NICKEL, ItemTagsCoFH.STORAGE_BLOCKS_NICKEL, consumer);
        generateFullToolSet("bronze", "bronze_ingot", ItemTagsCoFH.INGOTS_BRONZE, ItemTagsCoFH.STORAGE_BLOCKS_BRONZE, consumer);
        generateFullToolSet("electrum", "electrum_ingot", ItemTagsCoFH.INGOTS_ELECTRUM, ItemTagsCoFH.STORAGE_BLOCKS_ELECTRUM, consumer);
        generateFullToolSet("invar", "invar_ingot", ItemTagsCoFH.INGOTS_INVAR, ItemTagsCoFH.STORAGE_BLOCKS_INVAR, consumer);
        generateFullToolSet("constantan", "constantan_ingot", ItemTagsCoFH.INGOTS_CONSTANTAN, ItemTagsCoFH.STORAGE_BLOCKS_CONSTANTAN, consumer);
    }

    // region HELPERS
    private void generateFullToolSet(String prefix, String itemName, ITag<Item> tag, ITag<Item> storage, Consumer<IFinishedRecipe> consumer) {

        generateStandardToolSet(prefix, itemName, tag, storage, consumer);
        generateExtraToolSet(prefix, itemName, tag, storage, consumer);
    }

    private void generateStandardToolSet(String prefix, String itemName, ITag<Item> tag, ITag<Item> storage, Consumer<IFinishedRecipe> consumer) {

        DeferredRegisterCoFH<Item> reg = ITEMS;

        ShapedRecipeBuilder.shaped(reg.get(prefix + "_shovel"))
                .define('#', Items.STICK)
                .define('X', tag)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .unlockedBy("has_" + itemName, has(tag)).save(consumer);

        ShapedRecipeBuilder.shaped(reg.get(prefix + "_pickaxe"))
                .define('#', Items.STICK)
                .define('X', tag)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .unlockedBy("has_" + itemName, has(tag)).save(consumer);

        ShapedRecipeBuilder.shaped(reg.get(prefix + "_axe"))
                .define('#', Items.STICK)
                .define('X', tag)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .unlockedBy("has_" + itemName, has(tag)).save(consumer);

        ShapedRecipeBuilder.shaped(reg.get(prefix + "_hoe"))
                .define('#', Items.STICK)
                .define('X', tag)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .unlockedBy("has_" + itemName, has(tag)).save(consumer);

        ShapedRecipeBuilder.shaped(reg.get(prefix + "_sword"))
                .define('#', Items.STICK)
                .define('X', tag)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .unlockedBy("has_" + itemName, has(tag)).save(consumer);
    }

    private void generateExtraToolSet(String prefix, String itemName, ITag<Item> tag, ITag<Item> storage, Consumer<IFinishedRecipe> consumer) {

        DeferredRegisterCoFH<Item> reg = ITEMS;

        ShapedRecipeBuilder.shaped(reg.get(prefix + "_excavator"))
                .define('#', Items.STICK)
                .define('X', tag)
                .define('Y', storage)
                .pattern(" Y ")
                .pattern("X#X")
                .pattern(" # ")
                .unlockedBy("has_" + itemName, has(tag)).save(consumer);

        ShapedRecipeBuilder.shaped(reg.get(prefix + "_hammer"))
                .define('#', Items.STICK)
                .define('X', tag)
                .define('Y', storage)
                .pattern("XYX")
                .pattern("X#X")
                .pattern(" # ")
                .unlockedBy("has_" + itemName, has(tag)).save(consumer);

        ShapedRecipeBuilder.shaped(reg.get(prefix + "_sickle"))
                .define('#', Items.STICK)
                .define('X', tag)
                .pattern(" X ")
                .pattern("  X")
                .pattern("#X ")
                .unlockedBy("has_" + itemName, has(tag)).save(consumer);

        ShapedRecipeBuilder.shaped(reg.get(prefix + "_knife"))
                .define('#', Items.STICK)
                .define('X', tag)
                .pattern("X")
                .pattern("#")
                .unlockedBy("has_" + itemName, has(tag)).save(consumer);
    }
    // endregion
}
