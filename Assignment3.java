import java.util.Scanner;

public class Assignment3 {

  public static void main (String args[]) {
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Welcome. What is your name?");
    String name = scan.nextLine();
    
    System.out.println("Hello " + name + ". Are you ready to crack the code?");
    String answer = scan.nextLine();
    
    if (!answer.equalsIgnoreCase("yes")) {
      return;
    }
    
    System.out.println("\nPHASE 1");
    System.out.println("Enter a number:");
    int num1 = scan.nextInt();
    if (checkPhase1(num1)) {
      System.out.println("Correct!");
    } else {
      System.out.println("Sorry, that was incorrect!");
      System.out.println("Better luck next time!");
      return;
    }
    
    System.out.println("\nPHASE 2");
    System.out.println("Enter a number:");
    int num2 = scan.nextInt();
    if (checkPhase2(num2)) {
      System.out.println("Correct!");
    } else {
      System.out.println("Sorry, that was incorrect!");
      System.out.println("Better luck next time!");
      return;
    }
    
    System.out.println("\nPHASE 3");
    System.out.println("Enter a number:");
    int num3 = scan.nextInt();
    if (checkPhase3(num3)) {
      System.out.println("Correct!");
    } else {
      System.out.println("Sorry, that was incorrect!");
      System.out.println("Better luck next time!");
      return;
    }
    System.out.println("You have cracked the code!");
  }
  
  private static boolean checkPhase1(int num) {
    if (num != 3) {
      return false;
    }
    else {
      return true;
    }
  }
  
  private static boolean checkPhase2(int num) {
    if (num == 1) {
      return true;
    } else if (num >= 33 && num <= 100) {
      return true;
    } else {
      return false;
    }
  }
  
  private static boolean checkPhase3(int num) {
    if (!(num > 0)) {
      return false;
    }
    
    if (num % 7 == 0 || num % 3 == 0) {
      return true;
    } else {
      return false;
    }
    
  }

}
