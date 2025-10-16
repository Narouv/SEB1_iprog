/**
 * @author R.Nauke
 */

public class Picture {
  public static void main(String args[]) {
    // Exercise 3.1
    {
      int i = 6;
      int j = 6;
      while (i > 0) {
        while (j > 0) {
          if (i >= j) {
            System.out.print("*");
          }
          else{
            System.out.print("."); 
          }
          j--;
        }
        System.out.print("\n");
        i--;
        j = 6;
      }
    }
    // Exercise 3.2
    System.out.println();
    {
      int i = 7;
      int j = 7;
      while (i > 0) {
        while (j > 0) {
          if (j == i || j == 8 - i) {
            System.out.print("*");
          }
          else {
            System.out.print(".");
          }
          j--;
        }
        System.out.print("\n");
        i--;
        j = 7;
      }
    }
  }
}