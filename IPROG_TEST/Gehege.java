/**
 * @author R.Nauke
 */


public class Gehege {
  String gehegeName;
  Tier[] tiere = new Tier[0];

  public void einbuchten(Tier tier) {
    if (tier != null) {
      Tier[] tmpTiere = new Tier[tiere.length + 1];
      for (int i = 0; i < tiere.length; i++) {
        tmpTiere[i] = tiere[i];
      }
      tmpTiere[tiere.length] = tier;
      tiere = tmpTiere;
    }
  }

  public Gehege(String _nummer) {
    this.gehegeName = _nummer;

  }
}
