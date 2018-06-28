package basics;

public class NumbersCalc {
  public static void main(String[] args) {
	  // all functional called from the main
	  	  displayName(); 
	  	  
	  //Numbers to be passed for addition method
	  	  int psdNumA = 10;
	  	  int psdNumB = 30;
	  	  addNumbers(psdNumA, psdNumB);
	  	  
	  //The multiplication of the numbers
	  	  int product = multiplyNumbers(psdNumA,psdNumB);
	  	  System.out.println("The Product of the multiplication processs is " + product);
  }
  //method / function to print name
   static void displayName() { 
	   System.out.println("The Name is Akwasi");
   }
  
  //method / function to add
  static void addNumbers(int recNumA, int recNumB) {
	  
	  int sum = recNumA + recNumB; 
	  System.out.println("The Sum of " + recNumA + " and " + recNumB + " is " + sum);
  }
  
  // method / function to return a value
     static int multiplyNumbers(int valueA, int valueB) {
    	 int product = valueA * valueB; 
     return product;
     }
  
}
