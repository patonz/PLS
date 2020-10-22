import java.time.*;
import java.util.*;

public class AnimaleDomestico {
  protected Date nascita;
  protected double peso;

  public AnimaleDomestico(Date nascita, double peso){
    this.nascita = nascita;
    this.peso = peso;
  }

  public Date get_nascita(){
    return nascita;
  }

  public double get_peso(){
    return peso;
  }

  public String toString() {
    return ("Data di nascita: " + nascita + "; Peso: " + peso);
  }

}
