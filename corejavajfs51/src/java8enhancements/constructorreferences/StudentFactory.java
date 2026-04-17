package java8enhancements.constructorreferences;

@FunctionalInterface
public interface StudentFactory {
	
	Student create(String name);

}
