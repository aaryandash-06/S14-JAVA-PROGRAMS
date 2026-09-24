package Theory;
// import java.util.*;

public class Power {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter base (x): ");
        // int x = sc.nextInt();
        // System.out.print("Enter exponent (y): ");
        // int y = sc.nextInt();
        
        // long result = 1;
        // for (int i = 1; i <= y; i++) {
        //     result *= x;
        // }

        // System.out.println(x + " ^ " + y + " = " + result);
        // sc.close();


//         int rows = 4;

//         for (int i = 1; i <= rows; i++) {
//             for (int j = 1; j <= rows - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= 2 * i - 1; k++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

        int n = 5;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
     }
  }
}


