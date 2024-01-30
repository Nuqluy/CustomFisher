package nuqluy.customfisher.Items;

import org.bukkit.Bukkit;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class ItemRoller {

    /**
     * Throw a random number to be accessed by an
     * if statement in order to randomly generate
     * the item pulled out of the water.
     * @return the item rolled
     */
    public static ItemStack roller() {
        ItemStack rolled_item = null;
        Random random = new Random();
        int roll;
        roll = random.nextInt(1341);
        Bukkit.getLogger().info(String.valueOf(roll));

        if (roll <= 100) {
            rolled_item = ItemManager.coral1;
        } else if (roll <= 200) {
            rolled_item = ItemManager.coral2;
        } else if (roll <= 300) {
            rolled_item = ItemManager.coral3;
        } else if (roll <= 400) {
            rolled_item = ItemManager.coral4;
        } else if (roll <= 500) {
            rolled_item = ItemManager.coral5;
        } else if (roll <= 650) {
            rolled_item = ItemManager.fish1;
        } else if (roll <= 800) {
            rolled_item = ItemManager.fish2;
        } else if (roll <= 950) {
            rolled_item = ItemManager.fish3;
        } else if (roll <= 1100) {
            rolled_item = ItemManager.fish4;
        } else if (roll <= 1250) {
            rolled_item = ItemManager.fish5;
        } else if (roll <= 1260) {
            rolled_item = ItemManager.treasure1;
        } else if (roll <= 1270) {
            rolled_item = ItemManager.treasure2;
        } else if (roll <= 1280) {
            rolled_item = ItemManager.treasure3;
        } else if (roll <= 1290) {
            rolled_item = ItemManager.treasure4;
        } else if (roll <= 1300) {
            rolled_item = ItemManager.treasure5;
        } else if (roll <= 1310) {
            rolled_item = ItemManager.treasure6;
        } else if (roll <= 1320) {
            rolled_item = ItemManager.treasure7;
        } else if (roll <= 1330) {
            rolled_item = ItemManager.treasure8;
        } else {
            rolled_item = ItemManager.treasure9;
        }


        return rolled_item;
    }


}
