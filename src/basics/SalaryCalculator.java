package basics;

public class SalaryCalculator {

	public static void main(String[] args) {
		// variable to define our career
		
		//Declare a variable and define
		String career;
		System.out.println("Program is starting");
		career = "Automation tester";
		System.out.println("My career is " + career);

		//Declare and Define variables
		int hourssPerWeek = 40;
		int weeksPeryear = 50;
		double rate = 42.50;
				
		// compute annual salary
		double salary = hourssPerWeek * weeksPeryear * rate ;
		System.out.println("My Salary as an " + career + " at the rate of £" + rate  + " per hour is £" + salary + " per year");
		// rate * hoursPerWeek * weeksPerYear

	}
}
