package Assignment_3;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number greater than 100: ");
        int num = sc.nextInt();
        int og = num;
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;   
            num = num / 10;
        }

        if (og == rev) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }

        sc.close();
    }
}