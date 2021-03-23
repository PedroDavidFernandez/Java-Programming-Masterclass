package challenge;

import java.util.ArrayList;
import java.util.List;

public class Player implements Saveable {
    String playerName;
    ArrayList<Integer> score;

    public Player(String playerName, int score) {
        this.playerName = playerName;
        this.score = new ArrayList<Integer>();
        addScore(score);
    }

    @Override
    public List retrieveScore() {
        System.out.println(this.score);
        return this.score;
    }

    @Override
    public void addScore(int characterNumber) {
        this.score.add(characterNumber);
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ",player score=" + score +
                '}';
    }
}
