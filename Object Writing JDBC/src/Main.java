
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eram
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        ArrayList<Person> persons = new ArrayList<>();
        /*FileOutputStream outstream = new FileOutputStream("out.dat");
        ObjectOutputStream out = new ObjectOutputStream(outstream);
        Person p1 = new Person(1, "Meison", 19);
        Person p2 = new Person(2, "Jim", 20);
        Person p3 = new Person(3, "Robert", 16);
        out.writeObject(p1);
        out.writeObject(p2);
        out.writeObject(p3);
        out.close();*/
        
        FileInputStream inStream = new FileInputStream("out.dat");
        ObjectInputStream in = new ObjectInputStream(inStream);
        persons.add((Person)in.readObject());
        persons.add((Person)in.readObject());
        persons.add((Person)in.readObject());
        
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/db0","root","");
        Statement st = connection.createStatement();
        
        for (int i = 0; i < persons.size(); i++) {
            int id = persons.get(i).getId();
            String name = persons.get(i).getName();
            int age = persons.get(i).getAge();
            
            st.executeUpdate("INSERT INTO person Values ("+id+", '"+name+"', "+age+")");
        }
        
        
    }
    
}
