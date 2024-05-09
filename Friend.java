 

public class Friend {
    private String firstName;
    private String lastName;
    private double balance;


    // Constructor
    public Friend(String firstName,String lastName) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = 0;
    }

    // Getters
    public String getFirstName() 
    {
        return firstName;
    }
    public String getLastName()
    {   
        return lastName;
    }
    public double getBalance() 
    {
        return balance;
    }
    public String getFullName() 
    {
        return firstName + " " + lastName;
    }
    // Setters
    public void setFirstName(String newFirstName) 
    {
        this.firstName = newFirstName;
    }
    public void setBalance(double balance) 
    {
        this.balance = balance;
    }
    public void friendDetails()
    {
        System.out.println("firstname: " + firstName );
        System.out.println("lastname: " + lastName );
        System.out.println("Total Balance: " + balance);
    }
}
