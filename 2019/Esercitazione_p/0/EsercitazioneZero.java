import java.util.Scanner; // import Scanner Class

public class EsercitazioneZero {
    public static void stampaDispari(int[] array) {
        System.out.println("\nstampa dei numeri dispari dell'array");
        for (int i = 0; i < array.length; i++) {
            int resto = array[i] % 2;
            if (resto > 0) {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // oggetto Scanner
        System.out.println("Inserisci il numero di interi positivi");
        int nCicli = scan.nextInt();

        int[] numeriInteri = new int[nCicli];

        int i = 0;
        while (i < nCicli) {
            numeriInteri[i] = i;
            i = i + 1; // i++;
        } // 0,1,2,3...., nCicli-1;
        System.out.println("l'array di numeri generato è: ");
        for (int k = 0; k < numeriInteri.length; k++) {
            System.out.print(numeriInteri[k] + " ");
        }

        stampaDispari(numeriInteri);

    }

    
}




/**
 * 0. Crea una classe chiamata "EsercitazioneZero" (sai cos'è?) ---Aggiungi il
 * metodo "main" (a cosa serve?) ---Dentro il metodo main, fai visualizzare a
 * video "Inizio Esercizio Zero" ---Apri il terminale, posizionati nella
 * cartella ed esegui: javac EsercitazioneZero.java ---Esegui ora: java
 * EsercitazioneZero 
 1. Inizializza uno Scanner per prendere da tastiera un
 * numero intero ---Salva il numero intero in una variabile (nCicli)
 * ---Inizializza un ciclo FOR, che va da i=0 a nCicli ---Stampa a video la
 * variabile i ad ogni passaggio. 
 2.Utilizza lo stesso ciclo for, stavolta
 * stampa soltanto i numeri pari 
 3.Ripeti l'operazione (2.) ma utilizzando un
 * WHILE. 
 4.Stampa stavolta soltanto i numeri interi divisibili ---con un numero
 * preso da tastiera (quindi senza resto) 
 5.utilizza nCicli come lunghezza di un
 * nuovo array di int. ---riempi l'array con una successione di Fibonacci
 * https://it.wikipedia.org/wiki/Successione_di_Fibonacci --- Stampa la
 * successione, ma partendo dall'ultimo valore verso il primo. 
 6. Stampa a
 * questo punto soltanto i numeri primi dell'array 
 7. crea un metodo che dato in
 * input un numero, stampa a video lo stesso ---numero elementi di una
 * successione di fibonacci (esempio: 4 -> 0,1,1,2) 
 8. crea un metodo che dato
 * in input un array di interi, stampa a video tutti i numeri DISPARI ---tra 1 e
 * il numero. (esempio 8 -> 2,4,8) 9. stessa cosa del punto (8.) ma con numeri
 * PARI 10. utilizzare tutti e 3 i metodi precedenti alternando i vari input da
 * tastiera con messaggi opportuni ---Esempio: (Inserisci ora quanti numeri di
 * fibonacci vuoi visualizzare) e richiamare ---il metodo con l'input appena
 * inserito. 11. Creare un "menu" di selezione, chiedendo all'utente quale
 * operazione vuole fare ---dei 3 metodi implementati. ---Esempio--> inserisci
 * il numero del metodo che vuoi usare: 1. Fibonacci, 2 Numeri Pari, 3 Numeri
 * Dispari ---In base all'input, usare uno switch e richiamare le righe di
 * codice gia implementate. ---Nb qualsiasi altro numero terminerà il programma
 * direttamente. 12. Ricreare lo Switch ma utilizzando le stringhe e non i
 * numeri come scelta (a,b,c) ---il programma termina se viene inviata la
 * stringa "termina" altrimenti ---viene richiesto di immettere una stringa
 * valida e poi termina.
 */