import java.util.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

class Lab02_Problem03{
	public static void main(String[] args){
		String first = JOptionPane.showInputDialog (null,"Enter First Number", "Input First Number", JOptionPane.QUESTION_MESSAGE);
		int a = Integer.parseInt(first); // Conversion from string to int
		String second = JOptionPane.showInputDialog (null,"Enter Second Number", "Input Second Number", JOptionPane.QUESTION_MESSAGE);
		int b = Integer.parseInt(second);
		int smaller=(a<b)?a:b;
		int i;
		int gcd=1;
		for (i=smaller;i>0;i--)
		{
			if(a%i==0&&b%i==0)
			{
				gcd=i;
				break;
			}
		}
		
		JOptionPane.showMessageDialog(null,"GCD = "+gcd, "Result", JOptionPane.INFORMATION_MESSAGE);
		
	}
}