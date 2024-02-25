package logic;

public class Job implements Runnable {

    // This is job, hourly rate increase to wallet

    static boolean works;
    public static void stopJob() {
        works = false;
    }

    @Override
    public void run() {
        
        works = true;

        while (works) {
            Numbers.getPaidHourly();
            try {
                Thread.sleep(250);
            } catch (Exception e) {
            }
        }
    }
    

    
}
