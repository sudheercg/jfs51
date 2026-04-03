package java8enhancements.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIDemo {
	
	public static void main(String[] args) {
		
		//Step1: create a collection
		List<Integer> numberList=
				Arrays.asList(1,2,3,4,5,6);
		
		//create a stream object bu using stream()
		//numberList.stream();
		numberList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		
		
		System.out.println();
		List<String> namesList=
				Arrays.asList("Ali","Raj","Bose","Sravan","Catherine");
	     List<String> filteredNamesList=
			namesList.stream().filter(s->s.length()>3).collect(Collectors.toList());
		
	for(String  name:filteredNamesList) {
		System.out.println(name);
	}
	//forEach()
	
	}

}
