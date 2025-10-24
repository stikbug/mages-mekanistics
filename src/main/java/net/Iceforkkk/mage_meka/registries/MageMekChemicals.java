package net.Iceforkkk.mage_meka.registries;

import mekanism.api.chemical.Chemical;
import mekanism.api.text.EnumColor;
import mekanism.common.Mekanism;
import mekanism.common.registration.impl.ChemicalDeferredRegister;
import mekanism.common.registration.impl.DeferredChemical;
import mekanism.common.resource.PrimaryResource;
import mekanism.common.util.EnumUtils;
import net.Iceforkkk.mage_meka.MageMekChemicalConstants;

import static mekanism.common.registries.MekanismChemicals.PIGMENT_COLOR_LOOKUP;
import static mekanism.common.registries.MekanismChemicals.PROCESSED_RESOURCES;

public class MageMekChemicals {
    public static final ChemicalDeferredRegister CHEMICALS = new ChemicalDeferredRegister(Mekanism.MODID);

    public static final DeferredChemical<Chemical> LEGENDARY_INK_GAS = CHEMICALS.register(MageMekChemicalConstants.LEGENDARY_INK_GAS);
    public static final DeferredChemical<Chemical> EPIC_INK_GAS = CHEMICALS.register(MageMekChemicalConstants.EPIC_INK_GAS);
    public static final DeferredChemical<Chemical> RARE_INK_GAS = CHEMICALS.register(MageMekChemicalConstants.RARE_INK_GAS);
    public static final DeferredChemical<Chemical> UNCOMMON_INK = CHEMICALS.register(MageMekChemicalConstants.UNCOMMON_INK_GAS);
    public static final DeferredChemical<Chemical> COMMON_INK = CHEMICALS.register(MageMekChemicalConstants.COMMON_INK_GAS);

    static {
        for (EnumColor color : EnumUtils.COLORS) {
            PIGMENT_COLOR_LOOKUP.put(color, registerPigment(color));
        }
        for (PrimaryResource resource : EnumUtils.PRIMARY_RESOURCES) {
            PROCESSED_RESOURCES.put(resource, CHEMICALS.registerSlurry(resource));
        }
    }

    private static DeferredChemical<Chemical> registerPigment(EnumColor color) {
        int[] rgb = color.getRgbCode();
        int tint = rgb[0] << 16;
        tint |= rgb[1] << 8;
        tint |= rgb[2];
        return CHEMICALS.registerPigment(color.getRegistryPrefix(), tint);
    }
}
