package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        int c = a - 10;
        int d = b - 10;
        if (abs(c) < abs(d)) {
            System.out.println(a);
        }
        if (abs(c) > abs(d)) {
            System.out.println(b);
        }
        if (abs(c) == abs(d)) {
            System.out.println(a);
        }

        // напишите тут ваш код

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}