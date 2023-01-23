import java.util.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

class SampleDialogBox2{
 public static void main (String[] args){
	 String name = JOptionPane.showInputDialog (null, "Enter Your Name","Input name", JOptionPane.QUESTION_MESSAGE );
	 JOptionPane.showMessageDialog (null, "Your name is" + name,"Display name", JOptionPane.INFORMATION_MESSAGE );
 }
}
   