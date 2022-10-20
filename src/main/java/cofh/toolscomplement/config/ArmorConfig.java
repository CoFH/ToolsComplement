package cofh.toolscomplement.config;

import cofh.core.config.IBaseConfig;
import net.minecraftforge.common.ForgeConfigSpec;

import java.util.function.Supplier;

public class ArmorConfig implements IBaseConfig {

    protected String name;
    protected int durabilityFactor;
    protected int[] defenseAmounts;
    protected int enchantability;
    protected float toughness;
    protected float knockbackResist;

    private Supplier<Integer> configDurabilityFactor;
    private Supplier<Integer>[] configDefenseAmounts = new Supplier[4];
    private Supplier<Integer> configEnchantability;
    private Supplier<Double> configToughness;
    private Supplier<Double> configKnockbackResist;

    public ArmorConfig(String name, int durabilityFactor, int[] defenseAmounts, int enchantability, float toughness, float knockbackResist) {

        this.name = name;
        this.durabilityFactor = durabilityFactor;
        this.defenseAmounts = defenseAmounts;
        this.enchantability = enchantability;
        this.toughness = toughness;
        this.knockbackResist = knockbackResist;
    }

    public int getDurabilityFactor() {

        return configDurabilityFactor.get();
    }

    public int[] getDefenseAmounts() {

        return new int[]{configDefenseAmounts[0].get(), configDefenseAmounts[1].get(), configDefenseAmounts[2].get(), configDefenseAmounts[3].get()};
    }

    public int getEnchantability() {

        return configEnchantability.get();
    }

    public float getToughness() {

        double cfg = configToughness.get();
        return (float) cfg;
    }

    public float getKnockbackResist() {

        double cfg = configKnockbackResist.get();
        return (float) cfg;
    }

    @Override
    public void apply(ForgeConfigSpec.Builder builder) {

        builder.push(name);

        configDurabilityFactor = builder.comment("Relative durability of this armor type.").defineInRange("Durability", durabilityFactor, 1, 128);
        configEnchantability = builder.comment("Enchantability of this armor type.").defineInRange("Enchantability", enchantability, 0, 128);

        final String[] armor = new String[]{"Boots", "Legplates", "Chestplate", "Helmet"};
        for (int i = 0; i < 4; ++i) {
            configDefenseAmounts[i] = builder.comment("Defense provided by " + armor[i] + ".").defineInRange(armor[i] + " Defense", defenseAmounts[i], 0, 20);
        }
        configToughness = builder.comment("Toughness provided by each piece of armor.").defineInRange("Toughness", toughness, 0.0D, 10.0D);
        configKnockbackResist = builder.comment("Knockback resistance provided by each piece of armor.").defineInRange("Knockback Resist", knockbackResist, 0.0D, 10.0D);

        builder.pop();
    }

    @Override
    public void refresh() {

    }

}
