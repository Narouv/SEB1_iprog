public class MateriaSource implements IMateriaSource {
  private AMateria[] inventory = new AMateria[4];

  public void learnMateria(AMateria m) {
    for (int i = 0; i < inventory.length; i++) {
      if (inventory[i] == null) {
        inventory[i] = m;
        return;
      }
    }
  }

  public AMateria createMateria(String type) {
    for (AMateria slot : inventory) {
      if (slot.getType().equals(type)) {
        return slot;
      }
    }
    System.out.println("You have not learned any Materias yet!");
    return null;
  }
}