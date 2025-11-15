/**
 * @author R.Nauke
 */

public class Dog extends Animal {
  private final String name;

  public Dog(String _name) {
    super("Dog");
    this.name = _name;
  }

  @Override
  public void makeSound() {
    System.out.println("wau wau");
  }
}