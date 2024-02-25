package logic;

public class Numbers {
    
    private static Double wallet = 0.0;
    private static Double hourlyRate = 1.2;

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
