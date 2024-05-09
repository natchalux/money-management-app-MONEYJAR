 

/**
 * Write a description of class PaymentProcessor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PaymentProcessor {
    public void holdToReader() {
        System.out.println("Please hold your card/device to the reader...");
        // Simulate card/device reading process
        try {
            Thread.sleep(2000); // Simulating a 2-second delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean processPayment(double amount) {
        // Simulate payment processing logic
        // For simplicity, let's assume payment is always successful
        return true;
    }
}
