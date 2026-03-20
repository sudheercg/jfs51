package com.codegnan.package1;

public class SamePackageChild extends Parent {
	
	public static void main(String[] args) {
		
		SamePackageChild spc = new SamePackageChild();
		System.out.println(spc.defaultVar);
		System.out.println(spc.protectedVar);
		
	}

}
