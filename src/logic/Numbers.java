package logic;

public class Numbers {
    
    private static Double wallet = 0.0;
    private static Double rate = 1.2;
    private static Double food = 20.3;
    private static Double bills = 7.7;
    private static Double foodUsage = 6.1;
    private static Double billsUsage = 2.6;

    public static void useFood() {
        food = food - foodUsage;
    }
    public static void useBills() {
        bills = bills - billsUsage;
    }

    public static Double getFood() {
        return food;
    }
    public static Double getBills() {
        return bills;
    }
    public static Double getFoodUsage() {
        return foodUsage;
    }
    public static Double getBillsUsage() {
        return billsUsage;
    }
    
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
