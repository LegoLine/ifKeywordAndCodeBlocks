package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score == 4000)
//            //hvis innholdet i if-statementet bare består av én linje, kan vi droppe krøllparentesene"{}"
//            // eller CODE BLOCK som det også kalles da
//            System.out.println("Your score was 5000");
//
//        // Denne linjen kommer til å bli printet ut uavhengeig om conditionen i if-statementet er sann eller ikke
//        System.out.println("This was executed");
//
//        //begge linjene med kode er nå i if-statementet, fordi de er omsluttet av krøllparentesene
//        // det er lurt å bruke code blocks"{}" fordi det gjør det lettere å lese koden
//
//        if (score < 5000 && score > 1000){
//            System.out.println("Your score was less than 5000 but greater than 1000");
//            // System.out.println("This was executed");
//        } else if (score < 1000){
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

        // kan også bare skrive if(gameOver)
        if (gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

//        // CHALLENGE
//        //Min løsning
//        if (score > 5000){
//            System.out.println("Your score is: " + score + " and that is more than 5000.");
//            int levelingUp = levelCompleted + 3;
//            System.out.println("New level is: " + levelingUp);
//            int additionalBonus = bonus * 2;
//            System.out.println("And your bonus just went from " + bonus + " to " + additionalBonus);
//        }

        //Video-løsninger
//        boolean newGameOver = true;
//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//
//        if (newGameOver){
//            int finalScore = newScore + (newLevelCompleted * newBonus);
//            System.out.println("Your final score was " + finalScore);
//        }


        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }
}
