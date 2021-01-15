package com.company;

public class Main {

    public static void main(String[] args) {
    	int highScore = calculateStore(true,800, 5, 100 );
		System.out.println("Your final Score is " + highScore);

		highScore = calculateStore(true, 10000, 8, 200);
		System.out.println("Your final Score is " + highScore);
    }

    public static int calculateStore(
    		boolean gameOver,
			int score,
			int levelCompleted,
			int bonus) {
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			return finalScore;
		}
		return -1;
	}
}
