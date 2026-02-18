import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    int marks1, marks2, marks3;
    double percentage;
    char grade;

    void inputData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        System.out.print("Enter Marks of Subject 1: ");
        marks1 = sc.nextInt();

        System.out.print("Enter Marks of Subject 2: ");
        marks2 = sc.nextInt();

        System.out.print("Enter Marks of Subject 3: ");
        marks3 = sc.nextInt();
    }

    void calculateResult() {
        int total = marks1 + marks2 + marks3;
        percentage = total / 3.0;

        if (percentage >= 90)
            grade = 'A';
        else if (percentage >= 75)
            grade = 'B';
        else if (percentage >= 60)
            grade = 'C';
        else if (percentage >= 40)
            grade = 'D';
        else
            grade = 'F';
    }

    void displayResult() {
        System.out.println("\n----- RESULT -----");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
}

public class Code {
    public static void main(String[] args) {
        Student s = new Student();
        s.inputData();
        s.calculateResult();
        s.displayResult();
    }
}

