package nuqluy.customfisher.EventHandler;

import nuqluy.customfisher.CustomFisher;
import nuqluy.customfisher.Items.ItemManager;
import nuqluy.customfisher.Items.ItemRoller;
import nuqluy.customfisher.Tracking.StatsTracker;
import org.bukkit.Bukkit;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class Fishing implements Listener {

    // Register plugin events
    public Fishing(CustomFisher plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    /**
     * This event listens for a player catching a fish
     * and then will generate the item to give them
     * and add to their statistics respectively.
     * @param event the referenced event PlayerFishEvent
     */
    @EventHandler
    public void onFish(PlayerFishEvent event) {
        if (event.getCaught() instanceof Item) {
            Item caught = (Item) event.getCaught(); // Get caught item
            Player player = event.getPlayer(); // Get player in referenced event

            ItemStack rolled_item = ItemRoller.roller(); // Generate item

            caught.setItemStack(rolled_item); // The item gets set
            player.sendMessage("§bYou caught a "+rolled_item.getItemMeta().getDisplayName()); // tell the player what they caught

            ArrayList<String> lore = (ArrayList<String>) rolled_item.getItemMeta().getLore(); // Get the item meta

            StatsTracker.addNewStat(lore,player); // Supply the referenced player and item meta and add to statistics tracker

        }
    }


}
