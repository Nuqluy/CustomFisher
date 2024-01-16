package nuqluy.customfisher.Items;

import org.bukkit.Bukkit;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class ItemRoller {

    public static ItemStack roller() {
        ItemStack rolled_item = null;
        Random random = new Random();
        int roll;
        roll = random.nextInt(1001);
        Bukkit.getLogger().info(String.valueOf(roll));

        if (roll <= 200) {
            rolled_item = ItemManager.coral1;
        } else if (roll <= 400) { // when value rolled is less than 1000
            rolled_item = ItemManager.coral2;
        } else if (roll <= 600) { // when value rolled is less than 1000
            rolled_item = ItemManager.coral3;
        } else if (roll <= 800) { // when value rolled is less than 1000
            rolled_item = ItemManager.coral4;
        } else { // when value rolled is less than 1000
            rolled_item = ItemManager.coral5;
        }


        return rolled_item;
    }


}
