package net.Iceforkkk.mage_meka.registries;

import mekanism.common.base.IChemicalConstant;

public enum MageMekChemicalConstants implements IChemicalConstant {
    // The alpha value of the color must be added, or JEI won't render the gas
    LEGENDARY_INK_GAS("legendary_ink_gas", 0xFFfcaf1c, 0, 660F, 70.85F),
    EPIC_INK_GAS("epic_ink_gas", 0xFFa52ea0, 0, 660F, 70.85F),
    RARE_INK_GAS("rare_ink_gas", 0xFF0f3844, 0, 660F, 70.85F),
    UNCOMMON_INK_GAS("uncommon_ink_gas", 0xFF124300, 0, 660F, 70.85F),
    COMMON_INK_GAS("common_ink_gas", 0xFF222222, 0, 660F, 70.85F);


    private final String name;
    private final int color;
    private final int lightLevel;
    private final float temperature;
    private final float density;

    MageMekChemicalConstants(String name, int color, int lightLevel, float temperature, float density) {
        this.name = name;
        this.color = color;
        this.lightLevel = lightLevel;
        this.temperature = temperature;
        this.density = density;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getColor() {
        return color;
    }

    @Override
    public float getTemperature() {
        return temperature;
    }

    @Override
    public float getDensity() {
        return density;
    }

    @Override
    public int getLightLevel() {
        return lightLevel;
    }
}
