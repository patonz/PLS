import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;
import java.util.*;

public class MusicBox {

    private static Album[] albums = new Album[5];

    public static void createAlbum(String albumTitle) {
        boolean created = false;
        for (int i = 0; i < albums.length; i++) {
            if (albums[i] == null) {
                // creo;
                albums[i] = new Album();
                albums[i].setTitle(albumTitle);

                created = true;
                break;
            }
        }

        if (created) {
            System.out.println("L'album è stato creato");
        } else {
            System.out.println("L'album NON è stato creato");
        }
    }

    public static void printAlbums() {
        for (int i = 0; i < albums.length; i++) {

            if (albums[i] == null) {
                System.out.println(i + "- slot vuoto");
            } else {
                System.out.println(i + "- " + albums[i].getTitle());
            }

        }
    }

    public static void addSongToAlbum(int numAlbum, String songTitle, int songTime) {
        Album album = albums[numAlbum];
        if (album == null) {
            System.out.println("L'album indicato non esiste!!");
        } else {
            album.addSong(songTitle, songTime);
        }
    }

    public static void printSongsofAlbum(int numAlbum) {
        Album album = albums[numAlbum];
        if (album == null) {
            System.out.println("L'album indicato non esiste!!");
        } else {
            album.printSongs();
        }

    }

    public static void playASong(int numAlbum, int numSong)
            throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Album album = albums[numAlbum];
        if (album == null) {
            System.out.println("L'album indicato non esiste!!");
        } else {
            Song song = album.getSongs()[0];
            if (song == null) {
                System.out.println("La canzone non esiste!!");
            } else {

                SimpleAudioPlayer audioPlayer = new SimpleAudioPlayer(song.filePath);

                audioPlayer.play();
            }
        }
    }

    public static void stopASong(int numAlbum, int numSong) {
        Album album = albums[numAlbum];
        if (album == null) {
            System.out.println("L'album indicato non esiste!!");
        } else {
            Song song = album.getSongs()[0];
            if (song == null) {
                System.out.println("La canzone non esiste!!");
            } else {

            }
        }
    }
}
