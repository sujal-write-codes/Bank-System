package L1C2.courseworkoriginal;


/**
 *  sub class or child class of Bank Card class
 *
 * @author (Sujal Chaudhary)
 * @version (2023-01-24)
 */
public class CreditCard extends BankCard
{
    //Attributes of CreditCard class
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    
    //Constructor of CreditCard class with eight parameters
    public CreditCard(int cardId, String clientName, String issuerBank, String bankAccount, int balanceAmount,
            int cvcNumber, double interestRate, String expirationDate) 
    {
        //calling a superclass constructor with four parameters and a setter method clientName
        super(balanceAmount, cardId,bankAccount,issuerBank);
        super.setClientName(clientName);
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.isGranted = false;
    }
    
    //Accessor method or getter method of each corresponding attribute of CreditCard class
    public int getCvcNumber()
    {
        return cvcNumber;
    }
    
    public double getCreditLimit()
    {
        return creditLimit;
    }
    
    public double getInterestRate()
    {
        return interestRate;
    }
    
    public String getExpirationDate()
    {
        return expirationDate;
    }
    
    public int getGracePeriod()
    {
        return gracePeriod;
    }
    
    public boolean getIsGranted()
    {
        return isGranted;
    }
    
    //Setter method to set the credit limit
    public void setCreditLimit(double creditLimit, int gracePeriod)
    {
        if(isGranted==false)
            if(creditLimit <= (2.5 * super.getBalanceAmount()))
            {
               this.creditLimit=creditLimit;
               this.gracePeriod = gracePeriod;
               this.isGranted = true;
               System.out.println("Credit is granted");
            }
            else
            {
                System.out.println("Credit is not granted");
            }
        else
        {
            System.out.println("Credit cannot be issued");
        }
    }
    
    //CancelCreditCard Method of CreditCard class
    public void cancelCreditCard()
    {
            this.creditLimit = 0.0;
            this.gracePeriod = 0;
            this.isGranted = false;
            this.cvcNumber = 0;
    }
    
    //Display method of CreditCard class
    public void display()
    {
        super.display();
        System.out.println("Your interest rate is: " + interestRate);
        System.out.println("Your expiration date is: " + expirationDate);
        if(isGranted==true)
        {
            System.out.println("Your credit limit is: " + creditLimit);
            System.out.println("Your grace period is: " + gracePeriod);
            System.out.println("Your CVC Number is: " + cvcNumber);
        }  
    }
}

