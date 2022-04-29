package com.bridgelabz.snakeandladder;

public class SnakeAndLader {
    static int playerPosition = 0;

    public static void main(String[] args) {

        int dieValue = (int) (Math.random() * 10 % 6) + 1;
        System.out.println("The dice value is :" +dieValue);
        }

    }
