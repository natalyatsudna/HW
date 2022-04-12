package com.company;


public class all {

    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle("white");
        birds[1] = new Swallow("black");
        birds[2] = new Penguin("black");
        birds[3] = new Chicken("grey");

        for (Bird bird : birds) {

            if (bird instanceof Eagle) {
                System.out.println("It's an eagle");
                System.out.println("It's have " + bird.getFeathers() + " feathers ");
                bird.fly();
                System.out.println();

            } else if (bird instanceof Swallow) {

                System.out.println("It's a swallow");
                System.out.println("It's have " + bird.getFeathers() + " feathers ");
                bird.fly();
                System.out.println();

            } else if (bird instanceof Penguin) {

                System.out.println("It's a penguin");
                System.out.println("It's have " + bird.getFeathers() + " feathers ");
                bird.fly();
                System.out.println();

            } else {

                System.out.println("It's a chicken");
                System.out.println("It's have " + bird.getFeathers() + " feathers ");
                bird.fly();
                System.out.println();


            }
        }
    }
}


