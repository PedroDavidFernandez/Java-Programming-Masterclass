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
        playlist.add(achtungBaby.getSongByTitle("acrobat"));

        printList(playlist);
        printOptions();
        playlistProgram(playlist);
    }

    private static void printOptions() {
        System.out.println("\nPlaylist options are: " +
                "\n0. Quit. " +
                "\n1. Skip forward to next song. " +
                "\n2. Skip back to previous song. " +
                "\n3. Replay current song. " +
                "\n4. Print set list of songs.");
    }

    private static void playlistProgram(LinkedList<Song> songs) {
        Scanner scanner = new Scanner(System.in);
        boolean skip = false;
        boolean skipForward = true;
        ListIterator<Song> listIterator = songs.listIterator();

        if (songs.isEmpty()) {
            System.out.println("\nThere are no songs in this playlist!");
            return;
        } else {
            System.out.println("\nNow listening..." + listIterator.next().getTitle() +
                    "\nDuration: " + listIterator.next().getDuration());
            listIterator.previous();
        }

        while (!skip) {
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0:
                    skip = true;
                    break;
                case 1:
                    if (!skipForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        skipForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("\nOption 1: Now listening " + listIterator.next().getTitle());
                    } else {
                        System.out.println("Reached the end of the list");
                        skipForward = false;
                    }
                    break;
                case 2:
                    if (skipForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        skipForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Case 2: Now visiting " + listIterator.previous().getTitle());
                    } else {
                        System.out.println("We are at the start of the list");
                        skipForward = true;
                    }
                    break;

                case 3:
                    if (listIterator.hasPrevious()) {
                        listIterator.previous();
                        System.out.println("Option 3: Replay... " + listIterator.next().getTitle());
                    }
                    break;
                case 4:
                    printList(songs);
                    break;
            }
        }
    }

    private static void printList(LinkedList<Song> playlist) {
        Iterator<Song> i = playlist.listIterator();

        while (i.hasNext()) {
            Song checkedSong = i.next();
            System.out.println("Title: " + checkedSong.getTitle());
            System.out.println("Duration: " + checkedSong.getDuration());
        }
    }
}
