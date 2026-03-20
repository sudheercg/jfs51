package com.codegnan.collectionsframework.setsdemo;

import java.util.Comparator;

public class IdComparator implements Comparator<Student2> {

	@Override
	public int compare(Student2 o1, Student2 o2) {
		return o1.id -o2.id;
	}

}
