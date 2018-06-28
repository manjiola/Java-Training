package basics;

public class Days {
	public static void main(String[] args) {
		//Execute different block of code  based on value of condition (Switch)
		//Switch statement has one block and different cases
		
		String dayOfWeek = "Tuesday";
		
		switch (dayOfWeek) {
		case "Monday" : 
			System.out.print("Today is Monday");
			break;
		case "Tuesday" : 
			System.out.print("Today is Tuesday");
			break;
		case "Wednesday" : 
			System.out.print("Today is Wednesday");
			break;
		case "Thursday" : 
			System.out.print("Today is Thursday");
			break;
		case "Friday" : 
			System.out.print("Today is Friday");
			break;
		}
	}
}
