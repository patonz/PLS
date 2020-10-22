import java.time.*;
import java.util.*;

public class Gatto extends AnimaleDomestico{
  protected String cibo;
  protected int eta;

  public Gatto(Date nascita, double peso, String cibo, int eta) {
    super(nascita, peso);
    this.cibo = cibo;
    this.eta = eta;
  }

  public String get_cibo(){
    return cibo;
  }

  public int get_eta(){
    return eta;
  }

  public void set_eta(){
    eta = eta * 7;
  }

  public String toString() {
    String s = super.toString();
    return (s + "; Cibo: " + cibo + "; Età: " + eta);
    }



}
