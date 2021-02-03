// Manoj Kumar Vemuri ID 2022213

//Course
import java.util.Vector;
import java.util.Enumeration;
public class Course{
 private String title;
 private Vector courseRecords();
 int highestScore = 0;
 String highestScoreName = ""; 
 
 Course(){courseRecords()=new Vector();}
  public string getTitle(){
    return title;
  }

  public void setTitle(String t){
    this.title=t;
  }

  public void addCourseRecord(CourseRecord c){
    courseRecords.addElement(c);
  }

  public Enumeration getCourseRecord;{
    return courseRecords.elements();
  }

  public void printCourseStudents(){
    for(CourseRecord c:courseRecords)
    {
      System.out.println(c.getStudent());
    }
  }
  int numOfStudents = courseRecords.size();
  public void printBestStudent(){
    for (int i = 0; i < numberOfStudents; i++) {
      if (score > highestScore)
			{
				highestScore = mark;
				highestScoreName = name;
			}
    }

  }

  public string printFinalExamStudents(){
    for(CourseRecord c:courseRecords)
       {
           if(c.canTakeFinalExam())
               System.out.println(c.toString());
       }
  }
}