package logic;

public class Job implements Runnable {

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
            try {
                Thread.sleep(250);
            } catch (Exception e) {
            }
        }
    }
    

    
}
