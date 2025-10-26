/**
 * @author R.Nauke
 */

public class AlphabetTriangle {
  public static void main(String[] args) {
    for (int i = 1; i <= 26; i++) {
      System.out.println(createLine(i));
    }
  }

  public static String createLine(int count) {
    String line = "";
    for (int i = 0; i < count && i < 26; i++) {
      line += (char)('A' + i) + " ";

    }
    return line;
  }
}