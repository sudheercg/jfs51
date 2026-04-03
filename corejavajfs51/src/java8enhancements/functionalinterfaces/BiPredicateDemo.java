package java8enhancements.functionalinterfaces;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
	
	public static void main(String[] args) {
		
		// take twp strings an d check whether 
		// the first character of both Strings are same or not. 
		
		BiPredicate<String,String> firstCharEquals= (str1,str2)->{
			char char1 = str1.charAt(0);
			char char2 = str2.charAt(0);
			
			return char1==char2; 
			
		};
		
		String str1="Apple";
		String str2="Apricot";
		String str3="Banana";
		
		System.out.println(firstCharEquals.test(str1, str3));
		
		
		
		
	}

}
