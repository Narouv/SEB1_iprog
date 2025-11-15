public class Cure extends AMateria {

  public Cure() {
    super("cure");
  }

  public Cure(Cure copy) {
    super(copy);
  }

  @Override
  public AMateria clone() {
    return new Cure(this);
  }

  @Override
  public void use(ICharacter target) {
    System.out.println("* heals " + target.getName() + "'s wounds *");
  }
}