/**
 * @author R.Nauke
 */


public class Loewe extends Tier{
  int maenenLaenge = 0;

  @Override
  public String printInfo() {
    String str = this.tierart + " " + this.name + " ist " + this.alter + " Jahre alt"; 
    if (maenenLaenge > 0) {
      str += " und hat Mähne von " + this.maenenLaenge + " cm";
    }
    return str;
  }

  public Loewe(String _tierart, int _alter, String _name, int _ml) {
    super(_tierart, _alter, _name);
    this.maenenLaenge = _ml;
  }
  public Loewe(String _tierart, int _alter, String _name) {
    super(_tierart, _alter, _name);
  }
}
