package com.company;

public class Main {

    public static void main(String[] args) {
    	calculateStore(true,800, 5, 100 );
    	calculateStore(true, 10000, 8, 200);
    }

    public static int calculateStore(
    		boolean gameOver,
			int score,
			int levelCompleted,
			int bonus) {
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println("Your final Score is " + finalScore);
			return finalScore;
		}
		return -1;
	}
}
