package com.company;
import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("radius:");
        int radius = numbers.nextInt();
        System.out.println("Perimeter is = " + (2 * radius * Math.PI));
        System.out.println("Area is = " + (Math.PI * radius * radius));
    }
}



