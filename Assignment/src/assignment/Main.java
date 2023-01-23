
package assignment;

import java.util.Scanner;


public class Main 
{
    public static Scanner input = new Scanner(System.in);
    public static Student[] students = new Student[40];
    public static Course[] courses = new Course[40];
    public static Faculty[] faculties = new Faculty[40];

    public static void main(String[] args) 
    {
        while(true)
        {
            System.out.println("Welcome!!!\n");
            System.out.println("Press 1. Add\nPress 2. Delete\nPress 3. Update\nPress 4. Print\nPress 5. Search\nPress 0. Exit\n");
            System.out.println("Enter Your Choice: ");
            int a = input.nextInt();
            if(a==1)
            {
                add();
            }
            else if(a==2)
            {
                delete();
            }
            else if(a==3)
            {
                update();
            }
            else if(a==4)
            {
                print();
            }
            else if(a==5)
            {
                search();
            }
            else if(a==0)
            {
                exit();
            }
            else
                System.out.println("Invalid option! Please insert a valid option\n");     
        }
    } 
    public static void add()
    {
        while(true)
        {
            System.out.println("Press 1. Add a Student\nPress 2. Add a Course\nPress 3. Add a Faculty\nPress 0. Return to main menu");
            System.out.println("Enter Your Choice: ");
            int a = input.nextInt();
            if(a == 1)
            {
                addStudent();
            }
            else if(a==2)
            {
                addCourse();
            }
            else if(a==3)
            {
                addFaculty();
            }
            else if (a==0)
                return;
            else 
                System.out.println("Invalid input! Please insert a valid option\n");
        }
    }
    
    public static void delete()
    {
        while(true)
        {
            System.out.println("Press 1. Delete Student\nPress 2. Delete Faculty\nPress 3. Delete Course\nPress 4. Drop a student from a course\nPress 5. Drop a faculty from a course\nPress 0. Return to main menu");
            System.out.println("Enter Your Choice: ");
            int a = input.nextInt();
            if(a==1)
            {
                deleteStudent();
            }
            else if(a==2)
            {
                deleteFaculty();
            }
            else if(a==3)
            {
                deleteCourse();
            }
            else if(a==4)
            {
                dropStudent();
            }
            else if(a==5)
            {
                dropFaculty();
            }
            else if(a==0)
                return;
            else
                System.out.println("Invalid input! Please insert a valid option\n");
        }
    }

    public static void update() 
    {
        while(true)
        {
            System.out.println("Press 1. Update Student\nPress 2. Update Faculty\nPress 3. Update Course\nPress 0. Return to main menu");
            System.out.println("Enter Your Choice: ");
            int a = input.nextInt();
            if(a==1)
            {
                updateStudent();
            }
            else if(a==2)
            {
                updateFaculty();
            }
            else if(a==3)
            {
                updateCourse();
            }
            else if(a==0)
                return;
            else
                System.out.println("Invalid input! Please insert a valid option\n");
        }
    }
    
    public static void print()
    {
        while(true)
        {
            System.out.println("Press 1. Print all students\nPress 2. Print all course\nPress 3. Print all faculties\nPress 4. Print information of a student\nPress 5. Print information of a course\nPress 6. Print information of a faculty\nPress 7. Print student list and faculty information of a course\nPress 8. Print courses taken by a student\nPress 0. Return to main menu");
            System.out.println("Enter Your Choice: ");
             int a = input.nextInt();
             if(a==1)
             {
                 printallStudents();
             }
             else if(a==2)
             {
                 printallCourse();
             }
             else if(a==3)
             {
                 printallFaculties();
             }
             else if(a==4)
             {
                 printinfoofStudent();
             }
             else if(a==5)
             {
                 printinfoofCourse();
             }
             else if(a==6)
             {
                 printinfoofFaculty();
             }
             else if(a==7)
             {
                 printStudentFacultyinfo();
             }
             else if(a==8)
             {
                 printCoursetakenbyStudent();
             }
             else if(a==0)
                 return;
             else
                 System.out.println("Invalid input! Please insert a valid option\n");
        }
    }
    
    public static void search()
    {
        while(true)
        {
            System.out.println("Press 1. Search a Student\nPress 2. Search a Course\nPress 3. Search a Faculty\nPress 4. Search whether a student takes a course\nPress 5. Search whether a faculty teaches a course\nPress 6. Search courses taken by a student\nPress 7. Search courses taught by a faculty\nPress 0. Return to main menu");
            System.out.println("Enter Your Choice: ");
            int a = input.nextInt();
             if(a==1)
             {
                 searchStudents();
             }
             else if(a==2)
             {
                 searchCourse();
             }
             else if(a==3)
             {
                 searchFaculty();
             }
             else if(a==4)
             {
                 searchStudenttakesCourse();
             }
             else if(a==5)
             {
                 searchFacultyteachCourse();
             }
             else if(a==6)
             {
                 searchCoursestakenStudent();
             }
             else if(a==7)
             {
                 searchCoursestaughtFaculty();
             }
             else if(a==0)
                 return;
             else
                 System.out.println("Invalid input! Please insert a valid option\n");
        }
    }
    
