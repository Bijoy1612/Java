import java.util.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

class Lab02_Problem01{
	public static void main(String[] args){
		String first = JOptionPane.showInputDialog (null,"Enter a", "Input a", JOptionPane.QUESTION_MESSAGE);
		double a = Double.parseDouble(first); 
		String second = JOptionPane.showInputDialog (null,"Enter b", "Input b", JOptionPane.QUESTION_MESSAGE);
		double b = Double.parseDouble(second);
		String third = JOptionPane.showInputDialog (null,"Enter c", "Input c", JOptionPane.QUESTION_MESSAGE);
		double c = Double.parseDouble(third);
		
		double discriminant = b*b - 4*a*c;
		
		
		if (discriminant<0)
		{
			JOptionPane.showMessageDialog(null,"No real Root", "Result", JOptionPane.INFORMATION_MESSAGE);
		}
		else if (discriminant==0)
		{
			discriminant = Math.pow(discriminant, 0.5);
			double r1=(-b + discriminant)/2*a;
			JOptionPane.showMessageDialog(null,"There is only 1 Root, which is \n\n"+r1, "Result", JOptionPane.INFORMATION_MESSAGE);
		}
		else
		{
			discriminant = Math.pow(discriminant, 0.5);
			double r1=(-b + discriminant)/2*a;
			double r2=(-b - discriminant)/2*a;
			JOptionPane.showMessageDialog(null, "Root 1 = "+ r1 + "\nRoot 2 = " + r2 ,"Result", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}