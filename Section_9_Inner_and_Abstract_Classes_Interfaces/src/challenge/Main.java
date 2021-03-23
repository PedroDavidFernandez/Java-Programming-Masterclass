package challenge;

public class Main {
    public static void main(String[] args) {
        Saveable myPlayer = new Player("Pedro", 200);
        myPlayer.retrieveScore();

        Saveable myPlayer2 = new Player("David", 70);
        myPlayer2.retrieveScore();

        Saveable monster = new Monster("Alien", 980, true);
        monster.retrieveScore();
        monster.addScore(1200);
        monster.retrieveScore();
    }
}
