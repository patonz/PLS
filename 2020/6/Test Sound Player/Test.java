import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;
public class Test {

    static String filePath;
    public static void main(String[] args) { 
        try {
            filePath = "../songs/legends_never_die.aiff";
            SimpleAudioPlayer audioPlayer = new SimpleAudioPlayer(filePath);

            audioPlayer.play();

            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("1. pause");
                System.out.println("2. resume");
                System.out.println("3. restart");
                System.out.println("4. stop");
                System.out.println("5. Jump to specific time");

                int c = sc.nextInt();
                audioPlayer.gotoChoice(c);
                if (c == 4)
                    break;
            }
            sc.close();
        }

        catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();

        }
    }

    // Work as the user enters his choice

}
