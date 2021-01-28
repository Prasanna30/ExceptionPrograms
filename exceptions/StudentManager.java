package CoreJaveTest;

import java.io.FileNotFoundException;
import java.io.IOException;

import OopsConcepts.Student;

public class StudentManager {
	 
    public Student find(String studentID) throws StudentNotFoundException , StudentNameNullException {
        if (studentID.equals("123456")) {
            return new Student();
            
        } else {
        	if(studentID == null) {
        		throw new StudentNameNullException("Student name is null" + studentID);
        	}
            throw new StudentNotFoundException(
                "Could not find student with ID " + studentID);
        }

    }
}