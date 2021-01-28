package CoreJaveTest;

import java.beans.Statement;
import java.io.FileNotFoundException;

import OopsConcepts.Student;

public class StudentTest {
    public static void main(String[] args)  {
        StudentManager manager = new StudentManager();
 
        try {
 
            Student student = manager.find("123856");
            System.out.println("correct");
 
        } catch (StudentNotFoundException ex) {
            System.err.print(ex);
        }
        catch (StudentNameNullException ex) {
        	System.out.println(ex);
        }
        
    }
}
