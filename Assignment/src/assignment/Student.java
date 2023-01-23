
package assignment;


public class Student {
    private int studentID;
    private String studentName;
    private double CGPA;
    
    Student(){};
    Student(int studentID, String studentName, double CGPA)
    {
        this.studentID = studentID;
        this.studentName = studentName;
        this.CGPA = CGPA;
    }
    
    public String toString()
    {
         return this.studentID+"\t"+this.studentName+"\t\t"+this.CGPA+"\n";
    }
    
    public static int getNumberOfStudents(Student[] s)
    {
        int i=0;
        while(s[i]!=null)
            i++;
        return i;
    }
    
    public static void addStudent(Student[] s,int ID, String name, double CGPA)
    {
        s[getNumberOfStudents(s)] = new Student(ID, name, CGPA);
    }
    
    public static void printStudentList(Student[] s)
    {
        System.out.println("\nNumber of Students : "+getNumberOfStudents(s));
        System.out.println("ID\tStudent Name\tCGPA");

        for(int i=0;i<getNumberOfStudents(s);i++){
            System.out.println(i+1+" "+s[i].toString());
        }
    }
    public int getStudentID()
    {
        return this.studentID;
    }
    
    public static int searchStudent(Student[] s, int studentID)
    {
        int b=-1;
        boolean found = false;
        for (int i=0; i<getNumberOfStudents(s); i++)
        {
            if(studentID == s[i].getStudentID())
            {
                found = true;
                b = i;
                break;
            }  
        }
        if(found)
            return b;
        else
        {
            return -1;
        }
    }
    public static void deleteStudent(Student[] s,int ID)
    {
        int b = searchStudent(s, ID);
        if(b!=-1)
        {
            for(int i=b; i<getNumberOfStudents(s)-1;i++)
                s[i]=s[i+1];
            s[getNumberOfStudents(s)-1]=null;
            System.out.println("Student succesfully delete\n");
        }
        else
            System.out.println("Student ID not found\n");
    }
    
}
