package oop;

//blueprint or class for people

class Person{
	
	String name;
	String email;
	String phone;
	
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(email);
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
	
}


public class Demo22 {

	public static void main(String[] args) {
		// creating new people based on blue print
		
		//instantiating an object. i.e new variable person1, created out of class
		Person person1 = new Person();
		
		//define properties
		person1.name = "Mac";
		person1.email="mac@justmail.com";
		person1.phone="121548754545";
		
		//Abstraction (We might not want all the elements). I.E Get only the information we want from the object
		person1.walk();
		//person1.sleep();
		//person1.eat();
		
		Person person2 = new Person();
		person2.name="Sarah";
		
		person2.sleep();
		

	}

}
