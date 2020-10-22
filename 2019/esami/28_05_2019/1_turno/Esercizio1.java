//Esercizio 1 
//Realizzare un programma, denominato Esercizio1, contenente una funzione cdispari(n),
// che dato un intero n che si garantisce essere >= 1, 
//restituisce un valore true se tutte le cifre della rappresentazione decimale di n sono dispari, e false altrimenti. 
//Ad esempio, cdispari(13) deve restituire true, perché il numero 13 ha tutte le cifre dispari. 
//Invece, cdispari(231) deve restituire false, perché il numero 231 NON ha tutte le cifre dispari. Ricordare che zero è pari.

class Esercizio1 {
    public static void main(String[] args){

    }

    public static boolean cdispari(int num){

        while(num > 10){
            int digit = num % 10;
            if(digit % 2 == 0){
                return false;
            }
            num = num / 10;
        }

        return true;
    }
}
