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

        if (roll <= 500) {
            rolled_item = ItemManager.coral1;
        } else { // when value rolled is less than 1000
            rolled_item = ItemManager.coral2;
        }


        return rolled_item;
    }


}
