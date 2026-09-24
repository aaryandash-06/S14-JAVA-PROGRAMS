package Theory;
// import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        //TAKING ARRAY VALUES FROM USER AND PRINTING THEIR SUM AND AVERAGE
        /*Scanner sc = new Scanner(System.in);
         System.out.println("Enter size: ");
        int size = sc.nextInt();
        System.out.println("Enter elements: ");
        int[] array = new int[size];
        for(int i = 0; i<size; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Array: " + java.util.Arrays.toString(array));
        
        int sum = 0;
        int avg = 0;
        for(int i = 0; i<array.length;i++){
            sum = sum + array[i];
            avg = sum / array[i];
        }
        System.out.println("The sum of all elements of array is: " + sum);
         System.out.println("The avg of all elements of array is: " + avg);

        sc.close();
        */

        //LARGEST  AND SMALLEST ELEMENT OF ARRAY
        /*int[] a = {25,2000,50,1,9};
        int max = a[0];
        int min = a[0];
        for(int i = 0; i<a.length; i++){
            if(max < a[i]){
                max = a[i];
            }
            if(min > a[i]){
                min = a[i];
            }
        }
        System.out.println("The largest value is: " + max);
        System.out.println("The smallest value is: " + min);*/

        //SEARCHING FOR ELEMENT IN ARRAY
        /*Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,4,56,3};
        System.out.println("Enter which number you want to search: ");
        int search = sc.nextInt();
        boolean found = false;
        for(int i = 0 ; i<arr.length; i++){
            if(search == arr[i]){
                System.out.println("It is located at: " + i);
                found = true;
                break;
            }
        }
        if(!found){
                System.out.println("It is not available in this array!");
            }
        sc.close();*/

        //ARRAY IN REVERSE ORDER
        int[] a = {10,20,30,40,50};
        for(int i = a.length-1 ; i>=0; i--){
            System.out.println("Reverse order: " + a[i]);
        }
    }
}
