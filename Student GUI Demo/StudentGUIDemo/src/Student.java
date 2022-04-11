
public class Student {

    public Student(){} 
  
  
    private String studentID;
    private String studentName;
    private String studentSurname;
    private String studentAge;

    public Student(String studentID, String studentName, String studentSurname, String studentAge) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.studentAge = studentAge;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public String getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }
    
    
    
}
