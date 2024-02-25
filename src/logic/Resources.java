package logic;

public class Resources implements Runnable {

    // wait for recources processing
    private static int millisec = 3000;
    public static void holdTime() {
        try {
            Thread.sleep(millisec);
        } catch (Exception e) {
        }
    }
    public static int getMillisec() {
        return millisec;
    }
    
    static boolean works;
    public static void stopResources() {
        works = false;
    }
    @Override
    public void run() {
        works = true;
        while (works) {
            if (Numbers.getFoodUsage() > Numbers.getFood() || Numbers.getBillsUsage() > Numbers.getBills()) {
                // stop the whole thread and say you're done for for good
                stopResources();
            } else {
                // use up the resources
                Numbers.useFood();
                Numbers.useBills();
                holdTime();
            }            
        }

    }

}
