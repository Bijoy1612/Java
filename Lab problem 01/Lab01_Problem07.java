import java.util.*;
import java.io.*;
import java.lang.*;

class Lab01_Problem07{
 public static void main (String[] args){
	 Scanner input = new Scanner (System.in);
	 System.out.println("Enter Celsius Degree : ");
	 double celsius = input.nextDouble();
	 double fahrenheit = ((9/5)*celsius+32);
	 System.out.println("Fahrenheit: " +fahrenheit);
	 
    }
}