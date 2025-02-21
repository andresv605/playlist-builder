package org.example;
import java.util.Scanner;

public class PlaylistMain {
    private final Playlist playlist;
    private final Scanner scanner;

    public PlaylistMain() {
        this.playlist = new Playlist();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        int choice;
        do {
            System.out.println("\nMusic Playlist Builder");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. View Playlist");
            System.out.println("4. Check Song in List");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addSong();
                case 2 -> removeSong();
                case 3 -> viewPlaylist();
                case 4 -> checkSong();
                case 5 -> System.out.println("Exiting... Playlist saved.");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }

    private void addSong() {
        System.out.print("Enter song title: ");
        String song = scanner.nextLine();
        playlist.addSong(song);
        System.out.println("Song added successfully.");
    }

    private void removeSong() {
        System.out.print("Enter song title to remove: ");
        String song = scanner.nextLine();
        if (playlist.removeSong(song)) {
            System.out.println("Song removed successfully.");
        } else {
            System.out.println("Song not found.");
        }
    }

    private void viewPlaylist() {
        System.out.println("\nYour Playlist:");
        for (String song : playlist.viewPlaylist()) {
            System.out.println("- " + song);
        }
    }

    private void checkSong() {
        System.out.print("Enter song title to check: ");
        String song = scanner.nextLine();
        if (playlist.checkSong(song)) {
            System.out.println(song + " is in the playlist.");
        } else {
            System.out.println(song + " is not in the playlist.");
        }
    }
    public static void main(String[] args) {
        new PlaylistMain().start();
    }
}