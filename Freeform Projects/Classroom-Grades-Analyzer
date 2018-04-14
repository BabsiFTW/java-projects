import java.util.ArrayList;

public class GradeAnalyzer { //class
  public GradeAnalyzer() { //class constructor 
  }
  ArrayList<Integer> grades = new ArrayList<Integer>();
  //ArrayList as Parameter for the getAverage method
  public int getAverage(ArrayList<Integer> grades) {
  // getAverage method which accepts ArrayList parameter that holds integers
    if (grades.size() < 1) {
  // calling the method size on the parameter grades and checking if the size of grades is less than 1
   	  System.out.println("Attention! ArrayList is empty!");
      //creating an Error message if the ArrayList is empty
      return 0;
    } else { //sum of all grades
      int sum = 0;
    for (Integer grade : grades) { //iterates through each grade in the grades ArrayList
      sum = sum + grade; //adds up all the grades
    }
    int average = sum / grades.size(); //calculating the average of the grades
    System.out.println(average); //prints out the average
    return average; //returns average
    }
  }
  
  public static void main(String[] args) { //main methode
    ArrayList<Integer> myClassroom = new ArrayList<Integer>(); //ArrayList object
    myClassroom.add(98);
    myClassroom.add(92);
    myClassroom.add(88);
    myClassroom.add(75);
    myClassroom.add(61);
    myClassroom.add(89);
    myClassroom.add(95);
    //adding the values in the ArrayList object "myClassroom"
    GradeAnalyzer myAnalyzer = new GradeAnalyzer(); //New GradeAnalyzer object called myAnalyzer
    myAnalyzer.getAverage(myClassroom); //calling the getAverage Method on myAnalyzer; specifing myClassroom as the parameter
  }
}
