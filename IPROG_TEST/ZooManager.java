/**
 * @author R.Nauke
 */


public class ZooManager {
  Zoo Soo = new Zoo("Soo");

  public void main(String[] args) {
    Soo.hinzufügen(new Gehege("komischeTiere"));
    Soo.aufnehmen("komischeTiere", new Elefant("Elefant", 200, "Bob", 30));
    Soo.aufnehmen("komischeTiere", new Elefant("Löwe", 200, "Tom", 10));
    Soo.aufnehmen("komischeTiere", new Elefant("Elefant", 200, "Gerald"));
    Soo.zooDaten();
  }
}
