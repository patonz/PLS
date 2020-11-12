import java.util.*;

public class Esercizio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Righe: ");
        int righe = scan.nextInt();

        System.out.print("Colonne: ");
        int colonne = scan.nextInt();

        System.out.println();

        int[][] matrice = new int[righe][colonne];

        for (int i = 0; i < righe; i++)
            for (int j = 0; j < colonne; j++)
                matrice[i][j] = (int) (Math.random() * 21);

        System.out.println();
        System.out.println("Matrice creata:");

        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++)
                System.out.print(matrice[i][j] + "\t");
            System.out.println();
        }

        if (righe > colonne) {

            int diff = righe - colonne;
            int[][] matriceCorretta = new int[righe][colonne + diff];

            for (int i = 0; i < righe; i++)
                for (int j = 0; j < colonne; j++)
                    matriceCorretta[i][j] = matrice[i][j];

            for (int i = 0; i < righe; i++)
                for (int j = colonne; j < righe; j++)
                    matriceCorretta[i][j] = 0;

            colonne = colonne + diff;
        }

        else if (colonne > righe) {

            int diff = colonne - righe;
            int[][] matriceCorretta = new int[righe + diff][colonne];

            for (int i = 0; i < righe; i++)
                for (int j = 0; j < colonne; j++)
                    matriceCorretta[i][j] = matrice[i][j];

            for (int i = righe; i < colonne; i++)
                for (int j = 0; j < colonne; j++)
                    matriceCorretta[i][j] = 0;

            righe = righe + diff;
        }

        else {
            int[][] matriceCorretta = new int[righe][colonne];

            for (int i = 0; i < righe; i++)
                for (int j = 0; j < colonne; j++)
                    matriceCorretta[i][j] = matrice[i][j];
        }

        System.out.println();
        System.out.println("Matrice corretta:");

        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++)
                System.out.print(matriceCorretta[i][j] + "\t");
            System.out.println();
        }

    }


}