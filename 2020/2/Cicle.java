import java.util.Scanner;

public class Cicle {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Inserisci una parola ");
        String parola = myObj.next();
        System.out.println("Inserisci una parola ");
        String parola1 = myObj.next();
        int m = (parola.length()) >= (parola1.length()) ? (parola.length()) : (parola1.length());
        System.out.println(m);
        for (int i = 0; i < m; i++) {
           
            if (parola.length() > i && parola1.length() > i) { // lunghezza 2 =  charAt(0) e charAt(1)
                char c = parola.charAt(i);
                System.out.print(c);
                char c1 = parola1.charAt(i);
                System.out.print(c1);
                System.out.println();

            } else {
                if (parola.length() < i) {
                    System.out.print("  ");
                    char c1 = parola1.charAt(i);
                    System.out.print(c1);
                    System.out.println();

                } else {
                    char c = parola.charAt(i);
                    System.out.print(c);
                    System.out.println();

                }
            }
        }

    }
}
