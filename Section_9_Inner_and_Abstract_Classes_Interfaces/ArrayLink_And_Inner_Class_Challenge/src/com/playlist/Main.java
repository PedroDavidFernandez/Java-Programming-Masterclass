package com.playlist;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();
    public static void main(String[] args) {
        Album album = new Album("Out of Time", "R.E.M.");
        album.addSong("Radio Song", 4.12);
        album.addSong("Losing my Religion", 4.28);
        album.addSong("Low", 4.55);
        album.addSong("Shiny Happy People", 3.44);
        albums.add(album);

        album = new Album("Dire Straits", "Brothers in Arms");
        album.addSong("So Far Away", 5.12);
        album.addSong("Money For Nothing", 8.26);
        album.addSong("Brothers in Arms", 6.59);
        albums.add(album);

        album = new Album("Queen", "A Night at the Opera");
        album.addSong("Bohemian Rhapsody", 5.55);
        album.addSong("I'm in Love with My Car", 3.05);
        album.addSong("God Save the Queen", 1.11);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlayList("Losing my Religion", playList);
        albums.get(0).addToPlayList(40, playList);
        albums.get(1).addToPlayList("Money For Nothing", playList);
        albums.get(1).addToPlayList("So Far Away", playList);
        albums.get(1).addToPlayList("Brothers in Armss", playList);
        albums.get(2).addToPlayList("God Save the Queen", playList);
        albums.get(2).addToPlayList("Bohemian Rhapsody", playList);
        albums.get(0).addToPlayList(2, playList);

        printOptions();
        play(playList);
    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean forward = true;
        boolean quit = false;
        ListIterator<Song> listIterator = playList.listIterator();

        if (playList.isEmpty()) {
            System.out.println("There are no songs in playlist!\n");
            return;
        } else {
            System.out.println("Now playing... " + listIterator.next().getTitle() + "\n");
        }

        while (!quit) {
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing... " + listIterator.next().getTitle() + "\n");
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing... " + listIterator.next().getTitle() + "\n");
                    } else {
                        System.out.println("You reached end of playlist\n");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now playing... " + listIterator.next().getTitle() + "\n");
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing... " + listIterator.previous().getTitle() + "\n");
                    } else {
                        System.out.println("You reached beginning of playlist\n");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now playing..." + listIterator.previous().getTitle());
                            forward = false;
                        } else {
                            System.out.println("You are currently at the beginning of the playlist!");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing..." + listIterator.next().getTitle());
                            forward = true;
                        } else {
                            System.out.println("You are currently at the end of the playlist!");
                        }
                    }
                    break;
                case 5:
                    if (playList.size() > 0){
                        listIterator.remove();
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().getTitle());
                    } else if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().getTitle());
                    }
                    break;
                case 4:
                    printPlaylist(playList);
                    break;
                case 6:
                    printOptions();
                    break;
            }
        }
    }

    private static void printPlaylist(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        while (iterator.hasNext()) {
            System.out.println("Song name: " + iterator.next().getTitle());

        }
    }

    private static void printOptions() {
        System.out.println("**********************************");
        System.out.println("Available options are:\n" +
                "0. Quit playlist.\n" +
                "1. Skip to next song.\n" +
                "2. Skip to previous song.\n" +
                "3. Replay song.\n" +
                "4. Print playlist\n" +
                "5. Remove song\n" +
                "6. Print available options\n");
    }
}
