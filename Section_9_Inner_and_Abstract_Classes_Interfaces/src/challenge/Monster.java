package challenge;

import java.util.ArrayList;
import java.util.List;

public class Monster implements Saveable{
    String monsterName;
    ArrayList<Integer> score;
    boolean isInjured;

    public Monster(String playerName, int score, boolean isInjured) {
        this.monsterName = playerName;
        this.score = new ArrayList<Integer>();
        if (isInjured) {
            System.out.println("Unable to add score, monster is injured!");
            return;
        }
        addScore(score);
    }

    @Override
    public List retrieveScore() {
        System.out.println(this.score);
        return this.score;
    }

    @Override
    public void addScore(int characterNumber) {
        if (isInjured) {
            System.out.println("Unable to add score, monster is injured!");
            return;
        }
        this.score.add(characterNumber);
    }

    @Override
    public String toString() {
        return "Monster{" +
                "monsterName='" + monsterName + '\'' +
                ",monster score=" + score +
                '}';
    }
}
