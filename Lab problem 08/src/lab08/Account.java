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
public class Account {
    protected int id;
    protected double balance;
    protected double annualInterestRate;
    protected Calendar dateCreated;
    
    Account(){
        this.id = 0;
        this.balance = 0.0;
        this.annualInterestRate = 0.0;
    }

    Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = Calendar.getInstance();
    }
// GETTERS
    public double getBalance() {
        return this.balance;
    }
    public int getId() {
        return this.id;
    }
    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }
    public Calendar getDateCreated() {
        return this.dateCreated;
    }
    
    public String getExtraDetails(){return "";}
    
//SETTERS 
    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
 // INSTANCE METHODS
    public double getMonthlyInterstRate(){
        return (this.annualInterestRate/12);
    }
    
   public double getMonthlyInterstAmount(){
        return this.balance*(this.getMonthlyInterstRate()/100);
    }
   
   public void deposit(double amount){
       this.balance+=amount;
   }
   
   public void withdraw(double amount){
       if(this.balance>=amount)
           this.balance-=amount;
       else
           System.out.println("Insufficient Balance");
   }
}
