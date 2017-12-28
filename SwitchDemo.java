package switchdemo;
import java.util.Scanner;

public class SwitchDemo {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your grade: ");
    String userGrade = input.nextLine().toUpperCase();

    switch (userGrade) {
      case "A":
        System.out.println("Great!");
        break;
      case "B":
        System.out.println("Good!");
        break;
      case "C":
        System.out.println("Average");
        break;
      case "D":
        System.out.println("Try harder");
        break;
      case "F":
        System.out.println("Failing");
        break;
      default:
        System.out.println("Invalid input");
        break;
    }
  }
}
