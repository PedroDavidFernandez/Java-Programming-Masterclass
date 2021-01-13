package com.company;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 800;
	    int levelCompleted = 5;
	    int bonus = 10;

	    if (score < 5000 && score > 1000) {
			System.out.println("Your score was less than 5000 but greater than 1000");
		} else if (score < 1000) {
			System.out.println("Your score is less than 1000");
		} else {
			System.out.println("Got here");
		}

	    if (gameOver) {
	    	int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final Score is " + finalScore);
		}

	    // int totalFinalScore = finalScore; This is not allowed, since finalScore was created within the "If" block

		System.out.println("this was executed");
    }
}
