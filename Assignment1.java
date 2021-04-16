/* Assignment 1 - Movie Ratings */
import java.util.Scanner;

class Assignment1 {
  public static void main(String[] args) {
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the movie name.");
    String movieName = scan.nextLine();
    
    System.out.println("\nPlease enter the running time in minutes.");
    int movieMinutes = scan.nextInt();
    
    System.out.println("\nPlease enter ratings from the movie review website.");
    int movieScore1 = scan.nextInt();
    int movieScore2 = scan.nextInt();
    int movieScore3 = scan.nextInt();
    
    System.out.println("\nPlease enter ratings from the focus group.");
    double focusScore1 = scan.nextDouble();
    double focusScore2 = scan.nextDouble();
    System.out.println("\nPlease enter the average movie critic rating.");
    double criticScore = scan.nextDouble();
    
    double movieScoreAverage = (double) (movieScore1 + movieScore2 + movieScore3) / 3;
    double focusAverage = (focusScore1 + focusScore2) / 2;
    double averageAverage = ((20 *movieScoreAverage) +(30* focusAverage) + (50 * criticScore))/100;
    
    int minuteRun = (movieMinutes) % 60;
    int hourRun = (int) movieMinutes / 60;
    
    System.out.println("\nTitle: " + movieName);
    System.out.println("Running time: " + hourRun + "h" + minuteRun);
    System.out.println("Average website rating: " + movieScoreAverage);
    System.out.println("Average focus group rating: " + focusAverage);
    System.out.println("Average movie critic rating: " + criticScore);
    System.out.println("Overall movie rating: " + (int) (averageAverage + .5));

  }
}