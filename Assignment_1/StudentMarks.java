package Assignment_1;

import java.util.Scanner;

class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;

        System.out.println("Enter marks for 5 subjects:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Subject " + i + ": ");
            total += sc.nextDouble();
        }

        double average = total / 5;
        char grade;

        if (average >= 90)
            grade = 'A';
        else if (average >= 80)
            grade = 'B';
        else if (average >= 70)
            grade = 'C';
        else if (average >= 60)
            grade = 'D';
        else if (average >= 50)
            grade = 'E';
        else
            grade = 'F';

        System.out.println("Total Marks = " + total);
        System.out.println("Average = " + average);
        System.out.println("Grade = " + grade);

        sc.close();
    }
}