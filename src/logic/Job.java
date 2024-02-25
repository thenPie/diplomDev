package logic;

public class Job implements Runnable {

    private static void holdTime() {
        try {
            Thread.sleep(250);
        } catch (Exception e) {
        }
    }

    // This is job, going rate increase to wallet

    static boolean works;
    public static void stopJob() {
        works = false;
    }

    @Override
    public void run() {
        
        works = true;

        while (works) {
            Numbers.getPaidRate();
            holdTime();
        }
    }
    

    
}