    public static void exit()
    {
        System.out.println("Thank you for using this application.\n");
        System.exit(0);
    }

    public static void addStudent()
    {
    System.out.println("Input Student ID, Name and CGPA");
    int id = input.nextInt();
    input.nextLine();
    String name = input.nextLine();
    double cgpa = input.nextDouble();
    Student.addStudent(students,id,name,cgpa);
    System.out.println("Student added\n");
    }
    
    public static void addCourse()
    {
        System.out.println("Input Course ID, Title and Credits");
        String id = input.next();
        input.nextLine();
        String title = input.nextLine();
        double credits = input.nextDouble();
        Course.addCourse(courses,id,title,credits);
        System.out.println("Course added\n");
    }
    
    public static void addFaculty()
    {
        System.out.println("Input Faculty ID, Name and Position");
        int id = input.nextInt();
        input.nextLine();
        String name = input.nextLine();
        String position = input.nextLine();
        Faculty.addFaculty(faculties,id,name,position);
        System.out.println("Faculty added\n");
    }
    
    public static void deleteStudent()
    {
        System.out.println("Enter Student ID ");
        int id = input.nextInt();
        Student.deleteStudent(students,id);
    }
    
    public static void deleteFaculty()
    {
        System.out.println("Enter Faculty ID");
        int id = input.nextInt();
        Faculty.deleteFaculty(faculties,id);
    }
    
    public static void deleteCourse()
    {
        System.out.println("Enter Course ID ");
        String id = input.next();
        Course.deleteCourse(courses,id);
    }
    
    public static void dropStudent() 
    {
        
    }

    public static void dropFaculty() 
    {
        
    }

    public static void updateStudent() 
    {
        
    }

    public static void updateFaculty() 
    {
        
    }

    public static void updateCourse() 
    {
        
    }

    public static void printallStudents() 
    {
        Student.printStudentList(students);
    }

    public static void printallCourse()
    {
       Course.printCourseList(courses);
    }

    public static void printallFaculties() 
    {
       Faculty.printFacultyList(faculties);
    }

    public static void printinfoofStudent() 
    {
        System.out.println("Enter Student ID:");
        int id = input.nextInt();
        int i = Student.searchStudent(students,id);
        if(i==-1)
            System.out.println("Student ID not found\n");
        else
        {
            System.out.println("ID\tName\t\tCGPA");
            System.out.println(students[i].toString());
        }
    }

    public static void printinfoofCourse() 
    {
        System.out.println("Enter Course ID:");
        String id = input.next();
        int i = Course.searchCourse(courses,id);
        if(i==-1)
            System.out.println("Course not found\n");
        else
        {
            System.out.println("ID\tName\t\tCredit");
            System.out.println(courses[i].toString());
        }
    }

    public static void printinfoofFaculty() 
    {
        System.out.println("Enter Faculty ID:");
        int id = input.nextInt();
        int i = Faculty.searchFaculty(faculties,id);
        if(i==-1)
            System.out.println("Faculty ID not found");
        else
        {
            System.out.println("ID\tName\tPosition");
            System.out.println(faculties[i].toString());
        }
    }

    public static void printStudentFacultyinfo() 
    {
        
    }

    public static void printCoursetakenbyStudent() 
    {
        
    }

    public static void searchStudents() 
    {
        System.out.println("Enter Student ID");
        int id = input.nextInt();
        int b = Student.searchStudent(students, id);
        if(b==-1)
            System.out.println("Student ID not found\n");
        else
        {
            System.out.println("ID\tStudent Name\tCGPA");
            System.out.println(students[b].toString());
        }
    }

    public static void searchCourse() 
    {
        System.out.println("Input Course ID");
        String id = input.next();
        int index = Course.searchCourse(courses, id);
        if(index==-1)
            System.out.println("Course not found");
        else
        {
            System.out.println("Course ID\tTitle\tCredits");
            System.out.println(courses[index].toString());
        }
           
    }

    public static void searchFaculty() 
    {
        System.out.println("Enter Faculty ID");
        int id = input.nextInt();
        int b = Faculty.searchFaculty(faculties, id);
        if(b==-1)
            System.out.println("Faculty not found\n");
        else
        {
            System.out.println("ID\tName\t Position");
            System.out.println(faculties[b].toString());
        }
    }

    public static void searchStudenttakesCourse()
    {
        
    }

    public static void searchFacultyteachCourse() 
    {
        
    }

    public static void searchCoursestakenStudent() 
    {
        
    }

    public static void searchCoursestaughtFaculty() 
    {
        
    }  
}