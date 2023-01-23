import java.util.*;
import java.io.*;
import java.lang.*;

class Lab01_Problem10{
 public static void main (String[] args){
	 Scanner input = new Scanner (System.in);
	 int remainder;
	 System.out.print("Enter a number between 0 and 1000: ");
	 int n = input.nextInt();
	 int sum=0;
	 System.out.print("Dgits: ");
	 for(int i=0; i<10; i++){
		 remainder=n%10;
		 n=n/10;
		 sum=sum+remainder;
		 if(remainder!=0){
			 System.out.print(remainder+ " ");
		 }
	 }
	 System.out.println("The sum of the digits: " +sum);
 }
}