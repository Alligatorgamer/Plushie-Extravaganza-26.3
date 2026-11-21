package net.alligator.plushie_extravaganza.datagen;

import net.alligator.plushie_extravaganza.PlushieExtravaganza;
import net.alligator.plushie_extravaganza.sound.ModSounds;
import net.fabricmc.fabric.api.client.datagen.v1.builder.SoundTypeBuilder;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricSoundsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModSoundsProvider extends FabricSoundsProvider {
    public ModSoundsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(HolderLookup.Provider registryLookup, SoundExporter exporter) {
        exporter.add(ModSounds.PLUSHIE_SQUISH, SoundTypeBuilder.of(ModSounds.PLUSHIE_SQUISH).subtitle("sounds.plushie-extravaganza.plushie_squish")
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "plushie_squish"))));
        exporter.add(ModSounds.TUNNELMASTER_SQUISH, SoundTypeBuilder.of(ModSounds.TUNNELMASTER_SQUISH)
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "tunnelmaster_open1")))
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "tunnelmaster_open2")))
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "tunnelmaster_open3")))
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "tunnelmaster_open4")))
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "tunnelmaster_open5"))));
        exporter.add(ModSounds.HUNTERSPIDER_SQUISH, SoundTypeBuilder.of(ModSounds.HUNTERSPIDER_SQUISH)
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "spider_flinch1")))
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "spider_flinch2")))
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "spider_flinch3"))));
        exporter.add(ModSounds.CIPHER_SQUISH, SoundTypeBuilder.of(ModSounds.CIPHER_SQUISH)
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "a5")))
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "b5")))
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "c5")))
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "c6")))
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "c_5")))
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "d5")))
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "d6")))
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "e5")))
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "g5"))));
        exporter.add(ModSounds.BROTHER_SQUISH, SoundTypeBuilder.of(ModSounds.BROTHER_SQUISH)
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "cry1")))
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "cry2")))
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "cry3")))
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "cry4"))));
        exporter.add(ModSounds.CRESCENT_SQUISH, SoundTypeBuilder.of(ModSounds.CRESCENT_SQUISH)
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "crescent1")))
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "crescent2")))
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "crescent3")))
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "crescent4"))));
        exporter.add(ModSounds.FORTUNE_SQUISH, SoundTypeBuilder.of(ModSounds.FORTUNE_SQUISH)
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "fortune_hit1")))
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "fortune_hit2")))
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "fortune_hit3"))));
        exporter.add(ModSounds.SCRUTINY_SQUISH, SoundTypeBuilder.of(ModSounds.SCRUTINY_SQUISH)
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "scrutiny_spawn1")))
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "scrutiny_spawn2")))
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "scrutiny_spawn3")))
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "scrutiny_spawn4"))));
        exporter.add(ModSounds.LSERA_SQUISH, SoundTypeBuilder.of(ModSounds.LSERA_SQUISH)
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "lseraphase1")))
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "lseraphase2")))
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(PlushieExtravaganza.MOD_ID, "lseraphase3"))));
    }

    @Override
    public String getName() {
        return "Plushie Extravaganza Sounds";
    }
}
