package java8enhancements.functionalinterfaces;

import java.util.function.Function;

public class FunctionDemo {
	
	public static void main(String[] args) {
		
		Function<String,Integer> stringLengthFunction =
				str->str.length();
				
	   System.out.println(stringLengthFunction.apply("Hyderabad"));
		
		Function<String,String> stringCaseConversion=
				str1->str1.toUpperCase();
	
		System.out.println(stringCaseConversion.apply("java"));
		
		
		Function<Integer,Integer> multiplyBy2 = num->num*2;
		System.out.println(multiplyBy2.apply(10));
		
		Function<Integer,Integer> add10= num->num+10;
		System.out.println(add10.apply(10));
		
		//andThen
		Function<Integer,Integer> multiplyThenAdd=
				multiplyBy2.andThen(add10);
		System.out.println(multiplyThenAdd.apply(2));
		
		
		//compose
		Function<Integer,Integer> addThenMultiply=
				multiplyBy2.compose(add10);
		System.out.println(addThenMultiply.apply(2));
		
		
	}

}
