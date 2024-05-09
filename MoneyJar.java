 

import java.util.ArrayList;
import java.util.List;

public class MoneyJar {
    private List<Folder> folders;
    private List<Friend> friends;
    private List<BankCard> cards;
    private double savings;
    private PaymentPage paymentPage;
    private TopupPage topupPage;
    
    public MoneyJar() 
    {
        folders = new ArrayList<>();
        friends = new ArrayList<>();
        cards = new ArrayList<>();
        this.savings = 0;
        paymentPage = new PaymentPage();
        topupPage = new TopupPage(this);
    }
    public double getSavings(){
        return savings;
    }
    public void setSavings(double savings)
    {
        this.savings = savings;        
    }
    public void addFolder(Folder folder) {
        folders.add(folder);
    }
    public void removeFolder(Folder folder) {
        folders.remove(folder);
    }
    public void addFriend(Friend friend) {
        friends.add(friend);
    }
    public void removeFriend(Friend friend) {
        friends.remove(friend);
    }   
    public void addCard(BankCard card){
        if(card.isVerify()){
           cards.add(card); 
           System.out.println("Card Added ending");
        }
    }
    public void removeCard(BankCard card){
        cards.remove(card);
    }
    public List<Folder> getFolders() {
        return folders;
    }

    public List<Friend> getFriends() {
        return friends;
    }
    
    public List<BankCard> getCards(){
        return cards;
    }
    
   public void transferMoneyToFriend(String friendName, double amount) {
        Friend selectedFriend = null;
        for (Friend friend : friends) {
            if (friend.getFullName().equals(friendName)) {
                selectedFriend = friend;
                break;
            }
        }

        if (selectedFriend != null) {
            double currentBalance = selectedFriend.getBalance();
            double currentJarBalance = savings - amount;
            selectedFriend.setBalance(currentBalance + amount);
            
            System.out.println("Transferred " + amount + " to " + friendName);
            System.out.println("Current Jar Balance: " + currentJarBalance);
        } else {
            System.out.println("Friend not found: " + friendName);
        }
    }
    public void transferMoneyToFolder(String folderName, double amount) {
        Folder selectedFolder = null;
        for (Folder folder : folders) {
            if (folder.getFolderName().equals(folderName)) {
                selectedFolder = folder;
                break;
            }
        }

        if (selectedFolder != null) {
            double currentBalance = selectedFolder.getFolderBalance();
            double currentJarBalance = savings - amount;
            selectedFolder.setFolderBalance(currentBalance + amount);
            
            System.out.println("Transferred " + amount + " to " + folderName);
            System.out.println("Current Jar Balance: " + currentJarBalance);
        } else {
            System.out.println("The folder: " + folderName + " does not exists");
        }
    }
    public void makePayment(double amount) {
        //check whether we have enough balance
        if(savings >= amount){
             paymentPage.processPayment(amount);
             double currentJarBalance = savings - amount;
             System.out.println("Current Jar Balance: " + currentJarBalance);
        } else {
            System.out.println("Payment decline insufficient fund");
        }
        
    }
    public void topupWallet(BankCard card, double amount) {
        topupPage.topupMoney(card, amount);
    }
}
