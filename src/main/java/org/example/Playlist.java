package org.example;
import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private final List<String> songList;

    public Playlist() {
        this.songList = new ArrayList<>();
    }

    public void addSong(String song) {
        songList.add(song);
    }

    public boolean removeSong(String song) {
        return songList.remove(song);
    }

    public List<String> viewPlaylist() {
        return new ArrayList<>(songList);
    }

    public boolean checkSong(String song) {
        return songList.contains(song);
    }
}
