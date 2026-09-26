package PBL;
import java.util.*;
public class ParcelWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter parcel weight: ");
            double weight = Double.parseDouble(sc.nextLine());
            if(weight > 0 && weight <= 50){
                System.out.println("Weight Accepted: " + weight + " kg");
            }else{
                System.out.println("Invalid weight" + ", enter a positive number less than 50");
            }
        }
        catch(NumberFormatException e){
            System.out.println("Invalid weight" + ", please enter a number");
        }
        finally{
            System.out.println("Weight checking completed");
        }
        sc.close();
    }
}
