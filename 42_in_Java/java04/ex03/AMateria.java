public abstract class AMateria {
  protected final String type;

  public AMateria(String _type) {
    this.type = _type;
  }

  public AMateria(AMateria copy) {
    this.type = copy.type;
  }

  public abstract AMateria clone();

  public abstract void use(ICharacter target);

  public String getType() {
    return this.type;
  }
}