package nuqluy.customfisher.Tracking;

import nuqluy.customfisher.CustomFisher;
import nuqluy.customfisher.Items.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StatsTracker {


// Bro holy shit don't uncomment this, this is broken as fuck
  /*  public static void addNewStat(List<String> lore, Player player) {
        UUID PlayerID = player.getUniqueId();
        Bukkit.getLogger().info(ItemManager.coral1.getItemMeta().getLore().get(0));
        Bukkit.getLogger().info(lore.get(0));

        if (lore.get(0) == ItemManager.coral1.getItemMeta().getLore().get(0)) {
            try {
                Bukkit.getLogger().info("1");
                int num = (int) CustomFisher.plugin.getConfig().get("CoralCaught." + PlayerID);
                Bukkit.getLogger().info("2");
                int num2 = (int) CustomFisher.plugin.getConfig().get("OverallCaught." + PlayerID);
                Bukkit.getLogger().info("3");
                CustomFisher.plugin.getConfig().set("OverallCaught." + PlayerID, num2+1);
                Bukkit.getLogger().info("4");
                CustomFisher.plugin.getConfig().set("CoralCaught." + PlayerID, num+1);
                Bukkit.getLogger().info("5");
                CustomFisher.plugin.saveConfig();
                Bukkit.getLogger().info("6");

            } catch (Exception e) {
                CustomFisher.plugin.getConfig().set("OverallCaught." + PlayerID, 1);
                CustomFisher.plugin.getConfig().set("CoralCaught." + PlayerID, 1);
                CustomFisher.plugin.getConfig().set("FishCaught." + PlayerID, 0);
                CustomFisher.plugin.getConfig().set("TreasureCaught." + PlayerID, 0);
                CustomFisher.plugin.saveConfig();
            }
        } else if (lore.get(0) == ItemManager.fish1.getItemMeta().getLore().get(0)) {
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
        } else {
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

        Bukkit.getLogger().info("invoked");

    }*/

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
