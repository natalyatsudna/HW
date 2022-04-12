package com.company;
import java.util.*;

public class task1 {

    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("a:");
        int a = numbers.nextInt();
        System.out.println("b:");
        int b = numbers.nextInt();
        System.out.println("c:");
        int c = numbers.nextInt();
        System.out.println("x:");
        int x = numbers.nextInt();
        System.out.println("y:");
        int y = numbers.nextInt();

        if ((a <= 0) || (b <= 0) || (c <= 0) || (x <= 0) || (y <= 0)) {
            System.out.println("The task is not correct");
        } else if (((a < x) && (b < y)) || ((a < y) && (b < x)) || ((a < x) && (c < y)) || ((a < y) && (c < x)) ||
                ((b < x) && (c < y)) || ((b < y) && (c < x))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}

