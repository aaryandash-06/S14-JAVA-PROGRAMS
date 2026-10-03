package Theory;
class Student{
    String name;
    int roll_no;
    float age;
    String course;
    float marks;
        public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll_no);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
    }
}
public class Class1_Objects1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aaryan";
        s1.roll_no = 123;
        s1.age = 18.1f;
        s1.course = "B-Tech";
        s1.marks = 99.9f;
        s1.displayDetails();
    }
}