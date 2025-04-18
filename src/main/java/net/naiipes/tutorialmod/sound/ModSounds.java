package net.naiipes.tutorialmod.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.naiipes.tutorialmod.TutorialMod;

public class ModSounds
{
    public static final SoundEvent ALIEN_BLOCK_BREAK = registerSoundEvent("alien_block_break");
    public static final SoundEvent ALIEN_BLOCK_STEP = registerSoundEvent("alien_block_step");
    public static final SoundEvent ALIEN_BLOCK_PLACE = registerSoundEvent("alien_block_place");
    public static final SoundEvent ALIEN_BLOCK_HIT = registerSoundEvent("alien_block_hit");
    public static final SoundEvent ALIEN_BLOCK_FALL = registerSoundEvent("alien_block_fall");

    public static final BlockSoundGroup ALIEN_BLOCK_SOUNDS =
            new BlockSoundGroup(2f, 1f, ALIEN_BLOCK_BREAK, ALIEN_BLOCK_STEP, ALIEN_BLOCK_PLACE, ALIEN_BLOCK_HIT, ALIEN_BLOCK_FALL);

    private static SoundEvent registerSoundEvent(String name)
    {
        Identifier id = Identifier.of(TutorialMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds()
    {
        TutorialMod.LOGGER.info("Registering Mod sounds for " + TutorialMod.MOD_ID);
    }
}
