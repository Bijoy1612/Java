import java.util.*;
import java.io.*;
import java.lang.*;

class Lab01_Problem09{
 public static void main (String[] args){
	 Scanner input = new Scanner (System.in);
	 System.out.println("Enter the number of minutes : ");
	 int minute=input.nextInt();
	 int year=minute/(365*24*60);
	 int days=(minute%(365*24*60))/(60*24);
	 System.out.println(minute +"minute" +year +"year and"+days +"days");
    }
}