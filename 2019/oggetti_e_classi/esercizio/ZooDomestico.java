public class ZooDomestico {

  public static void etaMedia(AnimaleDomestico[] a) {
    double sommatoria = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] instanceof Cane) {
        Cane bau = (Cane) a[i];
        // System.out.println("età del cane "+ bau.get_eta());
        sommatoria = sommatoria + bau.get_eta();
      }
      if (a[i] instanceof Gatto) {
        Gatto miao = (Gatto) a[i];
        // System.out.println("età del gatto "+ miao.get_eta());
        sommatoria = sommatoria + miao.get_eta();
      }
    }

    double media = sommatoria / a.length;

    System.out.println("L'età media degli animali è: " + media);
  }

}
