package org.example;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlaylistJUnitTest {
    private Playlist playlist;

    @Before
    public void setUp() {
        playlist = new Playlist();
    }

    @Test
    public void testAddSong() {
        playlist.addSong("Song A");
        assertTrue(playlist.checkSong("Song A"));
    }

    @Test
    public void testRemoveSong() {
        playlist.addSong("Song B");
        assertTrue(playlist.removeSong("Song B"));
        assertFalse(playlist.checkSong("Song B"));
    }

}
