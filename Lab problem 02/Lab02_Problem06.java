import java.util.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

class Lab02_Problem06{
	public static void main(String[] args){
		String function = JOptionPane.showInputDialog (null, "Input Function:\n\n0 = BDT to USD\n1 = USD to BDT", "Select Function", JOptionPane.QUESTION_MESSAGE);
		int fun = Integer.parseInt(function);
		if(fun==0)
		{
			String taka = JOptionPane.showInputDialog (null, "Input the amount of money in BDT", "Input Currency Amount", JOptionPane.QUESTION_MESSAGE);
			double bdt = Double.parseDouble(taka);
			double usd = bdt*(1.00/84);
			JOptionPane.showMessageDialog(null, bdt+" BDT = "+usd+" USD", "Coversion", JOptionPane.INFORMATION_MESSAGE);
		}
		else if (fun==1) 
		{
			String dollar = JOptionPane.showInputDialog (null, "Input the amount of money in USD", "Input Currency Amount", JOptionPane.QUESTION_MESSAGE);
			double usd = Double.parseDouble(dollar);
			double bdt = usd*84;
			JOptionPane.showMessageDialog(null, usd+" USD = "+ bdt +" BDT", "Coversion", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}