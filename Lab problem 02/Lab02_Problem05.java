import java.util.*;
import java.io.*;
import java.lang.*;

class Lab02_Problem05{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		int[] numbers=new int[100];
		int n;
		System.out.print("Enter the integers between 1 and 100:\n");
		while(true)
		{
			n = input.nextInt();
			if (n==0)
				break;
			else
				numbers[n]+=1;
		}

		for (int i=1; i<=100; i++)
		{
			if (numbers[i]!=0)
			{
				System.out.println(i+" occurs "+numbers[i]+" times");
			}
		}
	}
}	
