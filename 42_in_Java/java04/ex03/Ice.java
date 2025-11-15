public class Ice extends AMateria {

  public Ice() {
    super("ice");
  }

  public Ice(Ice copy) {
    super(copy);
  }

  @Override
  public AMateria clone() {
    return new Ice(this);
  }

  @Override
  public void use(ICharacter target) {
    System.out.println("* shoots an ice bolt at " + target.getName() + " *");
  }
}