package StudentProject.src.tugasclass;
import java.util.Scanner;

public class Student2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose one:");
        System.out.println("1. Student\n2. Teacher");
        int pilihan = input.nextInt();
        input.nextLine(); // Konsumsi newline

        if (pilihan == 1) {
            System.out.println("Student Details");
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Age: ");
            int age = input.nextInt();
            input.nextLine(); // Konsumsi newline
            System.out.print("Student Number: ");
            int number = input.nextInt();
            input.nextLine(); // Konsumsi newline
            System.out.print("Score: ");
            String score = input.nextLine();
            System.out.print("Major: ");
            String major = input.nextLine();

            Student student = new Student(number, score, major);
            System.out.println("Student Name: " + name);
            System.out.println("Age: " + age);
            student.print();
        } else if (pilihan == 2) {
            System.out.println("Choose one:");
            System.out.println("1. Part-Time\n2. Full-Time");
            int pilihan2 = input.nextInt();
            input.nextLine(); // Konsumsi newline

            System.out.println("Teacher Details");
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Age: ");
            int age = input.nextInt();
            input.nextLine(); // Konsumsi newline
            System.out.print("Subject: ");
            String subject = input.nextLine();

            if (pilihan2 == 1) {
                System.out.print("Hours Worked: ");
                int hoursWorked = input.nextInt();
                System.out.print("Salary: ");
                int salary = input.nextInt();

                PartTime partTime = new PartTime(name, age, subject, hoursWorked, salary);
                partTime.print();
            } else if (pilihan2 == 2) {
                System.out.print("Unit: ");
                String unit = input.nextLine();
                System.out.print("Annual Salary: ");
                int salary = input.nextInt();

                FullTime fullTime = new FullTime(name, age, subject, unit, salary);
                fullTime.print();
            }
        }
        input.close();
    }
}
