/**
 * @author R.Nauke
 */

public class Calculator {
  static String[] functions = {"sum", "xor", "fact", "fib"};

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

  public static boolean toBoolean(int i) {
    if (i == 0)
      return false;
    return true;
  }

  public static boolean xor(int[] numbers) {
    boolean result = toBoolean(numbers[0]);
    for (int i = 1; i < numbers.length; i++) {
      result ^= toBoolean(numbers[i]); 
    }
    return result;
  }

  private static int[] convertInt(String[] args) {
    int[] arr = new int[args.length];
    try {
      for (int i = 0; i < args.length; i++) {
        arr[i] = Integer.parseInt(args[i]);
      }
    }
    catch (NumberFormatException e) {
      System.out.println("Input cannot be parsed as int");
      System.exit(-3);
    }
    return arr;
  }

  private static String[] copyArray(String[] args) {
    String[] str = new String[args.length - 1];
    for (int i = 1; i < args.length; i++) {
      str[i - 1] = args[i];
    }
    return str;
  }

  public static void main(String[] args) {
    if (args.length < 1) {
      System.exit(-1);
    }
    String selectedFunction = args[0].toLowerCase();
    if (!(java.util.Arrays.asList(functions).contains(selectedFunction))) {
      System.out.println("Function does not exist");
      System.exit(-2);
    }
    String[] input = copyArray(args);
    int res;
    if (args.length > 2) {
      if (selectedFunction.equals("sum")) {
        res = sum(convertInt(input));
        System.out.println(res);
      }
      else if (selectedFunction.equals("xor")) {
        boolean bool;
        bool = xor(convertInt(input));
        System.out.println(bool);
      }
      else {
        System.exit(-3);
      }
    }
    else if (args.length == 2) {
      if (selectedFunction.equals("fact")) {
        res = fact(Integer.parseInt(args[1]));
        System.out.println(res);
      }
      else if (selectedFunction.equals("fib")) {
        res = fib(Integer.parseInt(args[1]));
        System.out.println(res);
      }
      else {
        System.exit(-3);
      }
    }
    else {
      System.exit(-3);
    }
  }
}