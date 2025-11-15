public class Character implements ICharacter {
  private String name;
  private AMateria[] inventory = new AMateria[4];

  public Character(String _name) {
    this.name = _name;
  }

  public String getName() {
    return this.name;
  }

  public void equip(AMateria m) {
    for (int i = 0; i < inventory.length; i++) {
      if (inventory[i] == null) {
        inventory[i] = m;
        return;
      }
    }
  }

  public void unequip(int idx) {
    inventory[idx] = null;
  }

  public void use(int idx, ICharacter target) {
    if (inventory[idx] == null) {
      System.out.println("No materia equipped in this slot");
      return;
    }
    else {
      inventory[idx].use(target);
      return;
    }
  }
}