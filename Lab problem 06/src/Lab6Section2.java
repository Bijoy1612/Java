
import java.util.Scanner;


public class Lab6Section2 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Student[] students = new Student[2];
        for(int i=0; i<students.length; i++)
        {
            System.out.println("Enter student ID, Name, CGPA");
            int id = input.nextInt();
            input.nextLine();
            String name = input.nextLine();
            double CGPA = input.nextDouble();
            students[i]= new Student (id, name, CGPA);
            System.out.println(students[i].toString());
        }
        
        System.out.println();
        Faculty[] faculties = new Faculty[2];
        for (int i=0; i<faculties.length; i++){
            System.out.println("Enter faculty ID, Name, Position");
            int id = input.nextInt();
            input.nextLine();
            String name = input.nextLine();
            String position = input.nextLine();
            faculties[i] = new Faculty(id, name, position);
            System.out.println(faculties[i].toString());
        }
        
        Course[] courses = new Course[1];
        System.out.println("\nInput course ID, Title and credit");
        for (int i=0; i<1; i++)
        {
            String ID = input.next();
            input.nextLine();
            String title = input.nextLine();
            double credit = input.nextDouble();
            courses[i] = new Course(ID, title, credit);
            System.out.println(courses[i].toString());
            courses[i].printStudentList();
            
            System.out.println("Adding 2 students");
            courses[i].addStudent(students[0]);
            courses[i].addStudent(students[1]);
            courses[i].printStudentList();
            
            System.out.println("Input student id to drop a student");
            int studentID = input.nextInt();
            courses[i].dropStudent(studentID);
            courses[i].printStudentList();
        }
        
    }
    
}
