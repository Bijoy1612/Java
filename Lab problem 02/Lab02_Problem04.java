import java.util.*;
import java.io.*;
import java.lang.*;

class Lab02_Problem04{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		int[] score=new int[4];
		int best=0;
		System.out.print("Enter scores:\n");
		for (int i=0; i<score.length; i++)
		{
			score[i] = input.nextInt();
			if (score[i]>best)
				best=score[i];
		}
		for (int i=0; i<score.length; i++)
		{
			System.out.print("Student "+i+" score is "+score[i]+" and grade is ");
			if(score[i]>=(best-10))
				System.out.println("A");
			else if(score[i]>=(best-20))
				System.out.println("B");
			else if(score[i]>=(best-30))
				System.out.println("C");
			else if(score[i]>=(best-40))
				System.out.println("D");
			else
				System.out.println("F");
		}
	}
}	
		