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

    public static void init() {
        createCoral1();
        createCoral2();
    }

    private static void createCoral1() {
        ItemStack item = new ItemStack(Material.HORN_CORAL, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eCommon Horn Coral");

        // set item meta
        item.setItemMeta(meta);

        // assign item
        coral1 = item;

//        // example lore code
//        List<String> lore = new ArrayList<>();
//        lore.add("testing1");
//        lore.add("testing2");
//        lore.add("testing3");
//        meta.setLore(lore);

//        // example enchant code
//        meta.addEnchant(Enchantment.LUCK, 1, false); // always keep false
//        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS); // do ItemFlag. to show all item flags


    }

    private static void createCoral2() {
        ItemStack item = new ItemStack(Material.FIRE_CORAL, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§cCommon Fire Coral");

        // set item meta
        item.setItemMeta(meta);

        // assign item
        coral2 = item;
    }

}
