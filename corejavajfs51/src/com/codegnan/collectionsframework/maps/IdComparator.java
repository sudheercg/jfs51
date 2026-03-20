package com.codegnan.collectionsframework.maps;

import java.util.Comparator;

public class IdComparator implements Comparator<Student> {
	
	public int compare(Student s1,Student s2) {
		return Integer.compare(s2.id, s1.id);
	}

}
