package ru.geekbrains_lesson_3;

import java.util.Random;
import java.util.Scanner;

public class homeWork_3 {

    public static void gameNumber() {
        Scanner scanner = new Scanner(System.in);
        int range = 9;
        int x = (int) (Math.random() * range);
        System.out.println("Угадайте число от 0 до " + range + "." + " У вас есть 3 попытки!");
        for (int N = 0; N < 3; N++) {
            int inputNumber = scanner.nextInt();
            if (inputNumber == x) {
                System.out.println("Вы угадали! Хотите сыграть еще?");
                int i = scanner.nextInt();
                if (i == 1) {
                    gameNumber();
                } else break;
            } else if (inputNumber > x) {
                System.out.println("Загаданное число меньше");

            } else {
                System.out.println("Загаданное число больше");

            }

        }
        System.out.println("Хотите сыграть еще?");
        int i = scanner.nextInt();
        if (i == 1) {
            gameNumber();
        }
    }

    public static void main(String[] args) {
// 1 задание

        Scanner scanner = new Scanner(System.in);
        int range = 9;
        int x = (int) (Math.random() * range);
        System.out.println("Угадайте число от 0 до " + range + "." + " У вас есть 3 попытки!");
        for (int N = 0; N < 3;) {
            int inputNumber = scanner.nextInt();
            if (inputNumber == x) {
                System.out.println("Вы угадали! Хотите сыграть еще?");
                int i = scanner.nextInt();
                if (i == 1) {
                    gameNumber();
                } else break;
            } else if (inputNumber > x) {
                System.out.println("Загаданное число меньше");
                N++;
            } else {
                System.out.println("Загаданное число больше");
                N++;
            }

        }
        System.out.println("Хотите сыграть еще?");
        int i = scanner.nextInt();
        if (i == 1) {
            gameNumber();
        }
    }
}












