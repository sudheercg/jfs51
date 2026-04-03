package java8enhancements.functionalinterfaces;

@FunctionalInterface
interface FunctionalInterface1 {
	
	public void abstractMethod();
	
	//public void abstractMethod1();
	
	default void defaultMethod() {
		System.out.println("Default Method body");
	}
	default void defaultMethod1() {
		System.out.println("Default Method body");
	}
	
	public static void staticMethod() {
		System.out.println("static method body");
	}
	
	public static void staticMethod1() {
		System.out.println("static method body");
	}
	

}
