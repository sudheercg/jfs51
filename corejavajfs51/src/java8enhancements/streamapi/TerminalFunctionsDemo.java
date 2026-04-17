package java8enhancements.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalFunctionsDemo {
	
	// Terminal functions are used to end the pipeline
	// They trigger the execution of intermediate functions
	// They return a result which can be a value, collection or void. 
	
  
	public static void main(String[] args) {
		
		 //forEach() - Its a terminal operation used to  Iterate the elements
		List<Integer> numbers = Arrays.asList(100,20,20,250,1,300,250);
		
		numbers.stream().forEach(n->System.out.println(n));
		
		//collect() - is a terminal operation used to convert stream to collection
	  List<Integer> numberList = numbers.stream()
			                     .filter(n->n%2!=0).collect(Collectors.toList());

	  //count() - count the elements in a collection
	 long oddNumbersCount = numbers.stream()
              .filter(n->n%2!=0).count();
	 
	 System.out.println(oddNumbersCount);
	 
	 //reduce() - It is a terminal operation used to combine all elements of a
	  //             stream into a single unit. 
	 
	int sum = List.of(1,2,3,4).stream().reduce(0, (a,b)-> a+b);
	System.out.println(sum);//10
	
	//findFirst() - Get the first element from stream
	
	System.out.println(numbers.stream().findFirst());
	  
	}
	
	
	
}
