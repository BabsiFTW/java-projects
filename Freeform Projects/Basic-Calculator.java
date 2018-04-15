public class Calculator { //public class
  public Calculator () { //class constructor
    
  }
  public int add(int a, int b){ //add method
    return (a + b);
  }
  public int substract(int a, int b) { //substract method
    return (a - b);
  }
  public int multiply(int a, int b) { //multiply method
    return (a * b);
  }
  public int divide(int a, int b) { //divide method
   //alternativ: public static int divide; aber nicht! void
    if (b == 0) {
      System.out.println("Error! Dividing by zero is not allowed.");
       	return 0;
    } else {
        return (a / b);
    }
  }
   public int modulo(int a, int b){ //modulo method
     //alternativ: public static int modulo; aber nicht! void
     if (b == 0) {
       System.out.println("Error! Dividing by zero is not allowed.");
       	return 0;
     } else {
       	return (a % b);       
     }
   	 }
     public static void main (String[] args) { //main method
       Calculator myCalculator = new Calculator(); //new Calculator object called myCalculator
       System.out.println(myCalculator.add(5,7)); //calling the add method on myCalculator
       System.out.println(myCalculator.substract(45, 11)); //calling the substract method on myCalculator
       
     }
  
}
