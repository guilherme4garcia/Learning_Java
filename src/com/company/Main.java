package com.company;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        byte age = 30;
        long viewsCount = 3_213_241_020L;
        float price = 10.99F;
        char letter = 'B';
        boolean isEligible = false;
        String hello = "Hello World" + "!!";
        Date now = new Date();

        String path = "c:\\Windows\\...";
        /*   escape sequence:
            \n -> new line
            \t -> tab
            \\ -> \
            \" -> "
         */

        byte x = 1;
        byte y = x;
        x = 2;
        // y stills equals to 1

        Point point1 = new Point(1, 2);
        Point point2 = point1;
        point1.x = 34;
        // reference address to the memory


        //arrays
        int[] numbers = new int[5];
        int[] knownArr = {2, 3, 4, 5 };
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(knownArr);
        System.out.println(knownArr.length);

        //matrix
        int[][] matrix = new int[2][3];
        matrix [0][0] = 1;
        System.out.println(Arrays.deepToString(matrix));

        //string methods
        System.out.println(hello.endsWith("!!"));
        System.out.println(hello.length());
        System.out.println(hello.indexOf("Hello"));
        System.out.println(hello.replace("!", "*"));
        System.out.println(hello); // strings are immutable
        System.out.println(hello.toLowerCase());
        System.out.println("Hello \"ignore quote\" ");
        System.out.println(path);
    }
}
