package basics;

public class Weather {
 public static void main(String[] args) {

	 //Program to give suggestions of what to wear based on the weather temperature
	 
	 int temperature = 45;
	 String sunCondition = "Overcast";
	 
	 //Test the condition
	 if (temperature > 80) {
		 System.out.println("It's pleasant. Wear shorts and a t-shsirt");
	 }
	 //testing for two conditions using and (&&)
	 else if ((temperature > 60) &&  (sunCondition  != "Sunny")) {
		 System.out.println("It's a little cooler. Wearlong sleeves and jeans");
		 System.out.println("Wear a hat to keep the sun out");
	 }
	 else if ((temperature > 50) || (sunCondition == "Overcasst")) {
		 	 
	       System.out.println("Thiks is a cool day, make sure to wear warmer clothes");
	 }
	 else 
	 {
		 System.out.println("Looks like a cold day, bring a sweater");
	 }
	 
	 System.out.println("Program is ending");
	 
 }
}
