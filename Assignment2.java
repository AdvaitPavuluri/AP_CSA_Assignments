/* Assignment 2 - Control Tower */
/* Class name - must be "Assignment2" in order to run */
import java.util.Scanner;
import edhesive.assignment2.Airplane;
import java.lang.Math.*;

public class Assignment2
{
  public static void main(String[] args)
  {
    
    Scanner scan = new Scanner(System.in);
    
    Airplane airplane1 = new Airplane();
    
    
    System.out.println("Enter the details of the second airplane (call-sign, distance, bearing and altitude):");
    String cs = scan.nextLine();
    cs = cs.toUpperCase();
    double dist = scan.nextDouble();
    int dir = scan.nextInt(); // This is the degree # of bearing
    int alt = scan.nextInt();
    
    // New airplane creation
    Airplane airplane2 = new Airplane(cs, dist, dir, alt);
    
    
    System.out.println("\nInitial Positions:");
    System.out.println("\"Airplane 1\": " + airplane1);
    System.out.println("\"Airplane 2\": " + airplane2);
    System.out.println("The distance between the planes is "+(airplane1.distTo(airplane2))+" miles.");
    System.out.printf("The difference in height between the planes is %d feet.", (Math.abs(airplane1.getAlt()-airplane2.getAlt())));
    
  
    
    airplane1.gainAlt();
    airplane1.gainAlt();
    airplane1.gainAlt();
    airplane1.gainAlt();
    
    airplane2.loseAlt();
    airplane2.loseAlt();
    
    airplane1.move(10.5, 50);
    airplane2.move(8.0, 125);
    
    
    System.out.println("\n\nNew Positions:");
    System.out.println("\"Airplane 1\": "+airplane1+"\n\"Airplane 2\": "+airplane2);
    System.out.println("The distance between the planes is "+(airplane1.distTo(airplane2))+" miles.");
    System.out.printf("The difference in height between the planes is %d feet.", (Math.abs(airplane1.getAlt()-airplane2.getAlt())));
      }
}
