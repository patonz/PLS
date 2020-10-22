public class AscendingDescending {
    public static void main(String[] args) {
        /**
         * determinare se un array di numeri interi, abbia tutti gli elementi in ordine
         * crescente o decrescente
         * 
         * NB: numeri interi positivi/negativi sono tutti ammessi. /l'array può anche
         * essere vuoto. 2, 2 , 3 -> crescente 2, 2, 1 -> decrescente 2, 2, 2 -> nessuno
         * dei due casi!
         */

        // DA COMPLETARE
        // 1. inizializzare un array da tastiera (lunghezza variabile)
        int[] array1 = { 8, 19, 78, 100 };

        boolean crescente = true;

        // i=0,1,2,...,LunghezzaArray-1.
        for (int i = 0; i < array1.length; i++) { // ciclo n-1 lunghezza array
            System.out.println("------inizio ciclo i=" + i + "------");
            int indiceSuccessivo = i + 1;

            // NB: al posto di indiceSuccessivo, sarebbe più elegante scrivere direttamente
            // i+1
            if (indiceSuccessivo < array1.length) { // L'elemento successivo, esiste? check IndexOutOfBound
                System.out.println("Indice attuale: " + i + " valore: " + array1[i]);
                System.out.println("indice successivo: " + indiceSuccessivo + " valore: " + array1[indiceSuccessivo]);

                // se il successivo elemento è minore del corrente...
                if (array1[indiceSuccessivo] < array1[i]) {
                    System.out.println(array1[indiceSuccessivo] + " è minore di: " + array1[i]);
                    crescente = false; // allora l'array non è crescente!
                }

                System.out.println("la variabile 'crescente' è " + crescente);
            } else {
                System.out.println("il numero " + array1[i] + " è l'ultimo elemento!");
            }

            System.out.println("------fine ciclo i=" + i + "------\n");
        }

        System.out.println("------RESULT-----\t");
        // oppure crescente == true
        if (crescente) {
            System.out.println("l'array1 è crescente!");
        } else {
            System.out.println("l'array1 non è crescente!");
        }

        // 2. Da Completare:
        // partendo da un array, se non è Crescente o Decrescente,
        // ordinarlo di conseguenza (scelta dell'utente)
        //

    }

    private static boolean isAscending(int[] array) {
        boolean ascending = false;

        return ascending;
    }

    private static boolean isDescending(int[] array) {
        boolean descending = false;

        return descending;
    }
}