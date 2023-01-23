import java.util.*;
import java.io.*;
import java.lang.*;

class Lab02_Problem02{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		int x;
		int n=0;
		int negative=0;
		int positive=0;
		double avg=0;
		System.out.println("Enter Input:\n");
		for (int i=0;i<10;i++)
		{
			x = input.nextInt();
			avg=avg+x;
			if(x>0)
			{
				positive++;
				n++;
			}
			else if(x<0)
			{
				negative++;
				n++;
			}
			else{}
		}
		System.out.println("Total=" +avg);
		
		avg=avg/n;
		System.out.println("Negatives : "+negative+"\nPositives : "+positive+"\nAverage : "+avg);
	}
}	
		