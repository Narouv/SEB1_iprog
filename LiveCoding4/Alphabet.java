/**
 * @author R.Nauke
 */

import java.util.Scanner;

public class Alphabet {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a letter: ");
    String letter = s.nextLine();
    char c = letter.charAt(0);
    if (Character.isLetter(letter.charAt(0))) {
      System.out.println("The char " + c + " would be at position " + positionAt(c) + " in the alphabet\n");
    }
    s.close();
  }

  public static int positionAt(char c) {
    return (Character.toLowerCase(c) - 96);
  }
}