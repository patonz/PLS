

// Esercizio 1 
// Realizzare un programma, denominato Esercizio1, contenente una funzione cdispari(n),
// che dato un intero n che si garantisce essere >= 1, restituisce un valore true se tutte le
// cifre della rappresentazione decimale di n sono dispari, e false altrimenti. 
// Ad esempio, cdispari(13) deve restituire true, perché il numero 13 ha tutte le cifre dispari.
// Invece, cdispari(231) deve restituire false, perché il numero 231 NON ha tutte le cifre 
// dispari. Ricordare che zero è pari.
import java.util.*;
class Esercizio1_sol {
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Inserisci un numero intero");
            int num = scanner.nextInt();
            if(num >= 1){
               
                boolean check = Esercizio1_sol.cdispari(num);
                if(check){
                    System.out.println("TRUE - Le cifre sono tutte dispari!");
                } else {
                    System.out.println("FALSE - almeno una cifra è pari!!!");
                }
            } else {
                System.out.println("Numero non valido!");
                System.exit(0);
            }
            
        } catch (InputMismatchException e) {
            System.out.println("input non valido!!");
        }
        scanner.close();
       

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

    public static boolean cdispari2(int num){

        String numString = String.valueOf(num);
        char[] chars = numString.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int digit = Character.getNumericValue(chars[i]);
            if(digit % 2 == 0){
                return false;
            }
        }

        return true;
    }

    
}