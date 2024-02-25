package logic;

public class Out {
    
    public static void food() {
        Double costOfFood = 12.4;
        if (costOfFood > Numbers.getWallet()) {
            
        }
        Resources.changeFood(costOfFood);
        Numbers.spend(costOfFood);
    }

    public static void utilities() {
        Double utilities = 8.5;
        Resources.changeUtilities(utilities);
        Numbers.spend(utilities);
    }

    public static void fun() {
        Double fun = 23.1;
        Numbers.spend(fun);
    }

    public static void wallet() {
        
        // clean the console
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        
        System.out.printf("You have %.2f money in your wallet", Numbers.getWallet());
        try {
            Thread.sleep(1250);
        } catch (Exception e) {
        }
    }

    public static void goHome() {
        // 
    }

}
