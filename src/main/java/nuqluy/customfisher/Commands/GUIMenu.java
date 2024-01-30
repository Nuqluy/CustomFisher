package nuqluy.customfisher.Commands;

import nuqluy.customfisher.CustomFisher;
import nuqluy.customfisher.Tracking.StatsTracker;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class GUIMenu implements Listener, CommandExecutor {
    private String invName = "§b§lCustomFisher"; // GUI Title

    /**
     * Initiate GUI creation and send to plugin
     * @param plugin the plugin runner
     */
    public GUIMenu(CustomFisher plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    /**
     * InventoryClickEvent listens for the player clicking a slot in the created
     * GUI inventory screen. The below code will allow the player to navigate
     * the menu with ease.
     * @param event the referenced event InventoryClickEvent
     */
    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (!event.getView().getTitle().equals(invName)) {
            return;
        }

        int page = 0; // set null page

        if (event.getView().getTitle().equals(invName)) {
            page = 1; // set to first page when gui is opened
        }

        Player player = (Player) event.getWhoClicked(); // get the player who invoked the event
        int slot = event.getSlot(); // get clicked slot in inventory

        // The bleow if statement will access the gui pages with each icon clicked.
        if (slot == 11 && page == 1) { // view stats button
            ArrayList<String> data = StatsTracker.viewStats(player);
            String newData = data.toString();
            newData = newData.substring(1, newData.length() - 1);
            player.sendMessage(newData.split(", "));
        } else if (slot == 13 && page == 1) { // view leaderboards button
            Inventory pageTwo = Bukkit.createInventory(player, 9 * 3, "§b§lLeaderboards");

            // create page 2 items
            pageTwo.setItem(10, getItem(new ItemStack(Material.COD), "&3&lTop Fish Caught", "&cCOMING SOON"));
            pageTwo.setItem(12, getItem(new ItemStack(Material.TUBE_CORAL), "&3&lTop Coral Caught", "&cCOMING SOON"));
            pageTwo.setItem(14, getItem(new ItemStack(Material.CHEST), "&3&lTop Treasure Caught", "&cCOMING SOON"));
            pageTwo.setItem(16, getItem(new ItemStack(Material.FISHING_ROD), "&3&lTop Overall Caught", "&cCOMING SOON"));


            player.openInventory(pageTwo); // display page two to user

        } else if (slot == 15 && page == 1) { // view achievements button
            player.sendMessage("This feature is currently not available yet! Check back later for more updates on this feature.");
        }

        // all leaderboard buttons not in use at this time
        else if (slot == 10 && page == 2) { player.sendMessage("This feature is currently not available yet! Check back later for more updates on this feature."); }
        else if (slot == 12 && page == 2) { player.sendMessage("This feature is currently not available yet! Check back later for more updates on this feature."); }
        else if (slot == 14 && page == 2) { player.sendMessage("This feature is currently not available yet! Check back later for more updates on this feature."); }
        else if (slot == 16 && page == 2) { player.sendMessage("This feature is currently not available yet! Check back later for more updates on this feature."); }


        event.setCancelled(true); // stop players from taking the items from the gui and keeping them
    }

    /**
     * command to open up the gui
     * @param sender the player who ran the command
     * @param command the command ran
     * @param label the name of the command
     * @param args the arguments provided into the command
     * @return true
     */
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) { // make sure the command executor is a player
            sender.sendMessage("Only players can run this command");
            return true;
        }

        Player player = (Player) sender; // the player who invoked the command

        Inventory inv = Bukkit.createInventory(player, 9 * 3, invName); // create a virtual chest inventory with 3 rows containing 9 slots

        // create the items to place in the gui
        inv.setItem(11, getItem(new ItemStack(Material.ENCHANTED_BOOK), "&3&lFishing Progress", "&bClick to see your fishing progress!"));
        inv.setItem(15, getItem(new ItemStack(Material.ENCHANTED_BOOK), "&3&lAchievements", "&cCOMING SOON"));
        inv.setItem(13, getItem(new ItemStack(Material.ENCHANTED_BOOK), "&3&lFishing Leaderboard", "&bClick to see the leaderboard!"));


        player.openInventory(inv); // show the gui to the player

        return true;
    }


    /**
     * Get the items placed inside of the GUI, translate the colour codes
     * @param item the inserted item
     * @param name the name of the item
     * @param lore the lore of the item
     * @return the item to be accessed
     */
    private ItemStack getItem(ItemStack item, String name, String... lore) {
        ItemMeta meta = item.getItemMeta(); // get the item meta

        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', name)); // translate colour codes to the server

        List<String> lores = new ArrayList<>(); // create the lore to apply to the items
        for (String s : lore) {
            lores.add(ChatColor.translateAlternateColorCodes('&', s));
        }
        meta.setLore(lores); // set the lores

        item.setItemMeta(meta); // overwrite the item meta
        return item; // send the item back to the gui
    }

}
