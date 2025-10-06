/**
 * @author R.Nauke
 */

public class Factorial {
  public static void main(String[] args) {
    int i = 10;
    int sum = 1;
    while (i > 0) {
      sum *= i;
      i--;
    }
    System.out.println(sum);
  }
}