import java.util.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

class SampleDialogBoxBMI{
 public static void main (String[] args){
	 String first = JOptionPane.showInputDialog (null, "Enter weight","Input first integer", JOptionPane.QUESTION_MESSAGE );
	 
	 int weight = Integer.parseInt(first);
	 
	 String second = JOptionPane.showInputDialog (null, "Enter height","Input first integer", JOptionPane.QUESTION_MESSAGE );
	 
	  double height = Double.parseDouble(second);
	  
	  double bmi = weight/(height*height);
	  
	  JOptionPane.showMessageDialog(null, "BMI " +bmi, "Disply bmi", JOptionPane.INFORMATION_MESSAGE );
 }
}
