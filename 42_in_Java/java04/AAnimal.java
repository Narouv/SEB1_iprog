/**
 * @author R.Nauke
 */

public abstract class AAnimal {
  protected String type;

  public AAnimal() {
    this.type = "";
  }

  public AAnimal(String _type) {
    this.type = _type;
  }

  public abstract void makeSound();

  public String getType() {
    return this.type;
  }
}