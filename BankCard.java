package L1C2.courseworkoriginal;


/**
 * The parent class
 *
 * @author (Sujal Chaudhary)
 * @version (2023-01-24)
 */
public class BankCard
{
    //Attributes of BankCard class
    private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private int balanceAmount;
    
    //Constructor of BankCard class with four parameters
    public BankCard(int balanceAmount, int cardId, String bankAccount, String issuerBank) 
    {
        this.clientName = "";
        this.balanceAmount = balanceAmount;
        this.cardId = cardId;
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;
    }
    
    //Accessor Method or Getter method of each corresponding attribute of BankCard class
    public int getCardId() 
    {
        return cardId;
    }
 
    public String getClientName() 
    {
        return clientName;
    }
 
    public String getIssuerBank() 
    {
        return issuerBank;
    }
 
    public String getBankAccount() 
    {
        return bankAccount;
    }
 
    public int getBalanceAmount() 
    {
        return balanceAmount;
    }
    
    //Mutator Method or Setter method of clientName and balaceAmount of BankCard class
    public void setClientName(String clientName) 
    {
        this.clientName = clientName;
    }
 
    public void setBalanceAmount(int balanceAmount) 
    {
        this.balanceAmount = balanceAmount;
    }
    
    //Display method of BankCard class
    public void display() 
    {
        if (clientName.equals("")) 
        {
            System.out.println("Client name is not assigned");
        }
        else
        {
            System.out.println("Your card ID is: " + cardId);
            System.out.println("Client name is: " + clientName);
            System.out.println("Issuer Bank: " + issuerBank);
            System.out.println("Your bank account is: " + bankAccount);
            System.out.println("Your balance amount is: " + balanceAmount);
        }
    }
}

