package nuqluy.customfisher.Tracking;

import nuqluy.customfisher.CustomFisher;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.UUID;

public class StatsTracker {

    public static void addNewStat(List<String> lore, Player player) {
        UUID PlayerID = player.getUniqueId();

        if (lore.get(0).equals("§r§7§oCoral")) {
            String value = "Coral";
        }
        Bukkit.getLogger().info("invoked");

        try {
            int num = (int) CustomFisher.plugin.getConfig().get("CoralCaught." + PlayerID);
            CustomFisher.plugin.getConfig().set("CoralCaught." + PlayerID, num+1);

        } catch (Exception e) {
            CustomFisher.plugin.getConfig().set("CoralCaught." + PlayerID, 1);
        }
        CustomFisher.plugin.saveConfig();

    }

    public static void viewStats() {}
}
