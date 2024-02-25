package logic;

public class Numbers {
    
    private static Double wallet = 0.0;
    private static Double rate = 1.2;

    public static void getPaidRate() {
        wallet = wallet + rate;
    }

    public static Double getWallet() {
        return wallet;
    }

    public static Double getRate() {
        return rate;
    }

}
