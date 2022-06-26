package cofh.toolscomplement.data;

import cofh.lib.data.ItemModelProviderCoFH;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

import static cofh.lib.util.constants.ModIds.ID_TOOLS_COMPLEMENT;
import static cofh.toolscomplement.ToolsComplement.ITEMS;

public class TComItemModelProvider extends ItemModelProviderCoFH {

    public TComItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {

        super(generator, ID_TOOLS_COMPLEMENT, existingFileHelper);
    }

    @Override
    public String getName() {

        return "Tool's Complement: Item Models";
    }

    @Override
    protected void registerModels() {

        registerExtraToolSet("iron");
        registerExtraToolSet("gold");
        registerExtraToolSet("diamond");
        registerExtraToolSet("netherite");

        registerFullToolSet("copper");
        registerFullToolSet("tin");
        registerFullToolSet("lead");
        registerFullToolSet("silver");
        registerFullToolSet("nickel");
        registerFullToolSet("bronze");
        registerFullToolSet("electrum");
        registerFullToolSet("invar");
        registerFullToolSet("constantan");

        registerArmorSet("copper");
        registerArmorSet("tin");
        registerArmorSet("lead");
        registerArmorSet("silver");
        registerArmorSet("nickel");
        registerArmorSet("bronze");
        registerArmorSet("electrum");
        registerArmorSet("invar");
        registerArmorSet("constantan");
    }

    // region HELPERS
    private void registerFullToolSet(String prefix) {

        registerStandardToolSet(prefix);
        registerExtraToolSet(prefix);
    }

    private void registerStandardToolSet(String prefix) {

        var reg = ITEMS;

        handheld(reg.getSup(prefix + "_shovel"));
        handheld(reg.getSup(prefix + "_pickaxe"));
        handheld(reg.getSup(prefix + "_axe"));
        handheld(reg.getSup(prefix + "_hoe"));

        handheld(reg.getSup(prefix + "_sword"));
    }

    private void registerExtraToolSet(String prefix) {

        var reg = ITEMS;

        handheld(reg.getSup(prefix + "_excavator"));
        handheld(reg.getSup(prefix + "_hammer"));
        handheld(reg.getSup(prefix + "_sickle"));

        handheld(reg.getSup(prefix + "_knife"));
    }

    private void registerArmorSet(String prefix) {

        var reg = ITEMS;

        generated(reg.getSup(prefix + "_helmet"));
        generated(reg.getSup(prefix + "_chestplate"));
        generated(reg.getSup(prefix + "_leggings"));
        generated(reg.getSup(prefix + "_boots"));
    }
    // endregion
}
