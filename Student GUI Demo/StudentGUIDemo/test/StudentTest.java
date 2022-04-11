/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author david
 */
public class StudentTest {
    
    public StudentTest() {
    }

    
    //TESTING FOR GETTERS 

    @Test
     public void testgetStudentID() {
         fail("The test case is empty");
      
         //info for the tester
         System.out.println("getStudentId Method testing");
         
         //create an instance
         Student instance = new Student("1","David","McClung","30");
         //expected result
         String expectedResult = "1";
         //actual result 
         String result = instance.getStudentID();
         //compare the results
         assertEquals(expectedResult,result);
         
    }

        
 
    @Test
    public void testgetStudentName() {
        
           fail("The test case is empty");
      
         //info for the tester
         System.out.println("getStudentName Method testing");
         
         //create an instance
         Student instance = new Student("1","David","McClung","30");
         //expected result
         String expectedResult = "David";
         //actual result 
         String result = instance.getStudentName();
         //compare the results
         assertEquals(expectedResult,result);
       
    }

  

    @Test
    public void testgetStudentSurname() {
        
         fail("The test case is empty");
      
         //info for the tester
         System.out.println("getStudentSurname Method testing");
         
         //create an instance
         Student instance = new Student("1","David","McClung","30");
         //expected result
         String expectedResult = "McClung";
         //actual result 
         String result = instance.getStudentSurname();
         //compare the results
         assertEquals(expectedResult,result);
      
    }

  
    
    @Test
    public void testgetStudentAge() {
        
        fail("The test case is empty");
      
         //info for the tester
         System.out.println("getStudentSurname Method testing");
         
         //create an instance
         Student instance = new Student("1","David","McClung","30");
         //expected result
         String expectedResult = "30";
         //actual result 
         String result = instance.getStudentAge();
         //compare the results
         assertEquals(expectedResult,result);
      
    }

    //TESTING FOR SETTERS

       @Test
     public void testsetStudentID() {
         fail("The test case is empty");
      
         //info for the tester
         System.out.println("getStudentId Method testing");
         
         //value to send
         String studentId = "1";
         
         
         //create an instance
         Student instance = new Student("1","David","McClung","30");
         instance.setStudentID(studentId);
         
    }
    
    
    
    
}
