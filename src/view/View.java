package view;

import logic.Job;
import logic.Numbers;
import logic.Resources;

public class View {

    // Function to clear console screen
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
    
    // View of home actions

    public static void home() {
        clearScreen();
        System.out.println("You're at your home. What are you doing?\n" +
                           "1. Go do work to get money\n" +
                           "2. Check your wallet\n" +
                           "3. Go out spend money\n" +
                           "4. Check resources");
        ActionAtView.atHome();
    }

    public static void wallet() {
        clearScreen();
        // System.out.printf("Value: %.2f", value);
        // System.out.println("You have " + Numbers.getWallet() + " money in your wallet");
        System.out.printf("You have %.2f money in your wallet", Numbers.getWallet());
        try {
            Thread.sleep(1250);
        } catch (Exception e) {
        }
        clearScreen();
        // and then back to home view
    }

    // view of work actions

    static boolean workOn;
    static void stopWork() {
        workOn = false;
    }
    public static void work() {
        workOn = true;
        if (workOn) {
            Job job = new Job();
            Thread doesWork = new Thread(job);
            doesWork.start();
        }

        while (workOn) {
            clearScreen();
            System.out.println("You're working.\n" +
                               "1. Stop working\n" +
                               "2. What's my rate?");
            ActionAtView.atWork();
        }

    }

    public static void hourlyRate() {
        clearScreen();
        System.out.println("You have " + Numbers.getHourlyRate() + " money as your rate");
        try {
            Thread.sleep(1250);
        } catch (Exception e) {
        }
        clearScreen();
        // and then back to work view
    }

    // Go spending money options

    static boolean outOn;
    static void goHome() {
        outOn = false;
    }
    public static void spendArea() {
        outOn = true;
        while (outOn) {
            clearScreen();
            System.out.println("You're out, wallet in pocket. What you do?\n" +
                               "1. Buy some food\n" +
                               "2. Pay utilities\n" +
                               "3. Have fun! Go to restaraunt or buy nice things\n" +
                               "4. Check the wallet\n" +
                               "5. Go home");
            ActionAtView.atOut();
        }
    }

    // resources
    public static void resources() {
        clearScreen();
        System.out.printf("Food is %.2f\n" +
                          "Utilities is %.2f", Resources.getFood(), Resources.getUtilities());
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
    }

}
