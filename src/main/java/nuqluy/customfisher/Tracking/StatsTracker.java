package nuqluy.customfisher.Tracking;

import nuqluy.customfisher.CustomFisher;
import nuqluy.customfisher.Items.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StatsTracker {


    /**
     * This method allows the user to have their statistics updated as the user fishes in real time.
     * @param lore the lore of the item which contains the item category
     * @param player the player in the referenced event
     */
    public static void addNewStat(List<String> lore, Player player) {
        UUID PlayerID = player.getUniqueId();
        Bukkit.getLogger().info(ItemManager.coral1.getItemMeta().getLore().get(0));
        Bukkit.getLogger().info(lore.get(0));

        // IF statement checks all items against the lore provided to get the type
        // of item fished out of the water. This will then add to the player statistics.
        if (lore.get(0).equals(ItemManager.coral1.getItemMeta().getLore().get(0))) {
            try {
                int num = (int) CustomFisher.plugin.getConfig().get("CoralCaught." + PlayerID);
                int num2 = (int) CustomFisher.plugin.getConfig().get("OverallCaught." + PlayerID);
                CustomFisher.plugin.getConfig().set("OverallCaught." + PlayerID, num2+1);
                CustomFisher.plugin.getConfig().set("CoralCaught." + PlayerID, num+1);
                CustomFisher.plugin.saveConfig();

            } catch (Exception e) {
                CustomFisher.plugin.getConfig().set("OverallCaught." + PlayerID, 1);
                CustomFisher.plugin.getConfig().set("CoralCaught." + PlayerID, 1);
                CustomFisher.plugin.getConfig().set("FishCaught." + PlayerID, 0);
                CustomFisher.plugin.getConfig().set("TreasureCaught." + PlayerID, 0);
                CustomFisher.plugin.saveConfig();
            }
        } else if (lore.get(0).equals(ItemManager.fish1.getItemMeta().getLore().get(0))) {
            try {
                int num = (int) CustomFisher.plugin.getConfig().get("FishCaught." + PlayerID);
                int num2 = (int) CustomFisher.plugin.getConfig().get("OverallCaught." + PlayerID);
                CustomFisher.plugin.getConfig().set("OverallCaught." + PlayerID, num2+1);
                CustomFisher.plugin.getConfig().set("FishCaught." + PlayerID, num+1);
                CustomFisher.plugin.saveConfig();

            } catch (Exception e) {
                CustomFisher.plugin.getConfig().set("OverallCaught." + PlayerID, 1);
                CustomFisher.plugin.getConfig().set("FishCaught." + PlayerID, 1);
                CustomFisher.plugin.getConfig().set("CoralCaught." + PlayerID, 0);
                CustomFisher.plugin.getConfig().set("TreasureCaught." + PlayerID, 0);
                CustomFisher.plugin.saveConfig();
            }
        } else { // ELSE: the player has never fished before.
            try {
                int num = (int) CustomFisher.plugin.getConfig().get("TreasureCaught." + PlayerID);
                int num2 = (int) CustomFisher.plugin.getConfig().get("OverallCaught." + PlayerID);
                CustomFisher.plugin.getConfig().set("OverallCaught." + PlayerID, num2+1);
                CustomFisher.plugin.getConfig().set("TreasureCaught." + PlayerID, num+1);
                CustomFisher.plugin.saveConfig();

            } catch (Exception e) {
                CustomFisher.plugin.getConfig().set("OverallCaught." + PlayerID, 1);
                CustomFisher.plugin.getConfig().set("TreasureCaught." + PlayerID, 1);
                CustomFisher.plugin.getConfig().set("FishCaught." + PlayerID, 0);
                CustomFisher.plugin.getConfig().set("CoralCaught." + PlayerID, 0);
                CustomFisher.plugin.saveConfig();
            }
        }

    }

    /**
     * Pulls all the selected player's statistics to show in a list.
     * @param player the player in called event
     * @return the data for the calling class to access
     */
    public static ArrayList<String> viewStats(Player player) {
        UUID PlayerID = player.getUniqueId();
        ArrayList<String> data = new ArrayList<>();
        data.add("Coral Caught: " + CustomFisher.plugin.getConfig().getInt("CoralCaught." + PlayerID));
        data.add("Fish Caught: " + (CustomFisher.plugin.getConfig().getInt("FishCaught." + PlayerID)));
        data.add("Treasure Caught: " + (CustomFisher.plugin.getConfig().getInt("TreasureCaught." + PlayerID)));
        data.add("Overall Caught: " + (CustomFisher.plugin.getConfig().getInt("OverallCaught." + PlayerID)));

        Bukkit.getLogger().info(data.toString());

        return data;
    }
}
