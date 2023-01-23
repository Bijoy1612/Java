import java.util.*;
import java.io.*;
import java.lang.*;

class Lab01_Problem08{
 public static void main (String[] args){
	 Scanner input = new Scanner (System.in);
	 System.out.println("Enter any number : ");
	 int n=input.nextInt();
	 if(n%2==0 ^ n%3==0){
		 System.out.println("TRUE");
	 }
      else
	 System.out.println("FALSE");
	 
    }
}