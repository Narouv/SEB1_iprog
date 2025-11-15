/**
 * @author R.Nauke
 */

public class main {
  public static void main(String[] args) {
    Bureaucrat bob = new Bureaucrat("Bob", 42);
    Bureaucrat jonas = new Bureaucrat("Jonas", 150);
    // Bureaucrat nikita = new Bureaucrat("Nikita", 1500);

    Form exmatrikulation = new Form("Exmatrikulation", 75, 15);

    jonas.signForm(exmatrikulation);
  }
}