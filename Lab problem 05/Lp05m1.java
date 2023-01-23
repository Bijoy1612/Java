import java.util.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

class Lp05m1{
 public static void main (String[] args){
	 String radius = JOptionPane.showInputDialog (null, "Enter radius","Input radius", JOptionPane.QUESTION_MESSAGE );
	 
	 int r = Integer.parseInt(radius);
	  
	  double area = Math.PI *r*r;
	  double perimeter = 2*Math.PI *r;
	  if(r>0){
		  JOptionPane.showMessageDialog(null,area + "\n"+ perimeter, "Result", JOptionPane.INFORMATION_MESSAGE );
	  }
	  else if (r<0){
		  JOptionPane.showMessageDialog(null,"Invalid point", "Result", JOptionPane.INFORMATION_MESSAGE );
	  }
	  else{
		  JOptionPane.showMessageDialog(null,"It is a point", "Result", JOptionPane.INFORMATION_MESSAGE );
	  }
	  
	  
 }
}

