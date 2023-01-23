import java.util.*;
import java.io.*;
import java.lang.*;

class L3P5{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		double[][] a = new double[2][2];
		double[] b = new double[2];
		System.out.println("Input a00, a01, a10 and a11");
		for (int i=0; i<2; i++){
			for (int j=0; j<2; j++){
				a[i][j] = input.nextDouble();
			}
		}
		System.out.println("Input b0, b1");
		for (int i=0; i<2; i++)
			b[i] = input.nextDouble();
		double[] result = new double[2];
		result = linearEqn(a,b);
		if(result==null)
			System.out.println("This equation has no solution");
		else
			System.out.println("X is "+result[0]+"\nY is "+result[1]);
	}

	public static double[] linearEqn(double[][] a, double[] b)
	{
		if ((a[0][0]*a[1][1]-a[0][1]*a[1][0])==0)
			return null;
		double[] result = new double[2];
		result[0] = ((b[0]*a[1][1]-b[1]*a[0][1])/(a[0][0]*a[1][1]-a[0][1]*a[1][0]));
		result[1] = ((b[1]*a[0][0]-b[0]*a[1][0])/(a[0][0]*a[1][1]-a[0][1]*a[1][0]));
		return result;
	}
}
