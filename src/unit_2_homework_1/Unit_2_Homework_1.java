/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unit_2_homework_1;

/**
 *
 * @author Bokang Mutsi
 */
import java.util.Scanner;
public class Unit_2_Homework_1 {

    public static void main(String[] args) {
Scanner inputDevice = new Scanner(System.in);
String FirstName;
String LastName;
int Age;
System.out.print("Enter your First Name:");
FirstName = inputDevice.nextLine();

System.out.print("Enter your last Name:");
LastName = inputDevice.nextLine();
System.out.println();

System.out.print("Enter your age:");
Age = inputDevice.nextInt();

System.out.println("Hello, Hi" + FirstName + LastName + " WELCOME TO YOUR FIRST PROGRAM");
System.out.println("You are" + Age + "Years old");
    }
    
}
