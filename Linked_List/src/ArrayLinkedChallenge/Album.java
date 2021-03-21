package ArrayLinkedChallenge;

import java.util.ArrayList;

public class Album {
    private String name;

    private ArrayList<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public Song getSongByTitle(String title) {
        if (findSong(title) != null) {
            return findSong(title);
        }

        return null;
    }

    public void addSong(Song song) {
        this.songs.add(song);
    }

    private Song findSong(String title) {
        for (int i=0; i<this.songs.size(); i++) {
            Song checkedSong = this.songs.get(i);
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }
}
