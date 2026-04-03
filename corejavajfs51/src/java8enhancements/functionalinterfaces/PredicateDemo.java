package java8enhancements.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateDemo {
	
	public static void main(String[] args) {
		
		// boolean test(T t);
		
		Predicate<Integer> isPositive=  num-> num>0;
		
		boolean result = isPositive.test(-19);
		if(result) {
			System.out.println("Positive Number");
		}else {System.out.println("Negative number");}
		
		Predicate<String> lengthGreaterthan5 = 
				str ->str.length()>5;
				
	   System.out.println(lengthGreaterthan5.test("Codegnan"));
		
		
		//String myString ="Codegnan is good";
	   //myString.contains("is good");
	   
	   Predicate<String> containsString =
			   str->str.contains("good");
			   
       System.out.println(containsString.test("India is good"));;
       
       Predicate<Integer> isEven = num -> num%2 ==0;
       
       System.out.println(isEven.test(31));
			   
       
       Predicate<Integer> isOdd = num -> num%2 !=0;
       System.out.println(isOdd.test(31));
    
       
       Predicate<String> combinedPredicate = 
    		   lengthGreaterthan5.and(containsString);
       
       System.out.println(combinedPredicate.test("Codegnan is good"));
	
       System.out.println(combinedPredicate.test("good"));

	
	
	
	}

}


//Create a Predicate which checks whether the given number is 
//   even or Odd
   
