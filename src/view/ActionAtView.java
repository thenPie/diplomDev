package view;

import java.util.Scanner;

import logic.Job;
import logic.Out;

public class ActionAtView {

    static Scanner userIn = new Scanner(System.in);
    
    public static void atHome() {
        Integer chooser = userIn.nextInt();
        if (chooser == 1) {
            // command to show the work view
            View.work();
        }
        if (chooser == 2) {
            // command to check the money in wallet
            View.wallet();
        }
        if (chooser == 3) {
            // command to go out spend money
            View.spendArea();
        }
        if (chooser == 4) {
            // check resources
            View.resources();
        }
    }

    public static void atWork() {
        Integer chooser = userIn.nextInt();
        if (chooser == 1) {
            // command to stop working and show home view
            Job.stopJob();
            View.stopWork();
            View.home();
        }
        if (chooser == 2) {
            // command to check the hourly rate at work
            View.hourlyRate();
        }
    }

    public static void atOut() {
        Integer chooser = userIn.nextInt();
        if (chooser == 1) {
            // buying food
            Out.food();
        }
        if (chooser == 2) {
            // pay utilities
            Out.utilities();
        }
        if (chooser == 3) {
            // have fun
            Out.fun();
        }
        if (chooser == 4) {
            // check the wallet
            Out.wallet();
        }
        if (chooser == 5) {
            // go home
            View.goHome();
            View.home();
        }
    }

}
