package Assignment_3;
import java.util.*;
public class FibonacciMethods {
    void Fibonacci(int n){
        int num1 = 0;
        int num2 = 1;
        for(int i = 1 ; i<=n ; i++){
            System.out.print(num1 + " ");
            int next = num1+ num2;
            num1 = num2;
            num2 = next;
        }
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the values: ");
    int a = sc.nextInt();
    FibonacciMethods fn = new FibonacciMethods();
    fn.Fibonacci(a);
    sc.close();
}
}
