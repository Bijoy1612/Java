import java.util.*;
import java.io.*;
import java.lang.*;
class Lab01_Problem04{
 public static void main (String[] args){
	 Scanner input = new Scanner (System.in);
	 System.out.println("Enter redius : ");
	 double radius = input.nextDouble();
	 double perimeter = 2*Math.PI*radius;
	 double area = Math.PI*radius*radius;
	 System.out.println("Perimeter: " +perimeter);
	 System.out.println("Area:" +area);
    }
}