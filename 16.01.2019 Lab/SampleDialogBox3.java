import java.util.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

class SampleDialogBox3{
 public static void main (String[] args){
	 String first = JOptionPane.showInputDialog (null, "Enter first integer","Input first integer", JOptionPane.QUESTION_MESSAGE );
	 
	 int firstNumber = Integer.parseInt(first);
	 
	 String second = JOptionPane.showInputDialog (null, "Enter second integer","Input first integer", JOptionPane.QUESTION_MESSAGE );
	 
	  int secondNumber = Integer.parseInt(second);
	  
	  int sum = firstNumber + secondNumber;
	  
	  JOptionPane.showMessageDialog(null, firstNumber + "+" +secondNumber + "=" +sum, "Result", JOptionPane.INFORMATION_MESSAGE );
 }
}
