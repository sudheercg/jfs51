package com.codegnan.collectionsframework.maps;

public class Student  {

    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Sorting based on id
	/*
	 * @Override public int compareTo(Student s) {
	 * 
	 * return this.id - s.id; }
	 */

    @Override
    public String toString() {
        return id + " " + name;
    }
}