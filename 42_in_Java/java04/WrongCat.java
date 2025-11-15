public class WrongCat extends WrongAnimal {
  public WrongCat() {
    super("WrongCat");
  }

  @Override
  public void makeSound() {
    System.out.println("MEOWRRR >:3");
  }    
}