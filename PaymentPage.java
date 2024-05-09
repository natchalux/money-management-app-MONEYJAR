 

/**
 * Write a description of class PaymentPage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PaymentPage {
    private PaymentProcessor paymentProcessor;

    public PaymentPage() {
        paymentProcessor = new PaymentProcessor();
    }

    public void processPayment(double amount) {
        paymentProcessor.holdToReader();
        boolean paymentSuccess = paymentProcessor.processPayment(amount);
        if (paymentSuccess) {
            showPaymentSuccessMessage();
        } else {
            showPaymentFailureMessage();
        }
    }

    private void showPaymentSuccessMessage() {
        System.out.println("Payment successful!");
    }

    private void showPaymentFailureMessage() {
        System.out.println("Payment failed. Please try again.");
    }
}
