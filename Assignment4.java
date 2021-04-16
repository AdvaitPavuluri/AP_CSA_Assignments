import java.util.Scanner;

class Assignment4 {
  public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);
    System.out.println("Type the message to be shortened");
    
    /* Algorithm 1 */
    
    String msg = scan.nextLine();
    System.out.println();
    msg = msg.toLowerCase();
    
    String newMsg = "";
    
    int repeats = 0;
    int vowels = 0;
    
    for (int i = 0; i < msg.length(); i++) {
      if (msg.substring(i, i+1).equals("a") || 
      msg.substring(i, i+1).equals("e") || 
      msg.substring(i, i +1).equals("i") || 
      msg.substring(i, i+1).equals("o") || 
      msg.substring(i, i +1).equals("u")) {
        
        if (i != 0 && !msg.substring(i-1, i).equals(" ")) {
          vowels++;
        } else {
          newMsg += msg.substring(i, i+1);
        }
        
      } else if (i != 0 && msg.substring(i, i+1).equals(msg.substring(i-1, i))) {
        repeats++;
      } else {
        newMsg += msg.substring(i, i+1);
      }
    }
    
    System.out.println("\nAlgorithm 1");
    System.out.println("Vowels removed: " + vowels);
    System.out.println("Repeats removed: "+ repeats);
    System.out.println("Algorithm 1 message: " + newMsg);
    System.out.println("Algorithm 1 characters saved: " + (vowels + repeats));
    System.out.println();
    
    /* Algorithm 2 */
    String str2 = "";
    int unique = 0;
    for (int i = 0;i<msg.length();i++) {
      String letter = msg.substring(i,i+1);
      if (!letter.equals(" ")) {
        boolean used = false;
        for (int j = 0;j<i;j++) {
          if (msg.substring(j,j+1).equals(letter)) {
            used = true;
            break;
          }
        }
        if (!used) {
          unique++;
          int count = 0;
          for (int k = 0;k<msg.length();k++) {
            if (msg.substring(k,k+1).equals(letter)) {
              count++;
            }
          }
          str2 += count + letter;
        }
      }
    }
    
    System.out.println("Algorithm 2");
    System.out.println("Unique characters found: " + unique);
    System.out.println("Algorithm 2 message: " + str2);
    System.out.println("Algorithm 2 characters saved: " + (msg.length()-str2.length()));
  }
  }
    

    
    /*
    String msg2 = "";
    int uniqueLetters = 0;
    
    for (int i = 0; i < msg.length(); i++) {
      String letter = msg.substring(i, i+1);
    
      if (!letter.equals(" ")) {
        boolean isUsed = false;
        for (int j = 0; j < i; j++) {
          if (msg.substring(j, j+1).equals(letter)) {
            isUsed = true;
          }
        }
        
        if (!isUsed) {
          uniqueLetters++;
          int count = 0;
          for (int j = 1; j < msg.length(); j++) {
            if (msg.substring(j, j+1).equals(letter)) {
              count++;
            }
            msg2 += count + letter;
          }
        }
      }
    }
    
    System.out.println("\nAlgorithm 2");
    System.out.println("Unique characters found: " + uniqueLetters);
    System.out.println("Algorithm 2 message: " + msg2);
    System.out.println("Algorithm 2 characters saved: " + (msg.length() - msg2.length()));
   */
   

