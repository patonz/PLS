import java.util.*;
public class ParoleInColonna {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Inserisci 2 parole");
        String parola = myScan.next();
        String parola2 = myScan.next();

        System.out.println("Prima parola: '"+ parola + "'; seconda parola: '"+ parola2 + "'");
        String fill = " ";
        int maxLenght = Math.max(parola.length(), parola2.length());
        for(int i = 0; i < maxLenght; i++){
            String output = "";
            if(i >= parola.length()){
                output += fill + " ";
            } else {
                output += parola.charAt(i) +" ";
            }

            if(i >= parola2.length()){
                output += fill + " ";
            } else {
                output += parola2.charAt(i);
            }

            System.out.println(output);
            
        }
    }
}
