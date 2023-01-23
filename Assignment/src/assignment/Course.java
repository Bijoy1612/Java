
package assignment;


public class Course {
    private String courseID;
    private String courseTitle;
    private double credit;
    private Student[] studentList = new Student[40];
    private int numberOfStudents;
    private Faculty faculty;
    
    Course()
    {
        this.numberOfStudents = 0;
    }
    Course(String courseID, String courseTitle, double credit)
    {
        this.courseID = courseID;
        this.courseTitle = courseTitle;
        this.credit = credit;
        this.numberOfStudents = 0;
    }
    
    public String toString()
    {
        return this.courseID+"\t\t"+this.courseTitle+"\t\t"+this.credit+"\n";
    }
    
    public static int getNumberOfCourse(Course[] c)
    {
        int i=0;
        while(c[i]!=null)
            i++;
        return i;
    }
    
    public static void addCourse(Course[] c,String id, String title, double credit)
    {
        c[getNumberOfCourse(c)] = new Course(id, title, credit);
    }
    
    public static void printCourseList(Course[] c)
    {
        System.out.println("\nNumber of Courses : "+getNumberOfCourse(c));
        System.out.println("Course ID\tCourse Name\tCredits");
        for(int i=0;i<getNumberOfCourse(c);i++)
        {
            System.out.println(i+1+" "+c[i].toString());
        }
    }
    
    public String getCourseID()
    {
    	return this.courseID;
    }

    public static int searchCourse(Course[] c, String ID)
    {
    	int b=-1;
        boolean found = false;
        for (int i=0; i<getNumberOfCourse(c); i++){
            if(c[i].getCourseID().equals(ID)){
                found = true;
                b = i;
                break;
            }  
        }
        if(found)
            return b;
        else{
            return -1;
        }
    }
    
    public static void deleteCourse(Course[] c, String ID)
    {
        int b = searchCourse(c, ID);
        if(b!=-1)
        {
            for(int i=b; i<getNumberOfCourse(c)-1;i++)
                c[i]=c[i+1];
            c[getNumberOfCourse(c)-1]=null;
            System.out.println("Course delete\n");
        }
        else
        	System.out.println("Course ID Not found\n");
    }
}
