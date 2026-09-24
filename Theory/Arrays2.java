package Theory;
import java.util.*;
public class Arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        System.out.println("Enter the marks of students: ");
        int[] marks = new int[size];
        for(int i = 0; i<size; i++){
            marks[i] = sc.nextInt();
        }
        System.out.println("Array: " + java.util.Arrays.toString(marks));

        //HIGHEST AND LOWEST MARKS
        int largest = marks[0];
        int smallest = marks[0];
        double avg = 0;
        double sum = 0;
        for(int i = 0; i<marks.length; i++){
            if (largest < marks[i]) {
                largest = marks[i];
            }
            if(smallest > marks[i]){
                smallest = marks[i];
            }
        sum = sum + marks[i];
        avg = sum / marks[i];
        }
        System.out.println("The highest marks is: " + largest);
        System.out.println("The lowest marks is: " + smallest);
        System.out.println("The average marks is: " + avg);
        sc.close();
    }
}
