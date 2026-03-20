package com.codegnan.collectionsframework.wrappergenerics;

public class Main {
	
	public static void main(String[] args) {
		/*
		IntegerPrinter iPrinter = new IntegerPrinter(199);
		iPrinter.print();
		
		DoublePrinter dPrinter = new DoublePrinter(29.567);
		dPrinter.print();
		
		StringPrinter sPrinter = new StringPrinter("Codegnan");
		sPrinter.print();
		*/
		
		Printer<String> sPrinter = new Printer<>("Hyderabad");
		sPrinter.print();
		
		Printer<Integer> iPrinter = new Printer<>(22);
		iPrinter.print();
		
		Printer<Double>  dPrinter = new Printer<>(23.456);
		dPrinter.print();
		
		MultiPrinter<Double, Character> mp = new MultiPrinter<>(10.78,'S');
		mp.print();
		
	}

}
