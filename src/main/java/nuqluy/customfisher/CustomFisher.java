package nuqluy.customfisher;

import nuqluy.customfisher.Commands.GUIMenu;
import nuqluy.customfisher.EventHandler.Fishing;
import nuqluy.customfisher.Items.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomFisher extends JavaPlugin {

    public static CustomFisher plugin;

    @Override
    public void onEnable() {
        plugin = this;

        saveDefaultConfig();

        // Plugin startup logic
        Bukkit.getLogger().info("CustomFisher Loaded!");

        // Import items
        ItemManager.init();

        // Import commands
        getCommand("fish").setExecutor(new GUIMenu(this));

        // Import events/handlers
        new Fishing(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
