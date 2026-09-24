package Theory;
import java.util.*;
public class Searching {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {1,2,3,4,5};
    System.out.println("Enter the number u want to search: ");
    int num = sc.nextInt();
    boolean found = false;
         for(int i = 0; i< arr.length; i++){
            if(num == arr[i]){
                System.out.println("It is located at: " + i);
                found = true;
                break;
            }
         }
         if(!found){
            System.out.println("It is not available in array");
         }
    }
}
