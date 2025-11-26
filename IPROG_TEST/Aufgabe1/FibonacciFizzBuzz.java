/**
 * @author R.Nauke
 */


import java.util.Scanner;

public class FibonacciFizzBuzz {
  void printFizzBuzz(int num) {
    if (num % 15 == 0) {
      System.out.println("FizzBuzz");
    }
    else if (num % 5 == 0) {
      System.out.println("Buzz");
    }
    else if (num % 3 == 0) {
      System.out.println("Fizz");
    }
    else {
      System.out.println(num);
    }
  }
  
  void printFibFizzBuzz(int count) {
    int a = 0;
    int b = 1;
    int tmp;
    
    for (int i = 0; i < count; i++) {
      tmp = a;
      a = b;
      b += tmp;
      printFizzBuzz(a);
    }
  }
  public void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Gib eine Zahl ein!");
    String str = s.nextLine();
    try {
      Integer.parseInt(str);
    }
    catch (Exception e) {
      System.err.println("Der input is nicht richtig lol");
      s.close();
      return;
    }
    s.close();
    printFibFizzBuzz(Integer.parseInt(str));
  }
}
