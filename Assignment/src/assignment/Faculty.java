
package assignment;


public class Faculty {
    private int facultyID;
    private String facultyName;
    private String facultyPosition;
    
    Faculty(){};
    Faculty(int facultyID, String facultyName, String facultyPosition)
    {
        this.facultyID = facultyID;
        this.facultyName = facultyName;
        this.facultyPosition = facultyPosition;
    }
    
    public String toString()
    {
        return this.facultyID+"\t"+this.facultyName+"\t "+this.facultyPosition+"\n";
    }
    public static int getNumberOfFaculty(Faculty[] f)
    {
        int i=0;
        while(f[i]!=null)
            i++;
        return i;
    }

    public static void addFaculty(Faculty[] f,int ID, String name, String position)
    {
        f[getNumberOfFaculty(f)] = new Faculty(ID, name, position);
    }
    
    public static void printFacultyList(Faculty[] f)
    {
        System.out.println("\nNumber of Faculties : "+getNumberOfFaculty(f));
        System.out.println("ID\tName\t Position");

        for(int i=0;i<getNumberOfFaculty(f);i++){
            System.out.println(i+1+" "+f[i].toString());
        }
    }
    
    public int getFacultyID()
    {
        return this.facultyID;
    }
    
    public static int searchFaculty(Faculty[] F, int facultyID)
    {
        int b=-1;
        boolean found = false;
        for (int i=0; i<F.length; i++)
        {
            if(facultyID == F[i].getFacultyID())
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
    
    public static void deleteFaculty(Faculty[] f, int ID)
    {
        int b = searchFaculty(f,ID);
        if(b!=-1)
        {
            for(int i=b; i<getNumberOfFaculty(f)-1;i++)
                f[i]=f[i+1];
            f[getNumberOfFaculty(f)-1]=null;
            System.out.println("Faculty succesfully delete\n");
        }
        else
        {
            System.out.println("Faculty ID not found\n");   
        }
    }
}

