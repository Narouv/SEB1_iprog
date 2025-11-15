public interface ICharacter {
  public abstract String getName();
  public abstract void equip(AMateria m);
  public abstract void unequip(int idx);
  public abstract void use(int idx, ICharacter target);
}