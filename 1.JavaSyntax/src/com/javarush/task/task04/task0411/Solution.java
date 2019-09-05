package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        if (0 < month && month < 3) {
            //напишите тут ваш код
            System.out.println("зима");
        }
        if (11 < month && month < 13) {
            //напишите тут ваш код
            System.out.println("зима");
        }
        if (2 < month && month < 6) {
            //напишите тут ваш код
            System.out.println("весна");
        }
        if (5 < month && month < 9) {
            //напишите тут ваш код
            System.out.println("лето");
        }
        if (8 < month && month < 12) {
            //напишите тут ваш код
            System.out.println("осень");
        }
    }
    }