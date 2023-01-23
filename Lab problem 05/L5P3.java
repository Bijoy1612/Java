import java.util.*;
import java.io.*;
import java.lang.*;

class Point{
	private int x;
	private int y;

	Point(){}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
	public String toString(){
		return "("+this.x+", "+this.y+")";
	}


	public double findDistance(Point P){
		double distance = (this.x-P.x)*(this.x-P.x)+(this.y-P.y)*(this.y-P.y);
		distance = Math.sqrt(distance);
		return distance;
	}
}

class L5P3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Point[] p = new Point[4];
		int x,y;
		System.out.println("Input 4 points");
		for (int i=0; i<p.length; i++){
			x = input.nextInt();
			y = input.nextInt();
			p[i] = new Point(x,y);
			System.out.println(p[i].toString());
		}
		System.out.println("Input reference point:");
		x = input.nextInt();
		y = input.nextInt();
		Point k = new Point(x,y);

		System.out.println("Point "+furthestDistance(p,k).toString()+" is the furthest point from point "+k.toString());
	}

	public static Point furthestDistance(Point[] P, Point x){
		double max = 0;
		int maxIndex =0 ;
		for(int i=0; i<P.length; i++){
			System.out.println("index : "+i+" Distance: "+P[i].findDistance(x));
			if(P[i].findDistance(x)>max)
			{
				max = P[i].findDistance(x);
				maxIndex = i;
			}
		}
		return P[maxIndex];
	}
}