package com.codegnan.collectionsframework.setsdemo;

class Student2 {

    int id;
    String name;

    Student2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Student2 s) {
        return this.id - s.id;
    }

    public String toString() {
        return id + " " + name;
    }
}