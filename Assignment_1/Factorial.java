package Assignment_1;
import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        long factorial = 1;

        for (int i = 1; i <= n; i++)
            factorial *= i;

        System.out.println("Factorial = " + factorial);

        sc.close();
    }
}