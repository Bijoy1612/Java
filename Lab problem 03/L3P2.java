import java.util.*;
import java.io.*;
import java.lang.*;

class L3P2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[][] bin = new int[4][4];
		int row=0,col=0,rowmax=0,colmax=0,rowindex=0,colindex=0;
		for(int i=0;i<4;i++){
			row=0;
			for(int j=0;j<4;j++)
			{
				if(Math.random()>=0.5)
					bin[i][j]=1;
				else
					bin[i][j]=0;
				System.out.print(bin[i][j]+" ");
				row+=bin[i][j];
			}
			if(row>rowmax)
			{
				rowmax=row;
				rowindex=i;
			}
			System.out.println();
		}
		for (int j=0;j<4;j++){
			col=0;
			for (int i=0;i<4;i++)
			{
				col+=bin[i][j];
			}
			if(col>colmax)
			{
				colmax=col;
				colindex=j;
			}
		}
		System.out.println("Largest row index is "+rowindex);
		System.out.println("Largest column index is "+colindex);
	}
}