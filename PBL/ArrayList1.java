package PBL;
import java.util.*;
class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<>();
        cart.add("Laptop");
        cart.add("Mouse");
        cart.add("Keyboard");
        cart.add("Mouse");
        System.out.println("===== ARRAY LIST =====");
        System.out.println("Shopping Cart: ");
        System.out.println(cart);
        System.out.println("First Item: " + cart.get(0));
        System.out.println("Number of Items: " + cart.size());
        cart.remove("Mouse");
        System.out.println("After removing keyboard");
        System.out.println(cart);
    }
}