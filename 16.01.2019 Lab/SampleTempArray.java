import java.util.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

class SampleTempArray{
 public static void main (String[] args){
	 Scanner input = new Scanner (System.in);
		double[] temperature = new double[10];
		double sum=0.0;
		
		for(int i=0; i<temperature.length; i++)
		{
			System.out.print("Input temperature of day "+i+": ");
			temperature[i] = input.nextDouble();
			sum = sum + temperature[i];
		}
		
		double avg = sum *1.00/ temperature.length;
		System.out.println("Average temperature: " +avg);
		
		System.out.println("show the Days: ");
		for(int i=0; i<temperature.length; i++)
		{
			if(temperature[i]<avg)
			{
				System.out.println("Day " + i);
			}
		}
	}
}