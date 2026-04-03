package java8enhancements.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateFunctionsDemo {
	
	public static void main(String[] args) {
		
		//filter() - Selects the elements based on a condition

		
		List<Integer> numbers = Arrays.asList(100,20,20,250,1,300,250);
		
		List<Integer> evenNumbers= numbers.stream().filter(n->n%2==0)
				  .collect(Collectors.toList());
		
		System.out.println(evenNumbers);
		
		//map: map() is used to transform each element
		
		List<String> namesList=
				Arrays.asList("Ali","Raj","Bose","Sravan","Catherine");
	     List<String> transformedNamesList=
			namesList.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println("TransformedNamesList: "+transformedNamesList);
		
		//sorted() is used to sort the lements of a collection. 
	    
		List<Integer> sortedList=numbers.stream()
                .sorted()
                 .collect(Collectors.toList());
		
		
		List<Integer> reversedSortedList=numbers.stream()
				                  .sorted(Comparator.reverseOrder())
				                   .collect(Collectors.toList());
		System.out.println(sortedList);
		System.out.println(reversedSortedList);
		
		//distinct - removes duplicate  elements
		List<Integer> uniqueNumbers=numbers.stream().
				                   distinct().collect(Collectors.toList());
		System.out.println(uniqueNumbers);
		
		//limit - restricts the number of elements
		List<Integer> limited=numbers.stream().
                limit(3).collect(Collectors.toList());
		
		System.out.println(limited);
		
		List<Integer> result= numbers.stream().filter(n->n%2==0).distinct().
				        map(n->n*10).sorted().collect(Collectors.toList());
		
		
	}
	
	

}
