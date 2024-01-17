
package L1C2.courseworkoriginal;

//Using the pre-defined class by importing them
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class BankGUI
{
    /*Making instance variable of JFrame, Jlabel, JTextField, JComboBox, JPanel, JButton,adding arraylist of BankCard, making
     array for combo boxes, and setting constant value to -1*/
    private JFrame frame;
    private JPanel panelforbankcard, panelforcreditcard, panelfordebitcard;
    private JLabel cardid, clientname, issuerbank, bankaccount, balanceamount, cvcnumber, creditlimit, interestrate, graceperiod, expirationdate, pinnumber,
           withdrawalamount, withdrawaldate, pinnumberfordebitcard, cardidfordebitcard,cardidforcreditcard,cardidforcreditcard2;
    private JTextField fieldforcardid, fieldforclientname, fieldforissuerbank, fieldforbankaccount, fieldforbalanceamount, fieldforpinnumber,
                       fieldforwithdrawalamount, fieldforcvcnumber, fieldforcreditlimit, fieldforinterestrate, fieldforgraceperiod, fieldforpinnumber2, fieldforcardid2,
                       fieldforcardid3, fieldforcardid4;
    private JComboBox <String> yearboxforexpirationdate, monthboxforexpirationdate, dayboxforexpirationdate, yearboxforwithdrawal, monthboxforwithdrawal,
                      dayboxforwithdrawal;
    private JButton debitcard, creditcard, clearforbankcard, setthecreditlimit, cancelcreditcard,  displayforcreditcard, clearforcreditcard, withdrawfromdebitcard,
                    displayfordebitcard, clearfordebitcard;
    private String[] yearforexpirationdate = {"Year","2040","2039","2038","2037","2036","2035","2034","2033","2032","2031","2030","2029","2028","2027","2026","2025", "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015"};
    private String[] monthforexpirationdate = {"Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private String[] dayforexpirationdate = {"Day","1", "2", "3", "4","5", "6", "7", "8", "9", "10", "11","12", "13", "14", "15", "16", "17", "18","19",
                                            "20", "21", "22", "23", "24", "25","26", "27", "28", "29", "30", "31"};
    private String[] yearforwithdrawal = {"Year", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015"};
    private String[] monthforwithdrawal = {"Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private String[] dayforwithdrawal = {"Day","1", "2", "3", "4","5", "6", "7", "8", "9", "10", "11","12", "13", "14", "15", "16", "17", "18","19",
                                        "20", "21", "22", "23", "24", "25","26", "27", "28", "29", "30", "31"};
    private ArrayList <BankCard> list = new ArrayList<BankCard>();

    private final static int INVALID = -1;

    //Creating constructor of class
    public BankGUI()
    {
        //making object and settings values for JFrame
        frame = new JFrame("BANK GUI");
        frame.setLayout(null);
        frame.setSize(1300,900);
        frame.setLocation(300,70);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //making object and setting values for JPanel
        panelforbankcard = new JPanel();
        panelforbankcard.setSize(500,260);
        panelforbankcard.setLocation(400,30);
        panelforbankcard.setLayout(null);
        panelforbankcard.setBorder(BorderFactory.createTitledBorder("Bank Card Details"));
        panelforbankcard.setBackground(Color.WHITE);
        frame.add(panelforbankcard);

        panelforcreditcard = new JPanel();
        panelforcreditcard.setSize(500,460);
        panelforcreditcard.setLocation(650,340);
        panelforcreditcard.setLayout(null);
        panelforcreditcard.setBorder(BorderFactory.createTitledBorder("Credit Card Details"));
        panelforcreditcard.setBackground(Color.WHITE);
        frame.add(panelforcreditcard);
        
        panelfordebitcard = new JPanel();
        panelfordebitcard.setSize(500,460);
        panelfordebitcard.setLocation(100,340);
        panelfordebitcard.setLayout(null);
        panelfordebitcard.setBorder(BorderFactory.createTitledBorder("Debit Card Details"));
        panelfordebitcard.setBackground(Color.WHITE);
        frame.add(panelfordebitcard);

        //making object and setting values for JLabel
        cardid = new JLabel("Card ID: ");
        cardid.setBounds(20,15,60,50);
        panelforbankcard.add(cardid);

        clientname = new JLabel("Client Name: ");
        clientname.setBounds(20,55,75,50);
        panelforbankcard.add(clientname);

        issuerbank = new JLabel("Issuer Bank: ");
        issuerbank.setBounds(20,95,75,50);
        panelforbankcard.add(issuerbank);

        bankaccount = new JLabel("Bank Account: ");
        bankaccount.setBounds(20,135,85,50);
        panelforbankcard.add(bankaccount);

        balanceamount = new JLabel("Balance Amount: ");
        balanceamount.setBounds(20,175,100,50);
        panelforbankcard.add(balanceamount);

        cvcnumber = new JLabel("CVC number: ");
        cvcnumber.setBounds(20,15,150,50);
        panelforcreditcard.add(cvcnumber);

        creditlimit = new JLabel("Credit Limit: ");
        creditlimit.setBounds(20,215,150,50);
        panelforcreditcard.add(creditlimit);

        interestrate = new JLabel("Interest Rate: ");
        interestrate.setBounds(20,95,150,50);
        panelforcreditcard.add(interestrate);

        graceperiod = new JLabel("Grace Period: ");
        graceperiod.setBounds(20,255,150,50);
        panelforcreditcard.add(graceperiod);

        expirationdate = new JLabel("Expiration Date: ");
        expirationdate.setBounds(20, 55, 100, 50);
        panelforcreditcard.add(expirationdate);
        
        pinnumber = new JLabel("PIN Number: ");
        pinnumber.setBounds(20,15,100,50);
        panelfordebitcard.add(pinnumber);

        withdrawalamount = new JLabel("Withdrawal Amount: ");
        withdrawalamount.setBounds(20,155,150,50);
        panelfordebitcard.add(withdrawalamount);

        withdrawaldate = new JLabel("Withdrawal Date: ");
        withdrawaldate.setBounds(20, 195, 100, 50);
        panelfordebitcard.add(withdrawaldate);

        pinnumberfordebitcard = new JLabel("Pin Number: ");
        pinnumberfordebitcard.setBounds(20,60,100, 100);
        panelfordebitcard.add(pinnumberfordebitcard);

        cardidfordebitcard = new JLabel("Card Id: ");
        cardidfordebitcard.setBounds(20,120,60,50);
        panelfordebitcard.add(cardidfordebitcard);

        cardidforcreditcard = new JLabel("Card Id: ");
        cardidforcreditcard.setBounds(20,175,60,50);
        panelforcreditcard.add(cardidforcreditcard);
        
        cardidforcreditcard2 = new JLabel("Card Id: ");
        cardidforcreditcard2.setBounds(20,335,60,50);
        panelforcreditcard.add(cardidforcreditcard2);

        //making object and setting values for JTextField
        fieldforcardid = new JTextField();
        fieldforcardid.setBounds(145,20,150,30);
        panelforbankcard.add(fieldforcardid);

        fieldforclientname = new JTextField();
        fieldforclientname.setBounds(145,60,150,30);
        panelforbankcard.add(fieldforclientname);

        fieldforissuerbank = new JTextField();
        fieldforissuerbank.setBounds(145,100,150,30);
        panelforbankcard.add(fieldforissuerbank);

        fieldforbankaccount = new JTextField();
        fieldforbankaccount.setBounds(145,140,150,30);
        panelforbankcard.add(fieldforbankaccount);

        fieldforbalanceamount = new JTextField();
        fieldforbalanceamount.setBounds(145,180,150,30);
        panelforbankcard.add(fieldforbalanceamount);

        fieldforcvcnumber = new JTextField();
        fieldforcvcnumber.setBounds(145,20,150,30);
        panelforcreditcard.add(fieldforcvcnumber);

        fieldforcreditlimit = new JTextField();
        fieldforcreditlimit.setBounds(145,220,150,30);
        panelforcreditcard.add(fieldforcreditlimit);

        fieldforinterestrate = new JTextField();
        fieldforinterestrate.setBounds(145,100,150,30);
        panelforcreditcard.add(fieldforinterestrate);

        fieldforgraceperiod = new JTextField();
        fieldforgraceperiod.setBounds(145,260,150,30);
        panelforcreditcard.add(fieldforgraceperiod);

        fieldforpinnumber = new JTextField();
        fieldforpinnumber.setBounds(145,20,150,30);
        panelfordebitcard.add(fieldforpinnumber);

        fieldforwithdrawalamount = new JTextField();
        fieldforwithdrawalamount.setBounds(145,160,150,30);
        panelfordebitcard.add(fieldforwithdrawalamount);

        fieldforpinnumber2 = new JTextField();
        fieldforpinnumber2.setBounds(145, 90,150,30);
        panelfordebitcard.add(fieldforpinnumber2);

        fieldforcardid2 = new JTextField();
        fieldforcardid2.setBounds(145, 125, 150, 30);
        panelfordebitcard.add(fieldforcardid2);

        fieldforcardid3 = new JTextField();
        fieldforcardid3.setBounds(145, 180, 150, 30);
        panelforcreditcard.add(fieldforcardid3);
 
        fieldforcardid4 = new JTextField();
        fieldforcardid4.setBounds(145, 340, 150, 30);
        panelforcreditcard.add(fieldforcardid4);

        //making object and setting values for ComboBox
        yearboxforexpirationdate  = new JComboBox<>(yearforexpirationdate);
        yearboxforexpirationdate .setBounds(145, 60, 105, 30);
        panelforcreditcard.add(yearboxforexpirationdate);

        monthboxforexpirationdate = new JComboBox<>(monthforexpirationdate);
        monthboxforexpirationdate.setBounds(270, 60, 90, 30);
        panelforcreditcard.add(monthboxforexpirationdate);

        dayboxforexpirationdate = new JComboBox<>(dayforexpirationdate);
        dayboxforexpirationdate.setBounds(380, 60, 90, 30);
        panelforcreditcard.add(dayboxforexpirationdate);

        yearboxforwithdrawal = new JComboBox<>(yearforwithdrawal);
        yearboxforwithdrawal.setBounds(145, 200, 105, 30);
        panelfordebitcard.add(yearboxforwithdrawal);

        monthboxforwithdrawal = new JComboBox<>(monthforwithdrawal);
        monthboxforwithdrawal.setBounds(270, 200, 90, 30);
        panelfordebitcard.add(monthboxforwithdrawal);

        dayboxforwithdrawal = new JComboBox<>(dayforwithdrawal);
        dayboxforwithdrawal.setBounds(380, 200, 90, 30);
        panelfordebitcard.add(dayboxforwithdrawal);

        //making object and setting values for JButton
        debitcard = new JButton("Add a Debit Card");
        debitcard.setBounds(145,55,130,30);
        panelfordebitcard.add(debitcard);

        creditcard = new JButton("Add a Credit Card");
        creditcard.setBounds(145,140,140,30);
        panelforcreditcard.add(creditcard);

        clearforbankcard = new JButton("Clear");
        clearforbankcard.setBounds(145,220,70,30);
        panelforbankcard.add(clearforbankcard);

        setthecreditlimit = new JButton("Set the credit limit");
        setthecreditlimit.setBounds(145,300,140,30);
        panelforcreditcard.add(setthecreditlimit);

        cancelcreditcard = new JButton("Cancel Creditcard");
        cancelcreditcard.setBounds(145,380,140,30);
        panelforcreditcard.add(cancelcreditcard);

        displayforcreditcard = new JButton("Display");
        displayforcreditcard.setBounds(145,420,80,30);
        panelforcreditcard.add(displayforcreditcard);

        clearforcreditcard = new JButton("Clear");
        clearforcreditcard.setBounds(240,420,70,30);
        panelforcreditcard.add(clearforcreditcard);

        withdrawfromdebitcard = new JButton("Withdraw from debit card");
        withdrawfromdebitcard.setBounds(145,240,180,30);
        panelfordebitcard.add(withdrawfromdebitcard);

        displayfordebitcard = new JButton("Display");
        displayfordebitcard.setBounds(145,280,80,30);
        panelfordebitcard.add(displayfordebitcard);

        clearfordebitcard = new JButton("Clear");
        clearfordebitcard.setBounds(240,280,70,30);
        panelfordebitcard.add(clearfordebitcard);

        frame.setVisible(true);

        //Adding ActionListener to the button
        debitcard.addActionListener(new ActionListener() 
        {
         public void actionPerformed(ActionEvent e) 
            {
                addadebitcard();
            }
        });

        withdrawfromdebitcard.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                withdrawfromdebitcard();
            }
        });

        clearforbankcard.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                clearbuttoninbankcard();
            }
        });

        clearfordebitcard.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                clearbuttonindebitcard();
            }
        });

        displayfordebitcard.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                displaydebitcard();
            }
        });

        creditcard.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                addacreditcard();
            }
        });

        setthecreditlimit.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                buttonforcreditlimit();
            }
        });

        cancelcreditcard.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                cancelCreditlimit();
            }
        });

        clearforcreditcard.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                clearbuttonincreditcard();
            }
        });

        displayforcreditcard.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                displaycreditcard();
            }
        });

    }

    //getter method for addadebitcard
    public int getCardId() 
    {
        int cardId = INVALID;
        cardId = Integer.parseInt(fieldforcardid.getText().trim());
        if (cardId <= 0) 
        {
            cardId = INVALID;
        }
        return cardId; 
    }

    public String getClientName()
    {
        return fieldforclientname.getText().trim();
    }

    public String getIssuerBank()
    {
        return fieldforissuerbank.getText().trim();
    }

    public String getBankAccount()
    {
        return fieldforbankaccount.getText().trim();
    }

    public int getBalanceAmount()
    {
        int balanceamount = INVALID;
        balanceamount = Integer.parseInt(fieldforbalanceamount.getText().trim());
             if (balanceamount <= 0) 
             {
                 balanceamount = INVALID;
             }
        return balanceamount;
    }

    public int getPinNumber()
    {
        int pinnumber = INVALID;
         pinnumber = Integer.parseInt(fieldforpinnumber.getText().trim());
             if (pinnumber <= 0)
             {
                 pinnumber = INVALID;
             }
            return pinnumber;
    }

    //method for addadebitcard button
    public void addadebitcard()
    {           
        try 
        {
            int fieldforcardid = getCardId();
            if (fieldforcardid <= 0) 
            {
                JOptionPane.showMessageDialog(panelforbankcard,"Card Id value cannot be less than zero", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } 
        catch (NumberFormatException nfe)   
        {
            JOptionPane.showMessageDialog(panelforbankcard, "Card Id should not be empty or in letters", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String fieldforclientname = getClientName();
        if(fieldforclientname.isEmpty())
        {
            JOptionPane.showMessageDialog(panelforbankcard, "Client name should be filled", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String fieldforissuerbank = getIssuerBank();
        if(fieldforissuerbank.isEmpty())
        {
            JOptionPane.showMessageDialog(panelforbankcard, "Issuer Bank should be filled", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String fieldforbankaccount = getBankAccount();
        if(fieldforbankaccount.isEmpty())
        {
            JOptionPane.showMessageDialog(panelforbankcard, "Bank Account should be filled", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }  
                    
        try 
        {
            int fieldforbalanceamount = getBalanceAmount();
            if (fieldforbalanceamount <= 0) 
            {
                JOptionPane.showMessageDialog(panelforbankcard,"Balance Amount cannot be less than zero", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } 
        catch (NumberFormatException nfe) 
        {
            JOptionPane.showMessageDialog(panelforbankcard, "Balance Amount must not be empty and should not be in letters", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try 
        {
            int fieldforpinnumber = getPinNumber();
            if (fieldforpinnumber <= 0) 
            {
                JOptionPane.showMessageDialog(panelfordebitcard,"Pin Number value cannot be less than zero", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } 
        catch(NumberFormatException nfe)
        {   
            JOptionPane.showMessageDialog(panelfordebitcard, "Pinnumber cannot be empty or should not be in letters", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }

        int fieldforcardid = getCardId();
        int fieldforbalanceamount = getBalanceAmount();
        int fieldforpinnumber = getPinNumber(); 
        if(checkCardIdUniquefordebitcard(fieldforcardid))
        {
            DebitCard obj1 = new DebitCard(fieldforbalanceamount, fieldforcardid, fieldforbankaccount, fieldforissuerbank, fieldforclientname, fieldforpinnumber);
            list.add(obj1);
            JOptionPane.showMessageDialog(panelfordebitcard, "The object has been successfully generated", "Successfull", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(panelfordebitcard, "Card Id should be unique", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } 

    //clear button for bankcard
    public void clearbuttoninbankcard() 
    {
        fieldforcardid.setText("");
        fieldforclientname.setText("");
        fieldforissuerbank.setText("");
        fieldforbankaccount.setText("");
        fieldforbalanceamount.setText("");
    }

    //checking method if Card Id is unique or not of Debit Card and Credit Card
    public boolean checkCardIdUniquefordebitcard(int cardId)
    {
        boolean result = true;
            for(BankCard obj : list)
            {
            if(obj instanceof DebitCard )
                {
                    DebitCard debitcard = (DebitCard) obj;
                    if(debitcard.getCardId() == cardId)
                    { 
                        result = false;
                        break;
                    }
                }
            }
        return result;
    }

    public boolean checkCardIdUniqueforcreditcard(int cardId)
    {
        boolean result = true;
            for(BankCard obj : list)
            {
                if(obj instanceof CreditCard)
                {
                    CreditCard creditcard = (CreditCard) obj;
                        if(creditcard.getCardId() == cardId)
                        { 
                            result = false;
                            break;
                        }
                }
            }
        return result;
    }


    //getter method for withdrawfromdebitcard
    public int getPinNumber2()
    {
        int pinnumber2 = INVALID;
        pinnumber2 = Integer.parseInt(fieldforpinnumber2.getText().trim());
            if (pinnumber2 <= 0)
            {
                pinnumber2 = INVALID;
            }
        return pinnumber2;
    }

    public int getCardId2() 
    {
        int cardId2 = INVALID;
        cardId2 = Integer.parseInt(fieldforcardid2.getText().trim());
            if (cardId2 <= 0) 
            {
                cardId2 = INVALID;
            }
        return cardId2;
    }

    public int getWithdrawalAmount()
    {
        int withdrawalamount = INVALID;
        withdrawalamount = Integer.parseInt(fieldforwithdrawalamount.getText().trim());
            if (withdrawalamount <= 0)
            {
                withdrawalamount = INVALID;
            }
        return withdrawalamount;
    }

    public String getWithdrawalDate() 
    {
        String year = (String)yearboxforwithdrawal.getSelectedItem();
        String month = (String)monthboxforwithdrawal.getSelectedItem();
        String day = (String)dayboxforwithdrawal.getSelectedItem();

        String withdrawaldate = year + "-" + month + "-" + day;
        return withdrawaldate;
    }

    //method for withdrawfromdebitcard button
    public void withdrawfromdebitcard()
    {
        try 
        {
            int fieldforpinnumber2 = getPinNumber2();
            if (fieldforpinnumber2 <= 0) 
            {
                JOptionPane.showMessageDialog(panelfordebitcard,"Pin Number value cannot be less than 0", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } 
        catch(NumberFormatException nfe)
        {   
            JOptionPane.showMessageDialog(panelfordebitcard, "Pin Number must not be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }
        
        
        try 
        {
            int fieldforcardid2 = getCardId2();
            if (fieldforcardid2 <= 0) 
            {
                JOptionPane.showMessageDialog(panelfordebitcard,"Card Id value must not be less than 0", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } 
        catch (NumberFormatException nfe)   
        {
            JOptionPane.showMessageDialog(panelfordebitcard, "Card Id should not be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try 
        {
            int fieldforwithdrawalamount = getWithdrawalAmount();
            if (fieldforwithdrawalamount <= 0) 
            {
                JOptionPane.showMessageDialog(panelfordebitcard,"Withdrawwal amount must be more than zero", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } 
        catch(NumberFormatException nfe)
        {   
            JOptionPane.showMessageDialog(panelfordebitcard, "Withdrawal amount must not be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }
            
        String date = getWithdrawalDate();
        if (date.equals("Year-Month-Day"))
        {
            JOptionPane.showMessageDialog(panelfordebitcard, "Dates hasn't been set", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
                   
        int fieldforwithdrawalamount = getWithdrawalAmount();
        int fieldforpinnumber2 = getPinNumber2();
        int fieldforcardid2 = getCardId2();
    
        for (BankCard obj1 : list) 
        {
            if (obj1 instanceof DebitCard) 
            {
                DebitCard debitCard = (DebitCard) obj1;
                if (debitCard.getCardId() == fieldforcardid2) 
                {
                    debitCard. withdraw(fieldforwithdrawalamount, date, fieldforpinnumber2);
                    JOptionPane.showMessageDialog(panelfordebitcard, "Check Terminal","INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                } 
                else 
                {
                    JOptionPane.showMessageDialog(panelfordebitcard, "Card id not matched","Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }

    //clear for debit card
    public void clearbuttonindebitcard() 
    {
        fieldforpinnumber.setText("");
        fieldforpinnumber2.setText("");
        fieldforcardid2.setText("");
        fieldforwithdrawalamount.setText("");
        yearboxforwithdrawal.setSelectedIndex(0); 
        monthboxforwithdrawal.setSelectedIndex(0);
        dayboxforwithdrawal.setSelectedIndex(0);     
    }

    //display for debit card
    public void displaydebitcard() 
    {
        for(BankCard obj : list)
        {
            if(obj instanceof DebitCard)
            {
                DebitCard debitCard = (DebitCard) obj;
                debitCard.display();
            }
        }                  
    }
        
    //getter method for addacreditcard
    public int getcvcNumber()
    {
        int cvcnumber = INVALID;
        cvcnumber = Integer.parseInt(fieldforcvcnumber.getText().trim());
        if (cvcnumber <= 0)
        {
            cvcnumber = INVALID;
        }                
        return cvcnumber;
    }

    public String getExpirationDate() 
    {
        String year = (String)yearboxforexpirationdate.getSelectedItem();
        String month = (String)monthboxforexpirationdate.getSelectedItem();
        String day = (String)dayboxforexpirationdate.getSelectedItem();

        String expirationdate = year + "-" + month + "-" + day;
        return expirationdate;
    }

    public double getInterestRate()
    {
        double interestrate = INVALID;
        interestrate = Double.parseDouble(fieldforinterestrate.getText().trim());
        if (interestrate <= 0)
        {
            interestrate = INVALID;
        }
        return interestrate;
    }

    //addacreditcard method
    public void addacreditcard()
    {
        try 
        {
            int fieldforcvcnumber = getcvcNumber();
            if (fieldforcvcnumber <= 0) 
            {
                JOptionPane.showMessageDialog(panelforcreditcard,"CVC Number must not be less than 0", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } 
        catch(NumberFormatException nfe)
        {   
            JOptionPane.showMessageDialog(panelforcreditcard, "CVC Number must not be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }

        String date1 = getExpirationDate();
        if (date1.equals("Year-Month-Day"))
        {
            JOptionPane.showMessageDialog(panelforcreditcard, "Dates hasn't been set", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try 
        {
            double fieldforinterestrate = getInterestRate();
            if (fieldforinterestrate <= 0) 
            {
                JOptionPane.showMessageDialog(panelforcreditcard,"Interest Rate must not be less than 0", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } 
        catch(NumberFormatException nfe)
        {   
            JOptionPane.showMessageDialog(panelforcreditcard, "Interest Rate must not be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }

        int fieldforcvcnumber = getcvcNumber();
        double fieldforinterestrate = getInterestRate();
        int fieldforcardid = getCardId();
        String fieldforclientname = getClientName();
        String fieldforissuerbank = getIssuerBank();
        String fieldforbankaccount = getBankAccount();
        int fieldforbalanceamount = getBalanceAmount();
        if(checkCardIdUniqueforcreditcard(fieldforcardid))
        {
            CreditCard obj2 = new CreditCard(fieldforcardid, fieldforclientname, fieldforissuerbank, fieldforbankaccount, fieldforbalanceamount,
            fieldforcvcnumber, fieldforinterestrate, date1);
            list.add(obj2);
            JOptionPane.showMessageDialog(panelforcreditcard, "The object has been successfully generated", "Successfull", JOptionPane.INFORMATION_MESSAGE);
        }  
        else
        {
            JOptionPane.showMessageDialog(panelforcreditcard, "Card Id already exists", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //getter method for setcreditlimit
    public int getCardId3() 
    {
        int cardId3 = INVALID;
        cardId3 = Integer.parseInt(fieldforcardid3.getText().trim());
            if (cardId3 <= 0) 
            {
                cardId3 = INVALID;
            }
        return cardId3;
    }

    public double getCreditLimit()
    {
        double creditLimit = INVALID;
        creditLimit = Double.parseDouble(fieldforcreditlimit.getText().trim());
            if (creditLimit <= 0)
            {
                creditLimit = INVALID;
            }
        return creditLimit;        
    }

    public int getGracePeriod()
    {
        int graceperiod = INVALID;
        graceperiod = Integer.parseInt(fieldforgraceperiod.getText().trim());
            if (graceperiod <= 0)
            {
                graceperiod = INVALID;
            }
        return graceperiod;
    }
        
    //method for creditlimit
    public void buttonforcreditlimit()
    {
        try 
        {
            int fieldforcardid3 = getCardId3();
            if (fieldforcardid3 <= 0) 
            {
                JOptionPane.showMessageDialog(panelforcreditcard,"Card ID must not be less than 0", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } 
        catch(NumberFormatException nfe)
        {   
            JOptionPane.showMessageDialog(panelforcreditcard, "CardId must not be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }
            
        try 
        {
            double fieldforcreditlimit = getCreditLimit();
            if (fieldforcreditlimit <= 0) 
            {
                JOptionPane.showMessageDialog(panelforcreditcard,"Credit Limit must not be less than 0", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } 
        catch(NumberFormatException nfe)
        {   
            JOptionPane.showMessageDialog(panelforcreditcard, "Credit Limit must not be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }

        try 
        {
            int fieldforgraceperiod = getGracePeriod();
            if (fieldforgraceperiod <= INVALID) 
            {
                JOptionPane.showMessageDialog(panelforcreditcard,"Grace Period must not be less than 0", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } 
        catch(NumberFormatException nfe)
        {   
            JOptionPane.showMessageDialog(panelforcreditcard, "Grace Period must not be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }

        double fieldforcreditlimit = getCreditLimit();
        int fieldforgraceperiod = getGracePeriod();
        int fieldforcardid3 = getCardId3();

        for (BankCard obj2: list) 
        {
            if (obj2 instanceof CreditCard) 
            {
                CreditCard creditcard = (CreditCard) obj2;
                if (creditcard.getCardId() == fieldforcardid3) 
                {
                    creditcard. setCreditLimit(fieldforcreditlimit, fieldforgraceperiod);
                    JOptionPane.showMessageDialog(panelforcreditcard, "Check Terminal","INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(panelforcreditcard, "Card Id is not matched","ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    //getter methodn for cancel credit card
    public int getCardId4() 
    {
        int cardId4 = INVALID;
        cardId4 = Integer.parseInt(fieldforcardid4.getText().trim());
            if (cardId4 <= 0) 
            {
                cardId4 = INVALID;
            }
        return cardId4;
    }
    
    //method for cancel credit card
    public void cancelCreditlimit()
    {   int fieldforcardid4 = getCardId4();
        for (BankCard obj2: list) 
        {
            if (obj2 instanceof CreditCard) 
            {
                CreditCard creditcard = (CreditCard) obj2;
                if (creditcard.getCardId() == fieldforcardid4) 
                {
                    creditcard.cancelCreditCard();
                    JOptionPane.showMessageDialog(panelforcreditcard, "The credit card has been successfully canceled", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);               }
                else
                {
                    JOptionPane.showMessageDialog(panelforcreditcard, "Card Id is not matched","ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    //method for display of credit card
    public void displaycreditcard() 
    {
        for(BankCard obj : list)
        {
            if(obj instanceof CreditCard)
            {
                CreditCard creditCard = (CreditCard) obj;
                creditCard.display();
            }
        }                  
    }

    //clear for credit card
    public void clearbuttonincreditcard() 
    {
        fieldforcvcnumber.setText("");
        yearboxforexpirationdate.setSelectedIndex(0);
        monthboxforexpirationdate.setSelectedIndex(0);
        dayboxforexpirationdate.setSelectedIndex(0);
        fieldforinterestrate.setText("");
        fieldforcardid3.setText("");
        fieldforcreditlimit.setText("");
        fieldforgraceperiod.setText("");
        fieldforcardid4.setText("");
    }
 
    //main method
    public static void main(String[] args)
    {
        new BankGUI();
    }
}
 

