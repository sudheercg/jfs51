package com.codegnan.dsl.example;
class Query {

    public Query select(String fields) {
        System.out.println("SELECT " + fields);
        return this;
    }

    public Query from(String table) {
        System.out.println("FROM " + table);
        return this;
    }

    public Query where(String condition) {
        System.out.println("WHERE " + condition);
        return this;
    }
    
    public static void main(String[] args) {
    	new Query()
        .select("*")
        .from("users")
        .where("age > 18");

	}
}
