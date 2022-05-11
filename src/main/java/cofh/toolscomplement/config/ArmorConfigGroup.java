package cofh.toolscomplement.config;

import cofh.lib.config.ConfigGroup;

public class ArmorConfigGroup extends ConfigGroup {

    public ArmorConfigGroup() {

        addSubconfig(new ArmorConfig("Copper", 7, new int[]{1, 3, 4, 1}, 11, 0.0F, 0.0F));
        addSubconfig(new ArmorConfig("Tin", 8, new int[]{1, 3, 4, 1}, 20, 0.0F, 0.0F));
        addSubconfig(new ArmorConfig("Lead", 12, new int[]{2, 4, 5, 2}, 18, 0.0F, 0.0F));
        addSubconfig(new ArmorConfig("Silver", 6, new int[]{1, 3, 5, 2}, 32, 0.0F, 0.0F));
        addSubconfig(new ArmorConfig("Nickel", 14, new int[]{2, 5, 5, 2}, 14, 0.0F, 0.0F));
        addSubconfig(new ArmorConfig("Bronze", 16, new int[]{2, 5, 6, 2}, 18, 0.0F, 0.0F));
        addSubconfig(new ArmorConfig("Electrum", 7, new int[]{1, 3, 5, 2}, 30, 0.0F, 0.0F));
        addSubconfig(new ArmorConfig("Invar", 15, new int[]{2, 5, 7, 2}, 15, 0.0F, 0.0F));
        addSubconfig(new ArmorConfig("Constantan", 8, new int[]{1, 4, 4, 2}, 12, 0.0F, 0.0F));

    }

}
