import java.util.*;
import java.io.*;
import java.lang.*;

class L3P3{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.print("Input row size :");
		int m = input.nextInt();
		System.out.print("Input column size :");
		int n = input.nextInt();
		double[][] matrix = new double[m][n];
		for(int i=0; i<m; i++){
			for(int j=0;j<n; j++)
			{
				matrix[i][j]=input.nextDouble();
			}
		}
		int[] max =  new int[2];
		max = locateLargest(matrix);
		System.out.println("The location of the largest element is at ("+max[0]+", "+max[1]+")");
	}

	public static int[] locateLargest(double[][] matrix)
	{
		double max=0.0;
		int[] index = {0,0}; 
		for(int i=0; i<matrix.length; i++){
			for(int j=0;j<matrix[0].length; j++)
			{
				if(matrix[i][j]>max)
				{
					max=matrix[i][j];
					index[0]=i;
					index[1]=j;
				}
			}
		}
		return index;
	}
}
