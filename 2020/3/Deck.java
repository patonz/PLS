/**
 * Modificare il programma del cubo magico fatto a lezione. 
 * 1 - chiedere da tastiera la grandezza della matrice di carte ( intero potivo ) = N 
 * 2 - Pescare da un mazzo di carte MESCOLATO tramite il metodo "shuffleDeck" le prime N^2 carte 
 * 3 - creare una matrice a questo punto non di numeri ma di Card 
 * 4 - Controllare che la matrice di Card sia una cubo magico. Le varie somme utilizzano come valore numerico il "value" di ogni Card
 * 5 - OPZIONALE Invece di controllare che le somme siano esattamente uguali, valutare che siano semplicemente un numero multiplo scelto da tastiera 
 *      es: se tutte le somme sono multipli di 5, è un cubo magico. (se sono multipli di 1 è sempre un cubo magico, usatelo come test)
 */

public class Deck {
    public static void main(String[] args) {

        Card[] deck = generateDeck();
        shuffleDeck(deck);

    }

    public static Card[] generateDeck() {
        final int numCards = 40; // numero di carte in un mazzo
        final String[] seeds = { "spade", "coppe", "bastoni", "denari" }; // semi delle carte
        Card[] deck = new Card[numCards]; // mazzo ( o array ) di 40 carte "null"

        int cardCount = 0; // conta quante carte non null ho inserito nel mazzo
        for (int i = 0; i < seeds.length; i++) {
            String currentSeed = seeds[i]; // prendo un seed
            for (int valueCard = 1; valueCard <= 10; valueCard++) {
                Card card = new Card(valueCard, currentSeed); // creo 10 carte con quel seed con valore da 1 a 10.

                deck[cardCount] = card;
                cardCount++;

            }
        }

        return deck;
    }

    public static Card[] shuffleDeck(Card[] deck) {

        // scrivere la logica di "shuffle"
        // un array si mescola scambiando di posizione gli elementi in modo casuale.
        // potete far scegliere da tastiera il numero di scambi, o fissare voi un
        // numero.

        return deck;
    }

    // metodo che controlla che una matrice di carte sia un "cubo magico"
    public static boolean magicCube(Card[][] cards) {

        // da modificare e riadattare come meglio credete.
        // potete usare anche la vostra soluzione personale.

        int grandezzaMatrice = 4;

        int[][] matrice = { { 16, 3, 2, 13 }, { 5, 10, 11, 8 }, { 9, 6, 7, 12 }, { 4, 15, 14, 1 } };

        int sommatoriaPrec = 0;
        int sommatoriaDiagonaleA = 0;
        int sommatoriaDiagonaleB = 0;
        for (int i = 0; i < matrice.length; i++) {
            int sommatoriaRiga = 0;
            int sommatoriaColonna = 0;

            for (int k = 0; k < matrice[i].length; k++) {
                sommatoriaRiga += matrice[i][k];

                sommatoriaColonna += matrice[k][i];
            }

            sommatoriaDiagonaleA += matrice[i][i];
            sommatoriaDiagonaleB += matrice[i][matrice.length - 1 - i];
            if (i == 0) {
                sommatoriaPrec = sommatoriaRiga;
            }
            if (sommatoriaRiga != sommatoriaPrec || sommatoriaColonna != sommatoriaPrec) {
                return false;
            }
        }
        if (sommatoriaPrec != sommatoriaDiagonaleA || sommatoriaPrec != sommatoriaDiagonaleB) {
            return false;
        }

        return true;
    }
}
