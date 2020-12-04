import java.util.*;

public class TestMusicBox {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Scegli cosa fare:");
            System.out.println("0 - esci");
            System.out.println("1 - crea un album di default");
            System.out.println("2 - stampa tutti gli album");
            System.out.println("3 - stampa le canzoni dell'album 0");
            System.out.println("4 - play canzone 0 dell'album 0");
            int opt = scan.nextInt();

            switch (opt) {
                case 1:
                    MusicBox.createAlbum("Album numero 1");
                    MusicBox.addSongToAlbum(0, "canzone bella", 300);
                    break;

                case 2:
                    MusicBox.printAlbums();
                    break;

                case 3:
                    MusicBox.printSongsofAlbum(0);
                    break;
                case 0:
                    return;

                default:
                    break;
            }

            System.out.println("-----------------------------");
            System.out.println();
        }
    }
}
