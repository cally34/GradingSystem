/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hellojava;

/**
 *
 * @author gmlol
 */
import java.util.Scanner;
public class GradingSystem {
    private static int lastEnteredGrade = -1;
    private static String lastRemarks = "N/A";
    private static boolean gradeWasEntered = false;
    private static boolean remarkWasEntered = false;
            
    public static void main(String[] args){
        Scanner scanner = new java.util.Scanner(System.in);
        int choice;

        
        
        while (true){
            
            System.out.println("  _______ .______          ___       _______   __  .__   __.   _______         _______.____    ____  _______.___________. _______ .___  ___. \n" +
" /  _____||   _  \\        /   \\     |       \\ |  | |  \\ |  |  /  _____|       /       |\\   \\  /   / /       |           ||   ____||   \\/   | \n" +
"|  |  __  |  |_)  |      /  ^  \\    |  .--.  ||  | |   \\|  | |  |  __        |   (----` \\   \\/   / |   (----`---|  |----`|  |__   |  \\  /  | \n" +
"|  | |_ | |      /      /  /_\\  \\   |  |  |  ||  | |  . `  | |  | |_ |        \\   \\      \\_    _/   \\   \\       |  |     |   __|  |  |\\/|  | \n" +
"|  |__| | |  |\\  \\----./  _____  \\  |  '--'  ||  | |  |\\   | |  |__| |    .----)   |       |  | .----)   |      |  |     |  |____ |  |  |  | \n" +
" \\______| | _| `._____/__/     \\__\\ |_______/ |__| |__| \\__|  \\______|    |_______/        |__| |_______/       |__|     |_______||__|  |__| \n" +
"                                                                                                                                             ");
            System.out.println("[1] Enter new score");
            System.out.println("[2] Display last grade and remarks");
            System.out.println("[3] Exit program");
            
            choice = scanner.nextInt();
            
            switch (choice){
            case 1:
                System.out.println("Enter Score: ");
                int grade = scanner.nextInt();
                processAndSaveGrade(grade);
                gradeWasEntered = true;
                System.out.println("Enter Remarks: ");
                scanner.nextLine();
                String remark = scanner.nextLine();
                remarkWasEntered = true;
                lastRemarks = remark;
                System.out.println("Score " + grade);
                System.out.println("Remarks: "+ remark);
                break;
            case 2:
                if (gradeWasEntered) {
                    System.out.println("\n=== Last Grade Entered ===\n");
                    System.out.println("Score: " + lastEnteredGrade);
                    System.out.println("Remarks: " + lastRemarks);
                    System.out.println("===============================");
                } else {
                    System.out.println("No score entered yet!");
                }
                break;
            case 3:
                System.out.println("Goodbye!");
                scanner.close();
                return;
                
                
            default:
                System.out.println("Invalid Choice. Please enter 1, 2, or 3.");
        }
            
           
    }   
        
       
    
    
}
    private static void processAndSaveGrade(int grade){
        lastEnteredGrade = grade;
        
        
     if (grade >= 90 && grade <= 100){
            System.out.println("Your grade is A!");
        } else if (grade >= 80 && grade <= 89){
            System.out.println("Your grade is B!");
        } else if (grade >= 70 && grade <= 79){
            System.out.println("Your grade is C!");
        } else if (grade >= 60 && grade <= 69){
            System.out.println("Your grade is D!");
        } else if (grade <= 60) {
            System.out.println("Your grade is F!");
        } else if (grade >= 100){
            System.out.println("ERROR! PLEASE INPUT A VALID SCORE!");
        }
        else{
            System.out.println("ERROR! PLEASE INPUT A VALID SCORE!");
        }
     
        
    
    }
   
}

