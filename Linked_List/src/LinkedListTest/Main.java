package LinkedListTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Achtung Baby", "U2");
        album.addSong("zooropa", 3.01);
        album.addSong("One", 5.55);
        album.addSong("acrobat", 4.07);
        album.addSong("End of the World", 6.06);
        albums.add(album);

        album = new Album("Joshua Tree", "U2");
        album.addSong("Exit", 7.15);
        album.addSong("I will follow", 3.5);
        album.addSong("Bullet the Blue Sky", 9.02);
        album.addSong("Where the Streets have no Name", 6.43);
        albums.add(album);

        album = new Album("Pop", "U2");
        album.addSong("Discothèque", 4.53);
        album.addSong("Gone", 4.65);
        album.addSong("Please", 8.46);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("One", playList);
        albums.get(0).addToPlayList("acrobat", playList);
        albums.get(0).addToPlayList("zooropa", playList);
        albums.get(0).addToPlayList("End of the World", playList);
        albums.get(0).addToPlayList("The Fly", playList); // does not exist
        albums.get(1).addToPlayList("Exit", playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(2).addToPlayList("Gone", playList);
        albums.get(2).addToPlayList(43, playList); // it does no exist
        albums.get(2).addToPlayList(1, playList);

        play(playList);
    }

    private static void play(LinkedList<Song> playList) {
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing... " + listIterator.next().toString());
        }
    }
}
