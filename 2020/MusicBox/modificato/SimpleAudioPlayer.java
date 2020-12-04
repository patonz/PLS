
// Java program to play an Audio 
// file using Clip Object 
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class SimpleAudioPlayer {

    // to store current position
    Long currentFrame;
    Clip clip;

    // current status of clip
    String status;

    AudioInputStream audioInputStream;
    String filePath;

    // constructor to initialize streams and clip
    public SimpleAudioPlayer( String filePath) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        this.filePath = filePath;
        // create AudioInputStream object
        audioInputStream = AudioSystem.getAudioInputStream(new File(this.filePath).getAbsoluteFile());

        // create clip reference
        clip = AudioSystem.getClip();

        // open audioInputStream to the clip
        clip.open(audioInputStream);
        FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        //gainControl.setValue(-20.0f);
        clip.loop(Clip.LOOP_CONTINUOUSLY);

    }

    
    public void gotoChoice(int c) throws IOException, LineUnavailableException, UnsupportedAudioFileException {
        switch (c) {
            case 1:
                pause();
                break;
            case 2:
                resumeAudio();
                break;
            case 3:
                restart();
                break;
            case 4:
                stop();
                break;
            case 5:
                System.out.println("Enter time (" + 0 + ", " + clip.getMicrosecondLength() + ")");
                Scanner sc = new Scanner(System.in);
                long c1 = sc.nextLong();
                jump(c1);
                break;

        }

    }

    // Method to play the audio
    public void play() {
        // start the clip
        clip.start();

        status = "play";
    }

    // Method to pause the audio
    public void pause() {
        if (status.equals("paused")) {
            System.out.println("audio is already paused");
            return;
        }
        this.currentFrame = this.clip.getMicrosecondPosition();
        clip.stop();
        status = "paused";
    }

    // Method to resume the audio
    public void resumeAudio() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        if (status.equals("play")) {
            System.out.println("Audio is already " + "being played");
            return;
        }
        clip.close();
        resetAudioStream();
        clip.setMicrosecondPosition(currentFrame);
        this.play();
    }

    // Method to restart the audio
    public void restart() throws IOException, LineUnavailableException, UnsupportedAudioFileException {

        clip.stop();
        System.out.println("-");
        clip.close();
        System.out.println("-");
        resetAudioStream();
        System.out.println("-");
        currentFrame = 0L;
        System.out.println("-");
        clip.setMicrosecondPosition(0);
        System.out.println("-");
        this.play();
        System.out.println("-");
    }

    // Method to stop the audio
    public void stop() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        currentFrame = 0L;
        clip.stop();
        clip.close();
    }

    // Method to jump over a specific part
    public void jump(long c) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        if (c > 0 && c < clip.getMicrosecondLength()) {
            clip.stop();
            System.out.println("-");
            clip.close();
            System.out.println("-");
            resetAudioStream();
            System.out.println("-");
            currentFrame = c;
            System.out.println("-");
            clip.setMicrosecondPosition(c);
            System.out.println("-");
            this.play();
        }
        
    }

    // Method to reset audio stream
    public void resetAudioStream() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        System.out.println("-");
        audioInputStream = AudioSystem.getAudioInputStream(new File(this.filePath).getAbsoluteFile());
        System.out.println("-");

        clip.open(audioInputStream);
        System.out.println("-");
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

}
