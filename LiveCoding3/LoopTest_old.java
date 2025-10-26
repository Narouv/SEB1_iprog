/**
 * @author R.Nauke
 */

public class LoopTest {
  public static void main(String[] args) {
    // if (args.length != 2) {
    //   System.out.println("No arguments");
    //   return;
    // }
    if (args[0].equals("-d")) {
      int x = Integer.parseInt(args[1]);
      do {
        System.out.println(x);
        x--;
      } while (x > 0);
    }
    else if (args[0].equals("-w")) {
      int x = Integer.parseInt(args[1]);
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