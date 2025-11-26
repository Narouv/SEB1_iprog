/**
 * @author R.Nauke
 */


public class Elefant extends Tier {
  int stoßzahnLaenge = 0;

  @Override
  public String printInfo() {
    String str = this.tierart + " " + this.name + " ist " + this.alter + " Jahre alt"; 
    if (stoßzahnLaenge > 0) {
      str += " und hat Stoßzähne von " + this.stoßzahnLaenge + " cm";
    }
    return str;
  }

  public Elefant(String _tierart, int _alter, String _name, int _szl) {
    super(_tierart, _alter, _name);
    this.stoßzahnLaenge = _szl;
  }
  public Elefant(String _tierart, int _alter, String _name) {
    super(_tierart, _alter, _name);
  }
}
