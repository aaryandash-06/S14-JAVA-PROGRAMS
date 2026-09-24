package Assignment_3;
import java.util.*;
public class EvenNumbersArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 10;
        int[] num = new int[size];
        for(int i = 0; i<10; i++){
            num[i] = sc.nextInt();
        }
        System.out.println("Array: " + java.util.Arrays.toString(num));
        for(int i = 0; i<10; i++){
            if(num[i] % 2 == 0){
                System.out.println("Even number are: " + num[i]);
            }
            }
        sc.close();
        }
    }

