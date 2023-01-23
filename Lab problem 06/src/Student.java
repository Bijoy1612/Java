
public class Student {
    private int studentID;
    private String studentName;
    private double CGPA;
    
    Student(){};
    Student(int studentID, String studentName, double CGPA){
        this.studentID = studentID;
        this.studentName = studentName;
        this.CGPA = CGPA;
    }
    
   public String toString(){
       return this.studentID+" "+this.studentName+" "+this.CGPA;
   }
   
   public int getStudentID(){
       return this.studentID;
   }
}
