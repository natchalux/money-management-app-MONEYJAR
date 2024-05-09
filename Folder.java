 

/**
 * Write a description of class Folder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Folder
{
    // instance variables - replace the example below with your own
    private double balance;
    private String name;
    
    /**
     * Constructor for objects of class Folder
     */
    public Folder(double folderBalance, String folderName)
    {
        // initialise instance variables
        this.balance = folderBalance;
        this.name = folderName;
    }
    
    public double getFolderBalance()
    {
        return balance;
    }
    public String getFolderName()
    {
        return name;
    }
    public void setFolderBalance(double newBalance)
    {
        balance = newBalance;
    }
    public void setFolderName(String newFolderName)
    {
        name = newFolderName;
    }
    
}
