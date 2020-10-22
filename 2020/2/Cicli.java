import java.util.*;

public class Cicli {

    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        System.out.println("Valore della I");
        int primoNumero = myScan.nextInt();

        System.out.println("Valore della J");
        int secondoNumero = myScan.nextInt();

        for (int i = 0; i < primoNumero; i++) {

            // System.out.println("Valore di i: "+i);

            System.out.print("I=" + i + ": ");
            for (int j = 0; j < secondoNumero; j++) {
                // System.out.println("Valore di j: "+ j);
                int result = i * j;
                System.out.print(result + "; ");
            }
            System.out.println();

        }

    }

}
