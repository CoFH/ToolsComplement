package cofh.toolscomplement.data.providers;

import cofh.lib.data.ItemModelProviderCoFH;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;

import static cofh.lib.util.constants.ModIds.ID_TOOLS_COMPLEMENT;
import static cofh.toolscomplement.ToolsComplement.ITEMS;

public class ModItemModelProvider extends ItemModelProviderCoFH {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {

        super(output, ID_TOOLS_COMPLEMENT, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        var reg = ITEMS;

        extraToolSet(reg, "iron");
        extraToolSet(reg, "gold");
        extraToolSet(reg, "diamond");
        extraToolSet(reg, "netherite");

        fullToolSet(reg, "copper");
        fullToolSet(reg, "tin");
        fullToolSet(reg, "lead");
        fullToolSet(reg, "silver");
        fullToolSet(reg, "nickel");
        fullToolSet(reg, "bronze");
        fullToolSet(reg, "electrum");
        fullToolSet(reg, "invar");
        fullToolSet(reg, "constantan");

        armorSet(reg, "copper");
        armorSet(reg, "tin");
        armorSet(reg, "lead");
        armorSet(reg, "silver");
        armorSet(reg, "nickel");
        armorSet(reg, "bronze");
        armorSet(reg, "electrum");
        armorSet(reg, "invar");
        armorSet(reg, "constantan");
    }

}
