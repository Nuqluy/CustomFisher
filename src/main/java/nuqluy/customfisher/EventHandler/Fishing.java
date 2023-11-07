package nuqluy.customfisher.EventHandler;

import nuqluy.customfisher.CustomFisher;
import nuqluy.customfisher.Items.ItemManager;
import nuqluy.customfisher.Items.ItemRoller;
import org.bukkit.Bukkit;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.inventory.ItemStack;

public class Fishing implements Listener {

//    FileConfiguration config = CustomFisher.plugin.getConfig();

    public Fishing(CustomFisher plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onFish(PlayerFishEvent event) {
        if (event.getCaught() instanceof Item) {
            Item caught = (Item) event.getCaught();
            Player player = event.getPlayer();

            ItemStack rolled_item = ItemRoller.roller();



            caught.setItemStack(rolled_item);
            player.sendMessage("§bYou caught a "+rolled_item.getItemMeta().getDisplayName());

//            caught.setItemStack(ItemManager.coral1);
//            player.sendMessage("§bYou caught a "+ItemManager.coral1.getItemMeta().getDisplayName());


//            ItemStack item = caught.getItemStack();
//
//            ItemMeta meta = item.getItemMeta();
//            meta.setDisplayName("apple");
//            item.setItemMeta(meta);



        }
    }


}
