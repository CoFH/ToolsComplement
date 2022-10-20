package cofh.toolscomplement.config;

import cofh.core.config.IBaseConfig;
import net.minecraftforge.common.ForgeConfigSpec;

import java.util.function.Supplier;

public class ToolConfig implements IBaseConfig {

    protected String name;
    protected int uses;
    protected int enchantability;
    protected float speed;
    protected float damage;

    private Supplier<Integer> configUses;
    private Supplier<Integer> configEnchantability;
    private Supplier<Double> configSpeed;
    private Supplier<Double> configDamage;

    public ToolConfig(String name, int uses, int enchantability, float speed, float damage) {

        this.name = name;
        this.uses = uses;
        this.enchantability = enchantability;
        this.speed = speed;
        this.damage = damage;
    }

    public int getUses() {

        return configUses.get();
    }

    public int getEnchantability() {

        return configEnchantability.get();
    }

    @Override
    public void apply(ForgeConfigSpec.Builder builder) {

    }

    @Override
    public void refresh() {

    }

}
