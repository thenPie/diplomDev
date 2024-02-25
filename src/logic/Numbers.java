package logic;

public class Numbers {
    
    private static Double wallet = 0.0;
    private static Double hourlyRate = 150.43;

    public static void spend(Double price) {
        if (price > wallet) {

            // clean the console screen
            System.out.print("\033[H\033[2J");  
            System.out.flush();

            System.out.println("You don't have enough money");
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }
        } else {
            wallet = wallet - price;
        }
    }

    public static void getPaidHourly() {
        wallet = wallet + hourlyRate;
    }

    public static Double getWallet() {
        return wallet;
    }

    public static Double getHourlyRate() {
        return hourlyRate;
    }

}
