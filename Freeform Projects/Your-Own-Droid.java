/*
Robotic vacuum cleaner which you can:
1. activate with a method
2. charge its battery
3. check the battery level
4. make him hover!
*/
public class Droid { //public class
  int batteryLevel;//instance variable
  public Droid() { //class constructor
    batteryLevel = 100;
    //everytime a Droid is created, its battery level will be at 100 percent
  }
  public void activate() { //activate method
    System.out.println("Activated. How can I help you?");
    batteryLevel = batteryLevel - 5;
  // decrease battery level by 5 %
  	System.out.println("Battery level is: " + batteryLevel + " percent.");
  }
  
 public void chargeBattery(int hours) { //chargeBattery method
  batteryLevel = batteryLevel + hours; //increase of battery level based on the hours charging
  System.out.println("Droid charging...");
  if (batteryLevel > 100) {
    batteryLevel = 100; //Battery is full
    System.out.println("Battery level is: " + batteryLevel + " percent.");
  }else {
    System.out.println("Battery level is: " + batteryLevel + " percent.");
  }
 }
public int checkBatteryLevel() { //checkBatteryLevel method
  System.out.println(batteryLevel);
  return batteryLevel;
}  
public void hover(int feet) { //hover method
  if (feet > 2) {
    System.out.println("Error! I cannot hover above 2 feet.");
  }else {
    System.out.println("Hovering...");
    batteryLevel = batteryLevel - 20;
    System.out.println("Battery level is: " + batteryLevel + " percent.");
  }
}
public static void main(String[] args) { //main method
  Droid roomba = new Droid();
  roomba.activate();
  roomba.chargeBattery(5);
  roomba.hover(2);
}
}
