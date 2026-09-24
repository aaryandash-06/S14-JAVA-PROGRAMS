package Assignment_1;
public class Alphabets {
    public static void main(String[] args) {

        System.out.print("a to z: ");
        for (char ch = 'a'; ch <= 'z'; ch++)
            System.out.print(ch + " ");

        System.out.print("\nA to Z: ");
        for (char ch = 'A'; ch <= 'Z'; ch++)
            System.out.print(ch + " ");

        System.out.print("\nz to a: ");
        for (char ch = 'z'; ch >= 'a'; ch--)
            System.out.print(ch + " ");

        System.out.print("\nZ to A: ");
        for (char ch = 'Z'; ch >= 'A'; ch--)
            System.out.print(ch + " ");
    }
}