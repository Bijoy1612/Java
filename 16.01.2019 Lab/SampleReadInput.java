import java.util.Scanner;
class SampleReadInput{
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		System.out.println("Enter Your Name : ");
		String name = input.next();
		System.out.println("Enter Your Age : ");
		int age = input.nextInt();
		System.out.println("Enter Your CGPA : ");
		double cgpa = input.nextDouble();
		System.out.println("Enter Your Department : ");
		input.nextLine();
		String department = input.nextLine();
		System.out.printf("Your Name : %s\n", name);
		System.out.printf("Your Age : %d\n", age);
		System.out.printf("Your CGPA : %f\n", cgpa);
		System.out.printf("Your Department : %s\n", department);
	}
}