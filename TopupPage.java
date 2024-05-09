 

/**
 * Write a description of class TopupPage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TopupPage {
    private MoneyJar moneyJar;

    public TopupPage(MoneyJar moneyJar) {
        this.moneyJar = moneyJar;
    }

    public void topupMoney(BankCard card, double amount) {
        if (card.isVerify() && amount > 0) {
            double currentSavings = moneyJar.getSavings();
            moneyJar.setSavings(currentSavings + amount);
            System.out.println("Payment Successful");
            System.out.println("Current Jar Balance: " + moneyJar.getSavings());
        } else {
            System.out.println("Payment declined");
        }
    }
}
