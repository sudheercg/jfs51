package java8enhancements.functionalinterfaces;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {

	
	public static void main(String[] args) {
		
		
		Supplier<Integer> randomNumberSupplier=
				()-> new Random().nextInt(100);
				
				
     System.out.println("Random  Number between 0-100: "+randomNumberSupplier.get());				
	}
	
	
}
