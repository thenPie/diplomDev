package logic;

public class Resources implements Runnable {
    private static Double food = 20.0;
    private static Double utilities = 60.0;
    private static Double foodUsage = 10.0;
    private static Double utilitiesUsage = 3.4;

    public static void changeFood(Double increase) {
        food = food + increase;
    }

    public static void changeUtilities(Double increase) {
        utilities = utilities + increase;
    }

    public static Double getFood() {
        return food;
    }

    public static Double getUtilities() {
        return utilities;
    }

    // resources usage
    static boolean spending = true;
    public static void noSpending() {
        spending = false;
    }
    public static boolean getSpending() {
        return spending;
    }

    @Override
    public void run() {
        while (spending) {

            food = food - foodUsage;
            utilities = utilities - utilitiesUsage;

            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }

            if (foodUsage > food || utilitiesUsage > utilities) {
                
                // clean the console
                // System.out.print("\033[H\033[2J");  
                // System.out.flush();

                noSpending();
                // message that you're dead
                System.out.println("Resources gone");
            }

        }
    }
}
