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

    // wait for information timestop
    public static void holdTime() {
        try {
            Thread.sleep(1250);
        } catch (Exception e) {
        }
    }
    
    // View of home actions

    public static void home() {
        clearScreen();
        System.out.println("You're at your home. What are you doing?\n" +
                           "1. Go do work to get money\n" +
                           "2. Check your wallet\n" +
                           "3. Go out to spend money\n" +
                           "4. Check the resources");
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

    public static void rate() {
        clearScreen();
        System.out.println("You have " + Numbers.getRate() + " money in your wallet");
        holdTime();
        clearScreen();
        // and then back to work view
    }

    // go out to spend money options
    static boolean outOn;
    static void stopOut() {
        outOn = false;
    }
    public static void out() {
        clearScreen();
        
        outOn = true;
        while (outOn) {
            System.out.println("You're out, wallet in the pocket. What you do?\n" +
                               "1. Return home\n" +
                               "2. Check the wallet\n" +
                               "3. Buy food\n" +
                               "4. Pay bills\n" +
                               "5. Have fun\n");
            ActionAtView.atOut();
        }
    }

    public static void resources() {
        clearScreen();
        System.out.printf("You have %.2f food and each %d milliseconds you spend %.2f\n" +
                          "You have %.2f bills and each %d milliseconds you spend %.2f",
                          Numbers.getFood(), Resources.getMillisec(), Numbers.getFoodUsage(),
                          Numbers.getBills(), Resources.getMillisec(), Numbers.getBillsUsage());
        holdTime();
    }

}
