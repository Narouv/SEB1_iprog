/**
 * @author R.Nauke
 */


public class Zoo {
  Gehege[] gehege = new Gehege[0];
  String namen;

  public void hinzufügen(Gehege gehege) {
    if (gehege != null) {
      Gehege[] tmpGehege = new Gehege[this.gehege.length + 1];
      for (int i = 0; i < this.gehege.length; i++) {
        tmpGehege[i] = this.gehege[i];
      }
      tmpGehege[this.gehege.length] = gehege;
      this.gehege = tmpGehege;
    }
  }

  public void aufnehmen(String gehegeName, Tier tier) {
    for (int i = 0; i < gehege.length; i++) {
      if (gehegeName.equals(gehege[i].gehegeName)) {
        gehege[i].einbuchten(tier);
        return;
      }
    }
  }

  public void aufnehmen(String gehegeName, Tier[] tiere) {
    for (int i = 0; i < gehege.length; i++) {
      if (gehegeName.equals(gehege[i].gehegeName)) {
        for (int j = 0; j < tiere.length; j++) {
          gehege[i].einbuchten(tiere[j]);
        }
        return;
      }
    }
  }

  public void zooDaten() {
    System.out.printf("Zoo %s:\n", this.namen);
    for (Gehege g : this.gehege) {
      System.out.printf("-Gehege %s:\n", g.gehegeName);
      for (Tier t : g.tiere) {
        System.out.println("--" + t.printInfo());
      }
    }
  }

  public Zoo(String _namen) {
    this.namen = _namen;
  }
}
