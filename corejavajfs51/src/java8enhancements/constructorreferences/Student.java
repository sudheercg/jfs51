package java8enhancements.constructorreferences;

public class Student {
	
	String name; 
	
	Student(String name){
		this.name= name;  
	}

	void display() {
		System.out.println("Name: "+name);
	}
	
	public static void main(String[] args) {
		
		StudentFactory factory = name ->new Student(name);
		Student s1=factory.create("Raj");
		s1.display();
		
		StudentFactory factory1 = Student::new;
		Student s2= factory1.create("Sunny");
		s2.display();
		
		
		
	}
}
