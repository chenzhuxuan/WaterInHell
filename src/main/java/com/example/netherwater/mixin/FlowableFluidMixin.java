package com.example.netherwater.mixin;

import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.WaterFluid;
import net.minecraft.world.dimension.DimensionType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(FlowableFluid.class)
public class FlowableFluidMixin {
    @Redirect(
        method = "onScheduledTick",
        at = @At(value = "INVOKE", target = "Lnet/minecraft/world/dimension/DimensionType;ultrawarm()Z", ordinal = 0)
    )
    private boolean netherWater$allowWaterTick(DimensionType dimensionType) {
        if ((Object)this instanceof WaterFluid) {
            return false;
        }
        return dimensionType.ultrawarm();
    }
}
