package com.exampledomi.example;

import org.bukkit.plugin.java.JavaPlugin;

public class example extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("onEnable is called!");
    }
    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }
}
