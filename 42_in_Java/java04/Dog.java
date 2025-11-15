/**
 * @author R.Nauke
 */

public class Dog extends AAnimal {
  private Brain brain;

  public Dog() {
    super("Dog");
    this.brain = new Brain();
  }

  @Override
  public void makeSound() {
    System.out.println("wau wau");
  }
}