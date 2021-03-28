package com.playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }

        return false;
    }

    public Song findSong(String title) {
        for (Song checkedSong: this.songs) {
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    public Song findSong(int trackNumber) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index<this.songs.size())) {
            return this.songs.get(index);
        }
        return null;
    }

    public boolean addToPlayList (int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index<this.songs.size())) {
            System.out.println("Song with track number " + trackNumber + " has been added to playlist!");
            Song song = this.songs.get(trackNumber);
            playList.add(song);
            return true;
        }

        System.out.println("Song with track number " + trackNumber + " could not be added to playlist!\n");
        return false;
    }

    public boolean addToPlayList (String title, LinkedList<Song> playList) {
        Song checkedSong = findSong(title);
        if (checkedSong != null) {
            System.out.println("Song with title " + title + " has been added to playlist!");
            playList.add(checkedSong);
            return true;
        }

        System.out.println("Song with title " + title + " could not be added to playlist!\n");
        return false;
    }
}
