/**
 * @author R.Nauke
 */

public class Calculator {
  public static int sum(int[] numbers) {
    int ret = 0;
    int i = 0;
    do {
      ret += numbers[i];
      i++;
    } while (i < numbers.length);
    return ret;
  }

  public static int fact(int number) {
    int ret = 1;
    while (number > 0) {
      ret *= number;
      number--;
    }
    return ret;
  }

  public static int fib(int num) {
    int a = 0;
    int b = 1;
    int t;

    if (num == 0) {
      return a;
    }
    if (num == 1) {
      return b;
    }
    for (int i = 2; true; i++) {
      t = a;
      a = b;
      b += t;
      if (a <= num && b >= num) {
        if (Math.abs(a - num) >= Math.abs(b - num)) {
          return b;
        }
        else {
          return a;
        }
      }
    }
  }

  // public static boolean toBoolean(int i) {
  //   boolean a = Boolean.toBoolean(i);
  //   return a;
  // }

  private static int[] convertInt(String[] args) {
    int[] arr = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      arr[i] = Integer.parseInt(args[i]);
    }
    return arr;
  }

  public static void main(String[] args) {
    if (args.length < 1) {
      System.exit(-1);
    }
    int res;
    if (args.length > 2) {
      if (args[0].equals("sum")) {
        res = sum(convertInt(java.util.Arrays.copyOfRange(args, 1, args.length)));
        System.out.println(res);
      }
      else if (args[0].equals("XOR")) {
        // res = xor();
        // System.out.println(res);
      }
    }
    else if (args.length == 2) {
      if (args[0].equals("fact")) {
        res = fact(Integer.parseInt(args[1]));
        System.out.println(res);
      }
      else if (args[0].equals("fib")) {
        res = fib(Integer.parseInt(args[1]));
        System.out.println(res);
      }
    }
    else {
      System.exit(-3);
    }
    
    // else 
    // else {
    //     System.exit(-2);
    // }
  }
}