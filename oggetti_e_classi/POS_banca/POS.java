import java.util.ArrayList;

class POS {

    static Conto conto;

    public static void main(String[] args) {

        ArrayList<Conto> conti = new ArrayList<Conto>();
        conto = new Conto(1234, "00003435", 100);

        // conti.add(conto);

        System.out.println(conto.getPin());
        System.out.println(conto.getNumero());
        System.out.println(conto.getSaldo());
        System.out.println("--------------------------------");
        POS.prelievo(20);
        POS.prelievo(40);
        POS.prelievo(30);
        POS.prelievo(5);

        // POS.menu();
    }

    public static void stampaSaldo() {
        // trovo il conto
        Conto contoTrovato = trovaConto();
    }

    public static void prelievo(double quantita) {

        // trovo il conto
        Conto contoTrovato = trovaConto();
       

        int numPrelievi = conto.getPrelievi();
        if (numPrelievi < 3) {
            // logica prelievo
            conto.preleva(quantita);
            conto.incrementaPrelievi();
        } else {
            System.out.println("superato numero prelievi");
        }
    }

    public static void ricaricaCarta() {
         // trovo il mio conto
         Conto contoTrovato = trovaConto();

         //logica ricarica
    }

    public static void esci() {
        System.out.exit(0);
    }

    public static void menu() {
        String menuString = "Ciao,\nche cosa vuoi fare:\n**** STAMPA SALDO >> S\n**** PRELIEVO >> P\n**** RICARICA CARTA >> R\n**** ESCI >> Q";
        System.out.println(menuString);
    }

    public static Conto trovaConto(){ // trova il conto
        // scan pin scan conto
        // immetti pin
        // immetti numConto
        // logica trova
        if(true){
            return conto;
        } else {
           POS.esci();
        }
       

    }

}