import java.util.*;
import java.io.*;
import java.lang.*;

class Lab01_Problem06{
 public static void main (String[] args){
	 Scanner input = new Scanner (System.in);
	 System.out.println("Enter Distance : ");
	 double distance = input.nextDouble();
	 System.out.println("Enter Time : ");
	 double time = input.nextDouble();
	 double avg = ((distance/1.6)/(time/60));
	 System.out.println("Average: " +avg);
	 
    }
}