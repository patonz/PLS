/**
 * Scrivere un programma in grado di smistare una lista di pacchi tra i vari
 * magazzini disponibili scrivere poi dei metodi di ricerca pacco by Contenuto,
 * Peso Tipo etc etc
 */

public class GestorePacchi {

    public static void main(String[] args) {

        Pacco.setMaxPeso(4000);

        Magazzino mag1 = new Magazzino("Bologna", 3);
        Magazzino mag2 = new Magazzino("Casalecchio", 1);
        Magazzino mag3 = new Magazzino("San Lazzaro", 4);

        Magazzino[] magazzini = { mag1, mag2, mag3 };
        Pacco[] pacchi = generaListaPacchi();

        for (int j = 0; j < magazzini.length; j++) {
            stampaListaPacchi(pacchi);
            System.out.println("i pacchi vanno inseriti in " + magazzini[j].getNome());
            System.out.println("----------");
            for (int i = 0; i < pacchi.length; i++) {

                if (pacchi[i] != null) {
                    System.out.println(pacchi[i].getInfo());
                    boolean paccoInserito = magazzini[j].inserisciPacco(pacchi[i]);
                    if (paccoInserito) {
                        pacchi[i] = null;
                    }

                }

            }

        }
    }

    public static Pacco[] generaListaPacchi() {
        Pacco[] listaPacchi = new Pacco[10];
        Pacco pacco = new Pacco("Cereali", "Scatola di cereali classici", 200, "alimentare");
        Pacco pacco1 = new Pacco("Tastiera", "tastiera a batteria", 400, "tecnologia");
        Pacco pacco2 = new Pacco("Tastiera", "tastiera a batteria", 400, "tecnologia");
        Pacco pacco3 = new Pacco("Tastiera", "tastiera a batteria", 400, "tecnologia");
        Pacco pacco4 = new Pacco("Quaderno", "a righe", 600, "cartoleria");

        inserisciPaccoInLista(listaPacchi, pacco);
        inserisciPaccoInLista(listaPacchi, pacco1);
        inserisciPaccoInLista(listaPacchi, pacco2);
        inserisciPaccoInLista(listaPacchi, pacco3);
        inserisciPaccoInLista(listaPacchi, pacco4);

        inserisciPaccoInLista(listaPacchi, new Pacco("Schermo", "Schermo 4k lg", 3000, "tecnologia"));
        return listaPacchi;
    }

    public static Pacco[] inserisciPaccoInLista(Pacco[] listaPacchi, Pacco pacco) {

        if (pacco.getPeso() > Pacco.getMaxPeso()) {
            System.out.println("Il pacco non può essere inserito, pesa troppo");
            return listaPacchi;
        }
        for (int i = 0; i < listaPacchi.length; i++) {
            if (listaPacchi[i] == null) {
                listaPacchi[i] = pacco;
                return listaPacchi;
            }

        }

        return listaPacchi;
    }

    public static void stampaListaPacchi(Pacco[] listaPacchi) {

        for (int i = 0; i < listaPacchi.length; i++) {
            if (listaPacchi[i] == null) {
                System.out.println("slot disponibile");
            } else {
                System.out.println(listaPacchi[i].getInfo());
            }

        }
    }
}
