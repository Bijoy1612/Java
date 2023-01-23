import java.util.*;
import java.io.*;
import java.lang.*;

class L3P1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[][] emp = {{2,4,3,4,5,8,8},{7,3,4,3,3,4,4},{3,3,4,3,3,2,2},{9,3,4,7,3,4,1},{3,5,4,3,6,3,8},{3,4,4,6,3,4,4},{3,7,4,8,3,8,4},{6,3,5,9,2,7,9}};
		int[][] total = new int[8][2];
		for (int i=0;i<emp.length;i++){
			total[i][0] = i;
			for (int j=0;j<emp[0].length;j++){
				total[i][1]+=emp[i][j];
			}
		}
		SSort(emp,total);
		for (int i=0;i<emp.length;i++){
			System.out.print("Employee "+total[i][0]+" : ");
			for (int j=0;j<emp[0].length;j++){
				System.out.print(emp[i][j]+" ");
			}
			System.out.print(" = "+total[i][1]+" hours\n");
		}
	}

	public static void SSort(int[][] arr, int[][] total)
	{
		int[] temp = new int[7];
		int[] temp2 = new int[2];
		int maxValue, maxIndex;
		for (int i=0; i<arr.length-1; i++){
			maxIndex = i;
			for (int j=i+1; j<arr.length;j++)
			{
				if(total[j][1]>total[maxIndex][1])
				{
					maxIndex = j;
				}
			}
			if(i!=maxIndex)
			{
				temp = arr[i];
				temp2 = total[i];
				arr[i] = arr [maxIndex];
				arr[maxIndex] = temp;
				total[i] = total[maxIndex];
				total[maxIndex] = temp2;
			}
		}
	}
}