package com.company;

public class Main {

    public static void main(String[] args) {
    	int highScore = calculateStore(true,800, 5, 100 );
		System.out.println("Your final Score is " + highScore);

		highScore = calculateStore(true, 10000, 8, 200);
		System.out.println("Your final Score is " + highScore);

		int highScorePosition = getCalculateHighScorePosition(1000);
		displayHighScorePosition("Marta", highScorePosition);

		highScorePosition = getCalculateHighScorePosition(900);
		displayHighScorePosition("Paula", highScorePosition);

		highScorePosition = getCalculateHighScorePosition(400);
		displayHighScorePosition("Helena", highScorePosition);

		highScorePosition = getCalculateHighScorePosition(50);
		displayHighScorePosition("Pedro", highScorePosition);
    }

	private static int getCalculateHighScorePosition(int playerScore) {
		int position = 4;
		if (playerScore >= 1000) {
			position = 1;
		} else if (playerScore >= 500) {
			position = 2;
		} else if (playerScore >= 100) {
			position = 3;
		}
		return position;
	}

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
		System.out.println(playerName + " managed to get into position " + highScorePosition +
				" on the high score table");
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
