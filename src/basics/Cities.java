package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define and array
		String[] cities = {"New York", "Jo-Burg","Miami", "Accra"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		System.out.println("*****************");
		
		int ctCount = 0;
		while (ctCount < 4) {
			System.out.println("CITY:  " + cities[ctCount]);
			ctCount++; //same as count = count t + 1
		}
		
		
		System.out.println("*****************");
	
		//Declare the array
		String[] countries = new String[5];
		countries[0] = "USA";
		countries[1] = "Ghana";
		countries[2] = "Russia";
		countries[3] = "Senegal";
		countries[4] = "China";
		System.out.println("&&*^&*(&(*&%$^%$^%^%");
		
		
	//Declare the array
	String[] states = new String[5];
	states[0] = "Califonia";
	states[1] = "Wyoming";
	states[2] = "New York";
	states[3] = "Texas";
	states[4] = "Maryland";
	// Do loop enters the loop THEN test condition
	int i = 0;
	do {
		System.out.println("STATE:  " + states[i]);
		i = i + 1;
	}while (i < 5);
	System.out.println("&&*^&*(&(*&%$^%$^%^%");
	System.out.println("&&*^&*(&(*&%$^%$^%^%");
	
	
	//Declare the array
		String[] fruits = new String[5];
		fruits[0] = "Banana";
		fruits[1] = "Wango";
		fruits[2] = "Guava";
		fruits[3] = "Apple";
		fruits[4] = "Orange";
	System.out.println("PRINT WITH FOR LOOP");
	
	//For loop: best structure for iterating through and array
	for (int x = 0; x < 5; x++) {
		System.out.println("FRUITS:  " + fruits[x]);
	}
		
	}

}
