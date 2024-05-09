 

/**
 * Write a description of class BankCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankCard
{
    // instance variables - replace the example below with your own
    private String cardScheme;
    private String cardNumber;
    private int cardCVV;
    private String cardExpiration;
    private String cardHolderName;    
    /**
     * Constructor for objects of class BankCard
     * Take no parameter for quick demo
     */
    public BankCard()
    {
        // initialise instance variables
        this.cardScheme = cardScheme;   
        this.cardNumber = cardNumber;
        this.cardCVV = cardCVV;
        this.cardExpiration = cardExpiration;
        this.cardHolderName = cardHolderName;
    }

    /**
     * Check whether the card information is valid
     * For the purpose of demo we will assume all the card information is valid
     */
    public boolean isVerify()
    {
        return true;
    }
}
