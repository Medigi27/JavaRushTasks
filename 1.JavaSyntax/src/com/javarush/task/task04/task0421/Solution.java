package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in1 = new Scanner(System.in);
        String name1 = in1.nextLine();
        char[] arr1 = name1.toCharArray();
        int a = arr1.length;
        in1.close();
        Scanner in2 = new Scanner(System.in);
        String name2 = in2.nextLine();
        char[] arr2 = name1.toCharArray();
        int b = arr2.length;
        in2.close();
        if (name1 == name2) {
            System.out.println("Имена идентичны");
        }
        if (a == b) {
            System.out.println("Длины имен равны");
        }
        else {

        }
    }
}
