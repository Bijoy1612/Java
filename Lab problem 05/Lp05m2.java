import java.util.*;
import java.io.*;
import java.lang.*;

class Lp05m2{
	public static void main(String[] args) {
		
		int marks[][] = {{15,10,12,8,14},{8,18,12,12,20},{8,15,20,17,9},{12,14,11,10,10},{9,7,19,15,10}};
		String[] name = {"Alice","Bob","Charlie","Danny","Elton"};
		boolean[] passed = new boolean[5];
		
        System.out.println("Admission Test Result ");
		for(int i=0;i<marks.length;i++){
			passed[i] = isPassed(marks[i]);
			if (passed[i])
				System.out.println(name[i]+"	- Passed");
			else
				System.out.println(name[i]+"	- Failed");
		}
	}

	public static boolean isPassed(int[] score){
		boolean passed;
		if(score[0]>=10&&score[1]>=10&&score[2]>=10&&score[3]>=10&&score[4]>=10)
			passed = true;
		else if((score[1]+score[2]+score[3])>=50)
			passed=true;
		else if((score[0]+score[1]+score[2]+score[3]+score[4])>=70)
			passed=true;
		else 
			passed=false;
		return passed;
	}
}