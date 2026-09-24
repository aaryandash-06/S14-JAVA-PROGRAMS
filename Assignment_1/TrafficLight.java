package Assignment_1;
import java.util.Scanner;

class TrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter traffic light colour (R/Y/G): ");
        char light = Character.toUpperCase(sc.next().charAt(0));

        switch (light) {
            case 'R':
                System.out.println("The light is RED. STOP.");
                break;

            case 'Y':
                System.out.println("The light is YELLOW. PREPARE TO STOP.");
                break;

            case 'G':
                System.out.println("The light is GREEN. PROCEED.");
                break;

            default:
                System.out.println("Invalid input.");
        }

        sc.close();
    }
}