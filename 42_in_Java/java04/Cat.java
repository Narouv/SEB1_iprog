/**
 * @author R.Nauke
 */

public class Cat extends Animal {
  private final String name;

  public Cat(String _name) {
    super("Cat");
    this.name = _name;
  }

  @Override
  public void makeSound() {
    System.out.println("meow :3");
  }
}