package PBL;
import java.util.*;
public class Methods {

    static String assignTier(char size, double weight) {
        if (size == 'S' && weight <= 1.0) return "SMALL";
        if (size == 'M' && weight <= 5.0) return "MEDIUM";
        return "LARGE";
    }

    static double computeFee(String tier) {
        switch (tier) {
            case "MEDIUM": return 35.0;
            case "LARGE": return 50.0;
            default: return 20.0;
        }
    }

    static void printReceipt(String tier, double fee) {
        System.out.println("Tier: " + tier);
        System.out.println("Fee: " + fee);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size (S/M/L): ");
        char size = sc.next().charAt(0);
        System.out.println("Enter weight: ");
        double weight = sc.nextDouble();
        String tier = assignTier(size, weight);
        printReceipt(tier, computeFee(tier));
        sc.close();
    }
    
}