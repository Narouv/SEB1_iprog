/**
 * @author R.Nauke
 */

public class main {
  public static void main(String[] args) {
    {
      AAnimal[] animals = new AAnimal[6];
      animals[0] = new Cat();
      animals[1] = new Dog();
      animals[2] = new Cat();
      animals[3] = new Dog();
      animals[4] = new Cat();
      animals[5] = new Dog();

      for (AAnimal aa : animals)
      {
        aa.makeSound();
      }
    }
    // {
    //   AAnimal meta = new AAnimal();
    //   AAnimal cat = new Cat();
    //   AAnimal dog = new Dog();

    //   WrongAnimal wa = new WrongAnimal();
    //   WrongAnimal car = new WrongCat();


    //   System.out.println(cat.getType());
    //   System.out.println(dog.getType());

    //   dog.makeSound();
    //   meta.makeSound();
      
    //   System.out.println();
    //   System.out.println(car.getType());
    //   wa.makeSound();
    //   car.makeSound();
    // }
  }
  
}