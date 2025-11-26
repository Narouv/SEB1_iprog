/**
 * @author R.Nauke
 */


public abstract class Tier {
  String tierart;
  int alter;
  String name;
  
  public abstract String printInfo();

  public Tier (String _tierart, int _alter, String _name) {
    this.alter = _alter;
    this.tierart = _tierart;
    this.name = _name;
  }
}
