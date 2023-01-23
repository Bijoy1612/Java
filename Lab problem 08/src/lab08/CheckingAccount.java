/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author BIJOY
 */
public class CheckingAccount extends Account {
     private double overdraft;

    CheckingAccount() {
        super();
    }

    public CheckingAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id,balance,annualInterestRate);
        this.overdraft = overdraft;
    }
    
    // Setters Getters
    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
    public double getOverdraft() {
        return this.overdraft;
    }
    
    public void withdraw(double amount){
        if((overdraft+balance)>=amount){
            this.balance-=amount;
        }
        else 
            System.out.println("Already reached overdraft");
    }
    
    public String getExtraDetails(){
        return "Overdraft Limit: "+this.overdraft; 
    }
}
