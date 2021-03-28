package com.playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return this.songs.add(new Song(title, duration));
    }

    public boolean addToPlayList (int trackNumber, LinkedList<Song> playList) {
        Song checkedSong = this.songs.findSong(trackNumber);
        if (this.songs.findSong(trackNumber) != null) {
            System.out.println("Song with track number " + trackNumber + " has been added to playlist!");
            playList.add(checkedSong);
            return true;
        }

        System.out.println("Song with track number " + trackNumber + " could not be added to playlist!\n");
        return false;
    }

    public boolean addToPlayList (String title, LinkedList<Song> playList) {
        Song checkedSong = this.songs.findSong(title);
        if (checkedSong != null) {
            System.out.println("Song with title " + title + " has been added to playlist!");
            playList.add(checkedSong);
            return true;
        }

        System.out.println("Song with title " + title + " could not be added to playlist!\n");
        return false;
    }

    private class SongList {
        ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song) {
            if (this.songs.contains(song)) {
                return false;
            }

            this.songs.add(song);
            return true;
        }

        private Song findSong(String title) {
            for (Song checkedSong: this.songs) {
                if (checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if ((index >= 0) && (index<this.songs.size())) {
                return this.songs.get(index);
            }
            return null;
        }
    }
}
