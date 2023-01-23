
public class Faculty {
    private int facultyID;
    private String facultyName;
    private String facultyPosition;
    
    Faculty(){};
    Faculty(int facultyID, String facultyName, String facultyPosition){
        this.facultyID = facultyID;
        this.facultyName = facultyName;
        this.facultyPosition = facultyPosition;
    }
    
    public String toString(){
        return this.facultyID+" "+this.facultyName+" "+this.facultyPosition;
    }
}
