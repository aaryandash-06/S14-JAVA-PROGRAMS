package Assignment_1;

import java.util.Scanner;

class ReverseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Natural numbers: ");
        for (int i = n; i >= 1; i--)
            System.out.print(i + " ");

        System.out.print("\nEven numbers: ");
        for (int i = (n % 2 == 0 ? n : n - 1); i >= 2; i -= 2)
            System.out.print(i + " ");

        System.out.print("\nOdd numbers: ");
        for (int i = (n % 2 == 1 ? n : n - 1); i >= 1; i -= 2)
            System.out.print(i + " ");

        sc.close();
    }
}
