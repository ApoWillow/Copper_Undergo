package net.apowillow.cu.mixin;

import net.minecraft.item.GoatHornItem;
import net.minecraft.item.Instrument;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.Optional;

@Mixin(GoatHornItem.class)
public interface MixinGoatHornItem {
    @Invoker
    Optional<? extends RegistryEntry<Instrument>> invokeGetInstrument(ItemStack stack);
}