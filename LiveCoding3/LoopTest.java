/**
 * @author R.Nauke
 */

public class LoopTest {
  public static void main(String[] args) {
    String str;
    int i;
    try {
      str = args[0];
      i = Integer.parseInt(args[1]);
    }
    catch (IndexOutOfBoundsException fortnite) {
      System.out.println("No arguments");
      return;
    }
    catch (NumberFormatException nfe) {
      System.out.println("Invalid arguments");
      return;
    }
    if (str.equals("-d")) {
      int x = i;
      do {
        System.out.println(x);
        x--;
      } while (x > 0);
    }
    else if (str.equals("-w")) {
      int x = i;
      while (x > 0) {
        System.out.println(x);
        x--;
      }
    }
    else {
      System.out.println("Invalid arguments");
    }
  }   
}