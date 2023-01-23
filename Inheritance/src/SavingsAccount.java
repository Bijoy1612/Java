
import java.math.BigInteger;
import java.util.Calendar;


public class SavingsAccount extends Account {
   BigInteger cardNumber;
   Calendar expriryDate;
   
   SavingsAccount(){
       
   }
   
   SavingsAccount(int id, double balance, double annuallnterestRate, BigInteger cardnumber){
       super(id,balance,annuallnterestRate);
       this.cardNumber = cardNumber;
       this.expriryDate = Calendar.getInstance();
   }
   public double getCrediteBalance(){
             return 3*this.balance;
   }

    
}
