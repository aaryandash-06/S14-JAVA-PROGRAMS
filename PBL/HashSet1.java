package PBL;
import java.util.*;
public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> categories = new HashSet<>();
        categories.add("Electronics");
        categories.add("Accessories");
        categories.add("Electronics");
        categories.add("Accessories");
        categories.add("Furniture");
        System.out.println("===== HASH SET =====");
        System.out.println("Product Categories:");
        System.out.println(categories);
        System.out.println("Number of unique categories: " + categories.size());
    } 
}
