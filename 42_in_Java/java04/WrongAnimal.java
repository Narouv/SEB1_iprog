public class WrongAnimal {
  protected String type;

  public WrongAnimal() {
    this.type = "Wrong Animal";
  }

  public WrongAnimal(String _type) {
    this.type = _type;
  }

  public void makeSound() {
    System.out.println("no animal makes this sound");
  }

  public String getType() {
    return this.type;
  }
}