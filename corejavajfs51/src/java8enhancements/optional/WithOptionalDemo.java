package java8enhancements.optional;

import java.util.Optional;

public class WithOptionalDemo {

	
	public static void main(String[] args) {
		String names[] = new String[5];
		names[2]="Raj";
		
		//Create an Optional object
		Optional<String> optName = Optional.ofNullable(names[2]);
		
		//check the presence of object
		optName.ifPresent(n->System.out.println("Name at index 2: "+names[2]));
		
		
		Optional<String> optNameAt4= Optional.ofNullable(names[4]);
		
		String result = optNameAt4.orElse("Default value");
		
		System.out.println("Name at index 4: "+ result);
		
		
		/*Output: 
		 * Name at index 2: Raj 
		 * Name at index 4: Default value
		 */
		
		
		
		}


}
