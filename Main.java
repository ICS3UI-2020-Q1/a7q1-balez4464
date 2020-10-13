/**
 *This program uses a method to show your exam grade
 * @author Zachary Balean 
 */
public class Main {

  //method for exam grade
  public static void examGrade(int percentage){
    //prints for f
    if(percentage < 50){
      System.out.println("F");
      //prints for D
    } else if(percentage >= 50 && percentage <= 59){
      System.out.println("D");
      //prints for c
    } else if(percentage >= 60 && percentage <= 69){
      System.out.println("C");
      //prints for B
    } else if(percentage >= 70 && percentage <= 79){
      System.out.println("B");
      //prints for A
    } else if(percentage >= 80 && percentage <= 100){
      System.out.println("A");
    }
      
  }


  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // calls method
    examGrade(81);
    
  }
}
