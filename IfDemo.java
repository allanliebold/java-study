package ifdemo;

import java.util.Scanner;

public class IfDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nPlease enter your age: ");
        int userAge = input.nextInt();
        if (userAge < 0 || userAge > 120)
        {
            System.out.println("Invalid age");
            System.out.println("Age must be between 0 and 120");
        }
        else if (userAge < 21)
            System.out.println("Sorry. You are underage.");
        else
        {
            System.out.println("Congratulations!");
            System.out.println("You are qualified!");
        }
    }

}
