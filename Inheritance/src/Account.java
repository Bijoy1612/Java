
import java.util.Calendar;


public class Account {
    protected int id;
    protected double balance;
    protected double annuallnterestRate;
    protected Calendar dateCreated;

    Account() {
        this.id = 0;
        this.balance = 0;
        this.annuallnterestRate = 0;
    }

    public Account(int id, double balance, double annuallnterestRate) {
        this.id = id;
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
        this.dateCreated = Calendar.getInstance();
    }
    
    public double getBalance(){
        return this.balance;
    }

    public int getId() {
        return this.id;
    }

    double getAnnuallnterestRate() {
        return this.annuallnterestRate;
    }
    
    public Calendar getDataCreated() {
        return this.dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }
  
    public double getMonthlyInterestRate(){
        return this.annuallnterestRate/12;
    }
    public double getMonthlyInterestamount(){
        return (this.balance*this.getMonthlyInterestRate())/100;
    }
    
    public void withdraw(double amount){
        if(this.balance>amount)
            this.balance=-amount;
        else
             System.out.println("Insufficiant Balance");                     
    }
    
    public void deposite(double amount){
        this.balance+=amount;
    }
    
    
    
    
    
}
