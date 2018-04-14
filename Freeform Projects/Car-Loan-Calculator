public class CarLoan {
	public static void main(String[] args) {
  int carLoan = 10000;
  int loanLength = 3;
  //loan length of 3 years
  int interestRate = 5;
  //interest rate of 5 % on the loan
  int downPayment = 2000;
  // down payment by a user for this car purchase
  if (loanLength <= 0 || interestRate <= 0) {
    System.out.println("Error! You must take out a valid car loan.");
  } else if (downPayment >= carLoan){
    System.out.println("The car can be paid in full.");
  } else {
    int remainingBalance = carLoan - downPayment;
    int months = loanLength * 12;
    //converts the loan length from years to months
    int monthlyBalance = remainingBalance / months;
    //monthly payment without interest included
    int interest = (monthlyBalance * interestRate) / 100;
    //interest on the loan borrowed
   	int monthlyPayment = monthlyBalance + interest;
    System.out.println(monthlyPayment);   
  }
	}
}
