package com.codegnan.package2;

import com.codegnan.package1.Parent;

public class DifferentPackageChild extends Parent{
	
	public static void main(String[] args) {
		
		DifferentPackageChild dpc= new DifferentPackageChild();
		//System.out.println(dpc.defaultVar);
		System.out.println(dpc.protectedVar);
	}

}
