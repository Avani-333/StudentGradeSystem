import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    double marks;
    String grade;

    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        this.grade = calculateGrade();
    }

    private String calculateGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else return "F";
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println("------------------------");
    }
}

public class StudentGradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- Student Grade Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();
                    studentList.add(new Student(name, roll, marks));
                    System.out.println("Student Added Successfully!");
                    break;
                case 2:
                    System.out.println("\n--- Student Records ---");
                    for (Student s : studentList) {
                        s.display();
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);
    }
}