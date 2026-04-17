package java8enhancements.functionalinterfaces;

public class Demo {
	
	
	void greet(String name) {
		System.out.println(name+" Have a good day");
	}
	
	static void greetPerson(String name) {
		System.out.println(name+" Have a good day");
	}
	
	
	public static void main(String[] args) {
		
		Greeting myGreeting = (n)->System.out.println(n+", ! Hello");	
		myGreeting.sayHello("Raj");
		
		
		//instance reference
		Demo demo = new Demo();
		Greeting myGreeting1 = demo::greet;
		
		//static method referece
		Greeting myGreeting2 = Demo::greetPerson;
		myGreeting2.sayHello("Aankit");
		
	}

}
