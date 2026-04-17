package java8enhancements.methodreferences;

import java.util.function.Consumer;

public class Utility {
	
	
	//static method
	public static void greet(String name) {
		System.out.println("Hello "+name);
	}

	
	//instance method
	public void toUpper(String text) {
		System.out.println(text.toUpperCase());
	}
	
	public static void main(String[] args) {
		
		Consumer<String> ref= Utility::greet;
		ref.accept("Java Student");
		
		Utility utility = new Utility();
		Consumer<String> ref1 = utility::toUpper;
		ref1.accept("codegnan");
	
	}
}
