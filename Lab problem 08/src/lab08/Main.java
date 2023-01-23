/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author BIJOY
 */
public class Main {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();
        System.out.println("What kind of account do you want to open?");
        int n = input.nextInt();
        if(n==1){
            accounts.add(new CheckingAccount(001, 1000, 4.5, 300));
        }
        else if(n==2){
            Calendar exp = Calendar.getInstance();
            exp.set(2020,0,1,0,0,0);
            accounts.add(new SavingsAccount(002, 5000, 7,"1210649404",exp));
        }
        System.out.println(accounts.get(0).getBalance());
        accounts.get(0).deposit(500);
        System.out.println(accounts.get(0).getBalance());
        accounts.get(0).withdraw(1000);
        System.out.println(accounts.get(0).getBalance());
        if(accounts.get(0) instanceof CheckingAccount){
            System.out.println("This is a Checking Account");
        }
        else if(accounts.get(0) instanceof SavingsAccount){
            System.out.println("This is a Savings Account");
        }
        System.out.println("Account ID: "+accounts.get(0).getId()+
                    "\nDate Created: "+accounts.get(0).getDateCreated().getTime()+
                    "\nCurrent Balance: "+accounts.get(0).getBalance()+
                    "\nAnnual Interest Rate: "+accounts.get(0).getAnnualInterestRate()+
                    "\nMonthly Interest Amount: "+accounts.get(0).getMonthlyInterstAmount()+
                    "\n"+accounts.get(0).getExtraDetails());
        
        //accounts.add(new SavingsAccount(002, 10000, 6.3, 14162364582354, expDate));
        
    }
}
