package net.alligator.plushie_extravaganza.sound;

import net.alligator.plushie_extravaganza.PlushieExtravaganza;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;

public class ModSounds {
    public static final SoundEvent PLUSHIE_SQUISH = registerSoundEvent("plushie_squish");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, name);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
    }

    public static void registerSounds() {
        PlushieExtravaganza.LOGGER.info("Registering sounds for " + PlushieExtravaganza.MOD_ID);
    }
}
