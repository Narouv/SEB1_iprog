/**
 * @author R.Nauke
 */

public class Cat extends AAnimal {
  private Brain brain;

  public Cat() {
    super("Cat");
    this.brain = new Brain();
  }

  @Override
  public void makeSound() {
    System.out.println("meow :3");
  }
}