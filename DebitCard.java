package L1C2.courseworkoriginal;


/**
 * sub class or child class of Bank Card class
 *
 * @author (Sujal Chaudhary)
 * @version (2023-01-24)
 */
public class DebitCard extends BankCard
{
    //Attributes of DebitCard class
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
    
    //Constructor of DebitCard class with six parameters
    public DebitCard(int balanceAmount, int cardId, String bankAccount, String issuerBank, String clientName, int pinNumber) 
    {
        //calling a superclass constructor with four parameters and setter method setclientName
        super(balanceAmount, cardId, bankAccount, issuerBank);
        super.setClientName(clientName);
        this.pinNumber = pinNumber;
        this.hasWithdrawn = false;
        this.withdrawalAmount = 0;
        this.dateOfWithdrawal = "";

    }
    //Accessor Method or Getter method of each corresponding attribute of DebitCard class
    
    public int getPinNumber() 
    {
        return pinNumber;
    }
 
    public int getWithdrawalAmount() 
    {
        return withdrawalAmount;
    }
 
    public String getDateOfWithdrawal() 
    {
        return dateOfWithdrawal;
    }
 
    public boolean getHasWithdrawn() 
    {
        return hasWithdrawn;
    }
    
    //Mutator method or setter method of withdrawalAmount of DebitCard class
    public void setWithDrawalAmount(int withdrawalAmount)
    {
        this.withdrawalAmount=withdrawalAmount;
    }
 
    //Withdraw method of DebitCard class
    public void withdraw(int withdrawalAmount, String dateOfWithdrawal, int pinNumber) 
    {
        if (pinNumber == this.pinNumber) 
        {
            if (super.getBalanceAmount() >= this.withdrawalAmount) 
            {
                int newBalance = super.getBalanceAmount() - withdrawalAmount;
                super.setBalanceAmount(newBalance);
                this.setWithDrawalAmount(withdrawalAmount);
                this.dateOfWithdrawal = dateOfWithdrawal;
                this.hasWithdrawn = true;
            } 
            else 
            {
                System.out.println("There is no sufficient balance in your account");
            }
        } 
        else 
        {
            System.out.println("You have entered incorrect PIN number");
        }
    }
 
    //Display method of DebitCard class
    public void display() 
    {
        super.display();
        if (hasWithdrawn==true) 
        {
            System.out.println("Your PIN number is: " + pinNumber);
            System.out.println("You have withdrawal: " + withdrawalAmount);
            System.out.println("You have withdrawal your amount on: " + dateOfWithdrawal);
        } 
        else 
        {
            System.out.println("Your balance amount is: " + super.getBalanceAmount());
        }
    }
}
