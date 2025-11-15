/**
 * @author R.Nauke
 */

public class Animal {
  protected String type;

  public Animal() {
    this.type = "";
  }

  public Animal(String _type) {
    this.type = _type;
  }

  public void makeSound() {
    System.out.println("fortnite");
  };

  public String getType() {
    return this.type;
  }
}