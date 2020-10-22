public class Esercizio3 {
    public static void main(String[] args) {
       
       // creo un cono a 3 gusti
        Cono cono = new Cono(200);

        cono.addGusto();
        cono.addGusto();
        cono.addGusto();

        // dal quarto addGusto, non verrà conteggiato
        cono.addGusto();
        System.out.println(cono.getPrezzoTotale());

        // rimuovo 2 gusti e ristamo il prezzo
        cono.removeGusto();
        cono.removeGusto();
        System.out.println(cono.getPrezzoTotale());
        
    }
}