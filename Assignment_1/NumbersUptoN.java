package Assignment_1;

import java.util.Scanner;

class NumbersUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Natural numbers: ");
        for (int i = 1; i <= n; i++)
            System.out.print(i + " ");

        System.out.print("\nEven numbers: ");
        for (int i = 2; i <= n; i += 2)
            System.out.print(i + " ");

        System.out.print("\nOdd numbers: ");
        for (int i = 1; i <= n; i += 2)
            System.out.print(i + " ");

        sc.close();
    }
}