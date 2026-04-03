package java8enhancements.functionalinterfaces;

@FunctionalInterface
public interface Calculator {
	
	int calculate(int a , int b);

    default void showOperation() {
    	System.out.println("Thisis a calculator operation");
    }
    
    static void displayWelcome() {
    	System.out.println("Welcome to calculator interface");
    }

}
