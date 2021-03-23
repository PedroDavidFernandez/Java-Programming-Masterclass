package LinkedListTest;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();
    public static void main(String[] args) {
       Album album = new Album("Achtung Baby", "U2");
       album.addSong("Zoo Station", 3.01);
       album.addSong("The Fly", 7.25);
       album.addSong("Even better than the real thing", 4.12);
       album.addSong("Until the End of the World", 4.57);
       album.addSong("Ultraviolet", 6.07);
       album.addSong("Acrobat", 4.47);
       albums.add(album);

       album = new Album("Pop", "U2");
       album.addSong("Gone", 7.36);
       album.addSong("Last nigh on Earth", 4.45);
       album.addSong("Please", 7.59);
       albums.add(album);

       album = new Album("Zooropa","U2" );
       album.addSong("Zooropa", 6.31);
       album.addSong("Lemon", 6.58);
       album.addSong("Stay", 5.20);
       albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
       albums.get(0).addToPlayList("Zoo Station", playList);
       albums.get(0).addToPlayList("The Fly", playList);
       albums.get(0).addToPlayList("Acrobat", playList);
       albums.get(0).addToPlayList("So Cruel", playList);
       albums.get(1).addToPlayList("Please", playList);
       albums.get(1).addToPlayList("Last nigh on Earth", playList);
       albums.get(1).addToPlayList("Gone", playList);
       albums.get(2).addToPlayList("Stay", playList);
       albums.get(2).addToPlayList("Lemon", playList);
       albums.get(2).addToPlayList(43, playList);
       
       printOptions();
       play(playList);
    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();

        if (playList.isEmpty()) {
            System.out.println("There are no songs in the playlist!");
            return;
        } else {
            System.out.println("Now playing... " + listIterator.next().toString());
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
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing..." + listIterator.next().toString());
                    } else {
                        System.out.println("You are currently at the end of the playlist!");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing..." + listIterator.previous().toString());
                    } else {
                        System.out.println("You are currently at the beginning of the playlist!");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now playing..." + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("You are currently at the beginning of the playlist!");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing..." + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("You are currently at the end of the playlist!");
                        }
                    }
                    break;
                case 4:
                    printSongs(playList);
                    break;
                case 5:
                    printOptions();
                    break;
                case 6:
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printSongs(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


    private static void printOptions() {
        System.out.println("************************");
        System.out.println("Available options are:\n" +
                "0. Quit current playlist\n" +
                "1. Play the next song\n" +
                "2. Play previous song\n" +
                "3. Re-play current song\n" +
                "4. Print available songs\n" +
                "5. Print available options\n" +
                "6. Remove song\n"
        );
    }
}
