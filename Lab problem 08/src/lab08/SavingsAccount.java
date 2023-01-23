/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

import java.util.Calendar;

/**
 *
 * @author BIJOY
 */
public class SavingsAccount extends Account {
    String creditNumber;
    Calendar expDate;

    SavingsAccount() {
    }

    SavingsAccount(int id, double balance, double annualInterestRate, String creditNumber, Calendar expDate) {
        super(id, balance, annualInterestRate);
        this.creditNumber = creditNumber;
        this.expDate = expDate;
    }

    SavingsAccount(int i, int i0, int i1, String string, Calendar exp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double getCreditBalance(){
        return this.balance*3;
    }
    
    public void withdraw(double amount){
       if(this.balance>=amount)
           this.balance-=amount;
       else
           System.out.println("Insufficient Balance");
   }
    
    public String getExtraDetails(){
        return "Credit Card Number: "+this.creditNumber+"\nCard Expiery Date: "+this.expDate.getTime()+"\nCredit Balance: "+ this.getCreditBalance();
    }
}
