/**
 * @author R.Nauke
 */

public class main {
  public static void main(String[] args) {
    Animal meta = new Animal();
    Animal cat = new Cat("paulaner spezi");
    Animal dog = new Dog("rufus");

    System.out.println(cat.getType());
    System.out.println(dog.getType());
    cat.makeSound();
    dog.makeSound();
    meta.makeSound();
    
  }
}