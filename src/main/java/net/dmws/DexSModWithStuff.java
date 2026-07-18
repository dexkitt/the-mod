package net.dmws;

import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class DexSModWithStuff implements ModInitializer {
  public static final String ModId = "dmws";

  // This logger is used to write text to the console and the log file.
  // It is considered best practice to use your mod id as the logger's name.
  // That way, it's clear which mod wrote info, warnings, and errors.
  public static final Logger Logger = LoggerFactory.getLogger(ModId);

  public static Identifier id(String path) {
    return Identifier.fromNamespaceAndPath(ModId, path);
  }

  @Override
  public void onInitialize() {
    // This code runs as soon as Minecraft is in a mod-load-ready state.
    // However, some things (like resources) may still be uninitialized.
    // Proceed with mild caution.

    final int LogRandom = (new Random()).nextInt(1, 5);
    final String LogMessage;

    if (LogRandom == 1) LogMessage = "hello....";
    else if (LogRandom == 2) LogMessage = "dont get too comfortable because 🎶nothing grows in comfort🎶";
    else if (LogRandom == 3) LogMessage = "folk valley";
    else if (LogRandom == 4) LogMessage = "no";
    else LogMessage = "ok";

    Logger.info(LogMessage);
  }
}
