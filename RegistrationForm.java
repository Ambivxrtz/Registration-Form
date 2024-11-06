package registrationform;

import java.util.Scanner;


public class RegistrationForm {


    public static void main(String[] args) {
        
        String AName;
        int numA;
        int numB;
        String BName;
        String CName;
        int numC;
        String DName;
        String EName;
        int numD;
        
        Scanner scanner;
        scanner = new Scanner (System.in);
        
        System.out.println("=== Registration Form ===");
        System.out.println(" ");
        
        System.out.print("Enter your full name: ");
        AName = scanner.nextLine();
       
        System.out.print("Enter your age: ");
        numA = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter your student ID number: ");
        numB = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter the program you're enrolling in: ");
        BName = scanner.nextLine();
        
        System.out.print("Enter your intended major or connection: ");
        CName = scanner.nextLine();
        
        System.out.print("Enter your highschool GPA: ");
        numC = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter your address: ");
        DName = scanner.nextLine();
        
        System.out.print("Enter your guardian or emergency contact's fullname: ");
        EName = scanner.nextLine();
        
        System.out.print("Enter your guardian's contact number: ");
        numD = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println(" ");
        System.out.println("--- College Enrollment Summary ---");
        System.out.println("Student Name: " + AName);
        System.out.println("Age: " + numA);
        System.out.println("Student ID: " + numB);
        System.out.println("Program: " + BName);
        System.out.println("Intended Major/Concentration: " + CName);
        System.out.println("High School GPA: " + numC);
        System.out.println("Address: " + DName);
        System.out.println("Guardian/Emergency Contact Name: " + EName);
        System.out.println("Guardian's Contact Number: " + numD);
        
    }
    
}
