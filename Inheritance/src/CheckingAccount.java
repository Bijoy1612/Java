
public class CheckingAccount extends Account{
    private double overdaft;

   CheckingAccount() {
       super();
    }

    public CheckingAccount(int id, double balance, double annuallnterestRate, double overdaft) {
        super(id,balance,annuallnterestRate);
        this.overdaft = overdaft;     
    }

    public double getOverdaft() {
        return overdaft;
    }

    public void setOverdaft(double overdaft) {
        this.overdaft = overdaft;
    }
    
    public void withraw(double amount){
        
    }
   
   
    
    
}
