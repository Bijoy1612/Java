import java.lang.*;
import java.io.*;
import java.util.*;

class L3P4{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] array = {{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};
		sort(array);
		for (int i=0; i<array.length;i++)
		{
			for (int j=0; j<array[0].length;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	public static void sort(int m[][]){
		int[] temp = new int[m[0].length];
		for (int i=0; i<m.length-1; i++){
			for (int j=m.length-1; j>i; j--)
			{
				if(m[j][0]<m[j-1][0])
				{
					temp = m[j];
					m[j] = m[j-1];
					m[j-1] = temp;
				}
				else if(m[j][0]==m[j-1][0])
				{
					if(m[j][1]<m[j-1][1])
					{
						temp = m[j];
						m[j] = m[j-1];
						m[j-1] = temp;
					}
				}
			}
		}

	}
}