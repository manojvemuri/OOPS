// Manoj Kumar Vemuri ID 2022213

//CourseRecord 
import java.util.Vector;
import java.util.Enumeration;

public class CourseRecord{
  private Student student;
  private Vector assignments;
  CourseRecord(){assignments=new Vector<>();}
  public Student getStudent(){
    return student;
  }
  
  public void setStudent(Student s){
    student=s;
  }

  public void addAssignments(Assignment a){
    assignments.addElement(a);
  }

  public Enumeration getAssignments(){
    return assignments.elements();
  }

  public double average(){};

  boolean canTakeFinalExam();

}