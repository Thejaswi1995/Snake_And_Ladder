package com.bridgelabz.snakeandladder;

public class SnakeAndLader {
    static int playerPosition = 0;
    static final int NO_PLAY = 1;
    static final int LADDER = 2;
    static final int SNAKE = 3;

    static final int WINNING_POSTION = 100;

    private static int getOption() {
        int option = (int) (Math.random() * 10 % 3) + 1;
        return option;
    }

    private static int dieRoll() {
        int dieValue = (int) (Math.random() * 10 % 6) + 1;
        return dieValue;
    }

    public static void main(String[] args) {

        while (playerPosition < WINNING_POSTION) {

            int dieValue = dieRoll();
            System.out.println("The dice value is :" + dieValue);

            int option = getOption();
            System.out.println("Option :" + option);

            switch (option) {
                case NO_PLAY:
                    break;
                case LADDER:
                    playerPosition = playerPosition + dieValue;
                    break;
                case SNAKE:
                    playerPosition = playerPosition - dieValue;
                    break;
                default:
            }
        }

    }
}
