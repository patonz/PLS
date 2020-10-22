import java.util.*;
import java.time.*;
public class Test_ZooDomestico {
  public static void main(String[] args) {

    Date data1 = new Date(118, 12, 23);
    Date data2 = new Date(119, 5, 11);
    Date data3 = new Date(115, 10, 16);

  

    Gatto gatto = new Gatto(data1, 6.55, "Pesce", 2);
    Cane cane = new Cane(data2, 12, "Boxer", 1);
    Cane cane2 = new Cane(data3, 9, "Carlino", 5);

    gatto.set_eta();
    cane.set_eta();
    cane2.set_eta();

    AnimaleDomestico[] listaAnimali = {gatto, cane, cane2};

    for (int i=0; i< listaAnimali.length; i++) {
      System.out.println(listaAnimali[i].toString());
    }

    ZooDomestico.etaMedia(listaAnimali);

  }
}
