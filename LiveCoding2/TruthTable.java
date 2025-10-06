/**
 * @author R.Nauke
 */

public class Program
{
  public void drawTable()
  {
    boolean A = false;
    boolean B = false;
    System.out.println("|\tA\t|\tB\t|\tNOT A\t|\tA AND B\t|\tA OR B\t|\tA XOR B\t|");
    System.out.println("=================================================================================================");
    System.out.printf("|\t%b\t|\t%b\t|\t%b\t|\t%b\t|\t%b\t|\t%b\t|\n", A, B, !A, A & B, A | B, A ^ B);
    B = true;
    System.out.printf("|\t%b\t|\t%b\t|\t%b\t|\t%b\t|\t%b\t|\t%b\t|\n", A, B, !A, A & B, A | B, A ^ B);
    B = false;
    A = true;
    System.out.printf("|\t%b\t|\t%b\t|\t%b\t|\t%b\t|\t%b\t|\t%b\t|\n", A, B, !A, A & B, A | B, A ^ B);
    B = true;
    System.out.printf("|\t%b\t|\t%b\t|\t%b\t|\t%b\t|\t%b\t|\t%b\t|\n", A, B, !A, A & B, A | B, A ^ B);
  }
  public void main()
  {
    drawTable();
  }
}
