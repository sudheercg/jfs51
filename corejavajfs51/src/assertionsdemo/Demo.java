package assertionsdemo;

/*
 * Syntax: assert condition
 * assert condition: "Error Message";
 */
public class Demo {
	
	//without assert
	 int calculateYearOfBirth(int age) {
		return 2026 -age;
	}
	 
	 int calculateYearOfBirthWithAssert(int age) {
		assert age>=0:"Age cannot be negative";	
		 return 2026 -age;
		}
	 
	 
	 
	 public static void main(String[] args) {
		Demo d = new Demo();
		//System.out.println(d.calculateYearOfBirth(50));
		//System.out.println(d.calculateYearOfBirth(-5));
		System.out.println(d.calculateYearOfBirthWithAssert(-5));
		
	}

}
