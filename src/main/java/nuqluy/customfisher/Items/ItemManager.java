package nuqluy.customfisher.Items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public static ItemStack coral1;
    public static ItemStack coral2;
    public static ItemStack coral3;
    public static ItemStack coral4;
    public static ItemStack coral5;
    public static ItemStack fish1;
    public static ItemStack fish2;
    public static ItemStack fish3;
    public static ItemStack fish4 ;
    public static ItemStack fish5;


    public static void init() {
        createCoral1();
        createCoral2();
        createCoral3();
        createCoral4();
        createCoral5();
        createFish1();
        createFish2();
        createFish3();
        createFish4();
        createFish5();


    }

    private static void createCoral1() {
        ItemStack item = new ItemStack(Material.HORN_CORAL, 1); // create new one item
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eHorn Coral"); // set name of item


        List<String> lore = new ArrayList<>(); // lore attachment
        lore.add("§r§7§oCoral");
        meta.setLore(lore);

        // set item meta
        item.setItemMeta(meta);

        // assign item
        coral1 = item;
    }

    private static void createCoral2() {
        ItemStack item = new ItemStack(Material.FIRE_CORAL, 1); // create new one item
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§cFire Coral"); // set name of item


        List<String> lore = new ArrayList<>(); // lore attachment
        lore.add("§r§7§oCoral");
        meta.setLore(lore);

        // set item meta
        item.setItemMeta(meta);

        // assign item
        coral2 = item;
    }

    private static void createCoral3() {
        ItemStack item = new ItemStack(Material.TUBE_CORAL, 1); // create new one item
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bTube Coral"); // set name of item


        List<String> lore = new ArrayList<>(); // lore attachment
        lore.add("§r§7§oCoral");
        meta.setLore(lore);

        // set item meta
        item.setItemMeta(meta);

        // assign item
        coral3 = item;
    }

    private static void createCoral4() {
        ItemStack item = new ItemStack(Material.BRAIN_CORAL, 1); // create new one item
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§dBrain Coral"); // set name of item


        List<String> lore = new ArrayList<>(); // lore attachment
        lore.add("§r§7§oCoral");
        meta.setLore(lore);

        // set item meta
        item.setItemMeta(meta);

        // assign item
        coral4 = item;
    }

    private static void createCoral5() {
        ItemStack item = new ItemStack(Material.BUBBLE_CORAL, 1); // create new one item
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§5Bubble Coral"); // set name of item


        List<String> lore = new ArrayList<>(); // lore attachment
        lore.add("§r§7§oCoral");
        meta.setLore(lore);

        // set item meta
        item.setItemMeta(meta);

        // assign item
        coral5 = item;
    }


    private static void createFish1() {
        ItemStack item = new ItemStack(Material.COD, 1); // create new one item
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eCod"); // set name of item


        List<String> lore = new ArrayList<>(); // lore attachment
        lore.add("§r§7§oFish");
        meta.setLore(lore);

        // set item meta
        item.setItemMeta(meta);

        // assign item
        fish1 = item;
    }

    private static void createFish2() {
        ItemStack item = new ItemStack(Material.COD, 1); // create new one item
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eHaddock"); // set name of item


        List<String> lore = new ArrayList<>(); // lore attachment
        lore.add("§r§7§oFish");
        meta.setLore(lore);

        // set item meta
        item.setItemMeta(meta);

        // assign item
        fish2 = item;
    }

    private static void createFish3() {
        ItemStack item = new ItemStack(Material.SALMON, 1); // create new one item
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§cSalmon"); // set name of item


        List<String> lore = new ArrayList<>(); // lore attachment
        lore.add("§r§7§oFish");
        meta.setLore(lore);

        // set item meta
        item.setItemMeta(meta);

        // assign item
        fish3 = item;
    }

    private static void createFish4() {
        ItemStack item = new ItemStack(Material.TROPICAL_FISH, 1); // create new one item
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Tropical Fish"); // set name of item


        List<String> lore = new ArrayList<>(); // lore attachment
        lore.add("§r§7§oFish");
        meta.setLore(lore);

        // set item meta
        item.setItemMeta(meta);

        // assign item
        fish4 = item;
    }

    private static void createFish5() {
        ItemStack item = new ItemStack(Material.BUBBLE_CORAL, 1); // create new one item
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§ePufferfish"); // set name of item


        List<String> lore = new ArrayList<>(); // lore attachment
        lore.add("§r§7§oFish");
        meta.setLore(lore);

        // set item meta
        item.setItemMeta(meta);

        // assign item
        fish5 = item;
    }

}


//        // example lore code
//        List<String> lore = new ArrayList<>();
//        lore.add("testing1");
//        lore.add("testing2");
//        lore.add("testing3");
//        meta.setLore(lore);

//        // example enchant code
//        meta.addEnchant(Enchantment.LUCK, 1, false); // always keep false
//        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS); // do ItemFlag. to show all item flags
