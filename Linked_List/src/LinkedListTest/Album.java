package LinkedListTest;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artis;
    private ArrayList<Song> songs;

    public Album(String name, String artis) {
        this.name = name;
        this.artis = artis;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        Song song = findSong(title);
        if (song == null) {
            this.songs.add(new Song(title, duration));
            System.out.println("Song with title: " + title + " has been added");
            return true;
        }

        System.out.println("Song with title " + title + " already exists in the album");
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index < this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        }

        System.out.println("Song with track number " + trackNumber + " could not be found in album!");
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song song = findSong(title);
        if (song != null) {
            playList.add(song);
            return true;
        }

        System.out.println("Song with title " + title + " could not be found in album!");
        return false;
    }

    private Song findSong(String title) {
        for (Song checkedSong: this.songs) {
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }

        }

        return null;
    }
}
