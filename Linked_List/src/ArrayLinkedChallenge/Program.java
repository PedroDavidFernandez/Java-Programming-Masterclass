package ArrayLinkedChallenge;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();
        Album achtungBaby = new Album("Achtung Baby");
        achtungBaby.addSong(new Song("zooropa", 3.01));
        achtungBaby.addSong(new Song("One", 5.55));
        achtungBaby.addSong(new Song("acrobat", 4.07));

        Album joshuaTree = new Album("Joshua Tree");
        joshuaTree.addSong(new Song("Exit", 7.15));
        joshuaTree.addSong(new Song("I will follow", 3.59));
        joshuaTree.addSong(new Song("Bullet the Blue Sky", 9.02));
        joshuaTree.addSong(new Song("Where the Streets have no Name", 6.43));

        Album pop = new Album("Pop");
        pop.addSong(new Song("Discothèque", 4.53));
        pop.addSong(new Song("Gone", 4.65));
        pop.addSong(new Song("Please", 8.46));

        albums.add(achtungBaby);
        albums.add(joshuaTree);
        albums.add(pop);

        LinkedList<Song> playlist = new LinkedList<>();
        playlist.add(pop.getSongByTitle("Please"));
        playlist.add(achtungBaby.getSongByTitle("One"));
        playlist.add(joshuaTree.getSongByTitle("I will follow"));
        playlist.add(joshuaTree.getSongByTitle("Exit"));
        playlist.add(achtungBaby.getSongByTitle("zooropa"));
        playlist.add(pop.getSongByTitle("Discothèque"));

        printList(playlist);
        //playlist(playlist);
    }

    private static void printList(LinkedList<Song> playlist) {
        ListIterator<Song> i = playlist.listIterator();

        while (i.hasNext()) {
            Song checkedSong = i.next();
            System.out.println("Title: " + checkedSong.getTitle());
            System.out.println("Duration: " + checkedSong.getDuration());
        }
    }

    private static void playlist(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean skip = false;
        boolean skipForward = true;
        ListIterator<Song> listIterator = playlist.listIterator();

        if (playlist.isEmpty()) {
            System.out.println("There are no songs in this playlist!");
            return;
        } else {
            System.out.println("Now listening... " + listIterator.next().getTitle());
        }
    }
}
