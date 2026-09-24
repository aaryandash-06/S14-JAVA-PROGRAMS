package Assignment_1;
//Problem 4: Calculate distance travelled by a vehicle (14-08-26)
import java.util.Scanner;
public class DistanceByVehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the speed of vehicle (in kmph): ");
        int speed = sc.nextInt();
        System.out.print("Enter the time taken to cover the distance (in hrs): ");
        int time = sc.nextInt();
        int distance = speed * time;
        System.out.println("The distance covered by the vehicle is: " + distance + " km");
        sc.close();

        
    }
    
}
