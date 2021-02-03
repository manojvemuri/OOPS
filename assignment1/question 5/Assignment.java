// Manoj Kumar Vemuri ID 2022213

// the assignment class

public class Assignment{

  private double mark;

  public double getmark(){
    
    return mark;
  }
  
  public void setmark(Double mark){
    this.mark=mark;
  }
  @Override
  public String toString(){
    return "Assignment[mark"+mark+"]";
  }
  }

