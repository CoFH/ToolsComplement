package cofh.toolscomplement.data;

import cofh.lib.tags.ItemTagsCoFH;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static cofh.lib.util.constants.ModIds.ID_TOOLS_COMPLEMENT;
import static cofh.toolscomplement.ToolsComplement.ITEMS;

public class TComTagsProvider {

    public static class Block extends BlockTagsProvider {

        public Block(DataGenerator gen, ExistingFileHelper existingFileHelper) {

            super(gen, ID_TOOLS_COMPLEMENT, existingFileHelper);
        }

        @Override
        public String getName() {

            return "Tool's Complement: Block Tags";
        }

        @Override
        protected void addTags() {

        }

    }

    public static class Item extends ItemTagsProvider {

        public Item(DataGenerator gen, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {

            super(gen, blockTagProvider, ID_TOOLS_COMPLEMENT, existingFileHelper);
        }

        @Override
        public String getName() {

            return "Tool's Complement: Item Tags";
        }

        @Override
        protected void addTags() {

            tag(ItemTagsCoFH.ARMOR_COPPER).add(
                    ITEMS.get("copper_boots"),
                    ITEMS.get("copper_chestplate"),
                    ITEMS.get("copper_helmet"),
                    ITEMS.get("copper_leggings")
            );
            tag(ItemTagsCoFH.ARMOR_TIN).add(
                    ITEMS.get("tin_boots"),
                    ITEMS.get("tin_chestplate"),
                    ITEMS.get("tin_helmet"),
                    ITEMS.get("tin_leggings")
            );
            tag(ItemTagsCoFH.ARMOR_LEAD).add(
                    ITEMS.get("lead_boots"),
                    ITEMS.get("lead_chestplate"),
                    ITEMS.get("lead_helmet"),
                    ITEMS.get("lead_leggings")
            );
            tag(ItemTagsCoFH.ARMOR_SILVER).add(
                    ITEMS.get("silver_boots"),
                    ITEMS.get("silver_chestplate"),
                    ITEMS.get("silver_helmet"),
                    ITEMS.get("silver_leggings")
            );
            tag(ItemTagsCoFH.ARMOR_NICKEL).add(
                    ITEMS.get("nickel_boots"),
                    ITEMS.get("nickel_chestplate"),
                    ITEMS.get("nickel_helmet"),
                    ITEMS.get("nickel_leggings")
            );
            tag(ItemTagsCoFH.ARMOR_BRONZE).add(
                    ITEMS.get("bronze_boots"),
                    ITEMS.get("bronze_chestplate"),
                    ITEMS.get("bronze_helmet"),
                    ITEMS.get("bronze_leggings")
            );
            tag(ItemTagsCoFH.ARMOR_ELECTRUM).add(
                    ITEMS.get("electrum_boots"),
                    ITEMS.get("electrum_chestplate"),
                    ITEMS.get("electrum_helmet"),
                    ITEMS.get("electrum_leggings")
            );
            tag(ItemTagsCoFH.ARMOR_INVAR).add(
                    ITEMS.get("invar_boots"),
                    ITEMS.get("invar_chestplate"),
                    ITEMS.get("invar_helmet"),
                    ITEMS.get("invar_leggings")
            );
            tag(ItemTagsCoFH.ARMOR_CONSTANTAN).add(
                    ITEMS.get("constantan_boots"),
                    ITEMS.get("constantan_chestplate"),
                    ITEMS.get("constantan_helmet"),
                    ITEMS.get("constantan_leggings")
            );

            tag(ItemTagsCoFH.TOOLS_IRON).add(
                    ITEMS.get("iron_excavator"),
                    ITEMS.get("iron_hammer"),
                    ITEMS.get("iron_sickle"),
                    ITEMS.get("iron_knife")
            );
            tag(ItemTagsCoFH.TOOLS_GOLD).add(
                    ITEMS.get("gold_excavator"),
                    ITEMS.get("gold_hammer"),
                    ITEMS.get("gold_sickle"),
                    ITEMS.get("gold_knife")
            );
            tag(ItemTagsCoFH.TOOLS_DIAMOND).add(
                    ITEMS.get("diamond_excavator"),
                    ITEMS.get("diamond_hammer"),
                    ITEMS.get("diamond_sickle"),
                    ITEMS.get("diamond_knife")
            );
            tag(ItemTagsCoFH.TOOLS_NETHERITE).add(
                    ITEMS.get("netherite_excavator"),
                    ITEMS.get("netherite_hammer"),
                    ITEMS.get("netherite_sickle"),
                    ITEMS.get("netherite_knife")
            );

            tag(ItemTagsCoFH.TOOLS_COPPER).add(
                    ITEMS.get("copper_axe"),
                    ITEMS.get("copper_hoe"),
                    ITEMS.get("copper_pickaxe"),
                    ITEMS.get("copper_shovel"),
                    ITEMS.get("copper_sword"),
                    ITEMS.get("copper_excavator"),
                    ITEMS.get("copper_hammer"),
                    ITEMS.get("copper_sickle"),
                    ITEMS.get("copper_knife")
            );
            tag(ItemTagsCoFH.TOOLS_TIN).add(
                    ITEMS.get("tin_axe"),
                    ITEMS.get("tin_hoe"),
                    ITEMS.get("tin_pickaxe"),
                    ITEMS.get("tin_shovel"),
                    ITEMS.get("tin_sword"),
                    ITEMS.get("tin_excavator"),
                    ITEMS.get("tin_hammer"),
                    ITEMS.get("tin_sickle"),
                    ITEMS.get("tin_knife")
            );
            tag(ItemTagsCoFH.TOOLS_LEAD).add(
                    ITEMS.get("lead_axe"),
                    ITEMS.get("lead_hoe"),
                    ITEMS.get("lead_pickaxe"),
                    ITEMS.get("lead_shovel"),
                    ITEMS.get("lead_sword"),
                    ITEMS.get("lead_excavator"),
                    ITEMS.get("lead_hammer"),
                    ITEMS.get("lead_sickle"),
                    ITEMS.get("lead_knife")
            );
            tag(ItemTagsCoFH.TOOLS_SILVER).add(
                    ITEMS.get("silver_axe"),
                    ITEMS.get("silver_hoe"),
                    ITEMS.get("silver_pickaxe"),
                    ITEMS.get("silver_shovel"),
                    ITEMS.get("silver_sword"),
                    ITEMS.get("silver_excavator"),
                    ITEMS.get("silver_hammer"),
                    ITEMS.get("silver_sickle"),
                    ITEMS.get("silver_knife")
            );
            tag(ItemTagsCoFH.TOOLS_NICKEL).add(
                    ITEMS.get("nickel_axe"),
                    ITEMS.get("nickel_hoe"),
                    ITEMS.get("nickel_pickaxe"),
                    ITEMS.get("nickel_shovel"),
                    ITEMS.get("nickel_sword"),
                    ITEMS.get("nickel_excavator"),
                    ITEMS.get("nickel_hammer"),
                    ITEMS.get("nickel_sickle"),
                    ITEMS.get("nickel_knife")
            );
            tag(ItemTagsCoFH.TOOLS_BRONZE).add(
                    ITEMS.get("bronze_axe"),
                    ITEMS.get("bronze_hoe"),
                    ITEMS.get("bronze_pickaxe"),
                    ITEMS.get("bronze_shovel"),
                    ITEMS.get("bronze_sword"),
                    ITEMS.get("bronze_excavator"),
                    ITEMS.get("bronze_hammer"),
                    ITEMS.get("bronze_sickle"),
                    ITEMS.get("bronze_knife")
            );
            tag(ItemTagsCoFH.TOOLS_ELECTRUM).add(
                    ITEMS.get("electrum_axe"),
                    ITEMS.get("electrum_hoe"),
                    ITEMS.get("electrum_pickaxe"),
                    ITEMS.get("electrum_shovel"),
                    ITEMS.get("electrum_sword"),
                    ITEMS.get("electrum_excavator"),
                    ITEMS.get("electrum_hammer"),
                    ITEMS.get("electrum_sickle"),
                    ITEMS.get("electrum_knife")
            );
            tag(ItemTagsCoFH.TOOLS_INVAR).add(
                    ITEMS.get("invar_axe"),
                    ITEMS.get("invar_hoe"),
                    ITEMS.get("invar_pickaxe"),
                    ITEMS.get("invar_shovel"),
                    ITEMS.get("invar_sword"),
                    ITEMS.get("invar_excavator"),
                    ITEMS.get("invar_hammer"),
                    ITEMS.get("invar_sickle"),
                    ITEMS.get("invar_knife")
            );
            tag(ItemTagsCoFH.TOOLS_CONSTANTAN).add(
                    ITEMS.get("constantan_axe"),
                    ITEMS.get("constantan_hoe"),
                    ITEMS.get("constantan_pickaxe"),
                    ITEMS.get("constantan_shovel"),
                    ITEMS.get("constantan_sword"),
                    ITEMS.get("constantan_excavator"),
                    ITEMS.get("constantan_hammer"),
                    ITEMS.get("constantan_sickle"),
                    ITEMS.get("constantan_knife")
            );
        }

    }

}
