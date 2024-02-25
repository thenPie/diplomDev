package view;

import logic.Job;
import logic.Numbers;

public class View {

    // Function to clear console screen
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    // wait for information timestop
    public static void holdTime() {
        try {
            Thread.sleep(1250);
        } catch (Exception e) {
        }
    }
    
    // View of home actions
    public void homeStarter() {
        clearScreen();
        System.out.println("You're at your home. What are you doing? THIS IS STARTER\n" +
                           "1. Go do work to get money\n" +
                           "2. Check your wallet");
    }

    public static void home() {
        clearScreen();
        System.out.println("You're at your home. What are you doing?\n" +
                           "1. Go do work to get money\n" +
                           "2. Check your wallet");
        ActionAtView.atHome();
    }

    public static void wallet() {
        clearScreen();
        System.out.printf("You have %.2f money in your wallet", Numbers.getWallet());
        holdTime();
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
        System.out.println("You have " + Numbers.getRate() + " money in your wallet");
        holdTime();
        clearScreen();
        // and then back to work view
    }

}
