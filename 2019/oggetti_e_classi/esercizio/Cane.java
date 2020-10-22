import java.time.*;
import java.util.*;

public class Cane extends AnimaleDomestico {
  protected String razza;
  protected int eta;

  public Cane(Date nascita, double peso, String razza, int eta) {
    super(nascita, peso);
    this.razza = razza;
    this.eta = eta;
  }

  public String get_razza(){
    return razza;
  }

  public int get_eta(){
    return eta;
  }



  public int get_eta_umana(){
    int eta_umana;
    switch(eta) {
      case 0: eta_umana = 0; break;
      case 1: eta_umana = 15; break;
      case 2: eta_umana = 24; break;
      default: eta_umana = (24+(4*(eta-2)));
    }
    return eta_umana;
    
  }

  public String toString() {
    String s = super.toString();
    return (s + "; Razza: " + razza + "; Età: " + eta);
  }





}
