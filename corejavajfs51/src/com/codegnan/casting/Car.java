package com.codegnan.casting;

public class Car extends Vehicle{
	
	
	String name ; 
	String engineType;
	
	
	
	public Car(String name, String engineType) {
		super();
		this.name = name;
		this.engineType = engineType;
	}
	
	public void engineType() {
		System.out.println(engineType);
	}
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEngineType() {
		return engineType;
	}



	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}







	public void carName() {
		System.out.println(name);
	}

	
	
}
