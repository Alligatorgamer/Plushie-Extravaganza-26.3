package net.alligator.plushie_extravaganza.sound;

import net.alligator.plushie_extravaganza.PlushieExtravaganza;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;

public class ModSounds {
    public static final SoundEvent PLUSHIE_SQUISH = registerSoundEvent("plushie_squish");
    public static final SoundEvent TUNNELMASTER_SQUISH = registerSoundEvent("tunnelmaster_squish");
    public static final SoundEvent HUNTERSPIDER_SQUISH = registerSoundEvent("hunterspider_squish");
    public static final SoundEvent CIPHER_SQUISH = registerSoundEvent("cipher_squish");
    public static final SoundEvent BROTHER_SQUISH = registerSoundEvent("brother_squish");
    public static final SoundEvent CRESCENT_SQUISH = registerSoundEvent("crescent_squish");
    public static final SoundEvent FORTUNE_SQUISH = registerSoundEvent("fortune_squish");
    public static final SoundEvent SCRUTINY_SQUISH = registerSoundEvent("scrutiny_squish");
    public static final SoundEvent LSERA_SQUISH = registerSoundEvent("lsera_squish");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, name);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
    }

    public static void registerSounds() {
        PlushieExtravaganza.LOGGER.info("Registering sounds for " + PlushieExtravaganza.MOD_ID);
    }
}
