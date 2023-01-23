
public class Course {
    private String courseID;
    private String courseTitle;
    private double credit;
    private Student[] studentList = new Student[40];
    private int numberOfStudents;
    private Faculty faculty;
    
    Course(){
        this.numberOfStudents = 0;
    }
    Course(String courseID, String courseTitle, double credit){
        this.courseID = courseID;
        this.courseTitle = courseTitle;
        this.credit = credit;
        this.numberOfStudents = 0;
    }
    
    public String toString(){
        return this.courseID+" "+this.courseTitle+" "+this.credit+" ";
    }
    
    public void addStudent(Student S){
        this.studentList[this.numberOfStudents] = S;
        this.numberOfStudents++;
    }
    
    public void dropStudent(int studentID){
        boolean found=false;
        int index=0;
        for (int i=0; i<this.numberOfStudents; i++){
            if(studentID == studentList[i].getStudentID()){
                found = true;
                index = i;
            }  
        }
        if(found)
        {
            for(int i=index; i<this.numberOfStudents-1; i++){
                this.studentList[i] = this.studentList[i+1];
            }
            this.studentList[this.numberOfStudents] = null;
            this.numberOfStudents--;
        }
        else
            System.out.println("Student ID not found");
    }
    
    public void addFaculty(Faculty f){
        this.faculty = f;
    }
    public void dropFaculty(){
        this.faculty = null;
    }
    public void printStudentList(){
        System.out.println("Number of Students: "+this.numberOfStudents);
        for(int i=0;i<numberOfStudents;i++)
            System.out.println(this.studentList[i].toString());
    }
}
