package view;

import java.util.Scanner;

import logic.Job;

// Choose options in each view
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
            // go out to spend money
            View.out();
        }
        if (chooser == 4) {
            // check the resources
            View.resources();
        }
    }

    public static void atWork() {
        Integer chooser = userIn.nextInt();
        if (chooser == 1) {
            // command to stop working and show home view
            Job.stopJob();   // stopping Job thread
            View.stopWork(); // stop showing that you're in work
            View.home();     // returns to home
        }
        if (chooser == 2) {
            // command to check the hourly rate at work
            View.rate();
        }
    }

    public static void atOut() {
        Integer chooser = userIn.nextInt();
        if (chooser == 1) {
            // return home
            View.stopOut();
        }
        if (chooser == 2) {
            // check the wallet
            View.wallet();
        }
        if (chooser == 3) {
            // buy food
        }
        if (chooser == 4) {
            // pay bills
        }
        if (chooser == 5) {
            // have fun
        }
    }

}
