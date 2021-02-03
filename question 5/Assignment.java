// Manoj Kumar Vemuri ID 2022213

// the assignment class

public class Assignment{

  private double mark;
  double mark=-1;
Assignment(){}
  public double getmark throws NotYetSetException(){
    if (mark==-1){
      throw new NotYetSetException("Mark is not yet set.")
    }
    
    return mark;
  }
  
  public void setmark(int m){
    this.mark=m;
  }

