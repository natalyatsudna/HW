package com.company;

import java.util.Arrays;

public class about {

        public static void main( String[] args ) {

        Person p1 = new Person("Anna", 1999);
        Person p2 = new Person("Olya", 2001);
        Person p3 = new Person("Andriy", 2000);
        Person p4 = new Person("Ksenia", 1995);
        Person p5 = new Person("Vira", 1994);

        p1.outputInfo();
        p1.inputInfo();
        p1.changeName("Ira");
        p2.inputInfo();
        p2.outputInfo();
        p3.changeName("Luke");
        p3.outputInfo();
        p4.changeName("Nadya");
        p4.outputInfo();
        p5.outputInfo();

            System.out.println(p1.getName() + " age is " + p1.calcAge(p1.getBirthYear()));
            System.out.println(p2.getName() + " age is " + p2.calcAge(p2.getBirthYear()));
            System.out.println(p3.getName() + " age is " + p3.calcAge(p3.getBirthYear()));
            System.out.println(p4.getName() + " age is " + p4.calcAge(p4.getBirthYear()));
            System.out.println(p5.getName() + " age is " + p5.calcAge(p5.getBirthYear()));
        }
}
