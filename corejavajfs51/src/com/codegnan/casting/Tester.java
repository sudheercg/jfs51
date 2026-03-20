package com.codegnan.casting;

public class Tester {

    public static void main(String[] args) {

        System.out.println("*** 1. Parent reference → Parent object ***");

        Vehicle v = new Vehicle();      
        // Reference type  : Vehicle
        // Object created  : Vehicle
        // Method call     : Vehicle.engineType()

        v.engineType();  
        // Output: Generic Car Engine



        System.out.println("\n*** 2. Parent reference → Child object (Upcasting) ***");

        Vehicle vc = new Car("Ford", "Diesel");  
        // Reference type  : Vehicle
        // Object created  : Car
        // This is UPCASTING (implicit, safe)

        vc.engineType();  
        // Method call decided at RUNTIME
        // If Car overrides engineType(), Car's method will be called
        // Else, Vehicle's method is called



        System.out.println("\n*** 3. Child reference → Child object ***");

        Car car = new Car("Ford", "Diesel");
        // Reference type  : Car
        // Object created  : Car

        car.engineType();  
        // Car does NOT override engineType()
        // So Vehicle.engineType() is executed
        // Output: Generic Car Engine



        /*
        System.out.println("\n*** INVALID DOWNCAST ***");

        Car c = (Car) v;  
        // v points to a Vehicle object, NOT a Car object
        // Runtime error: ClassCastException
        */



        System.out.println("\n*** 4. Downcasting: Parent reference → Child reference ***");

        Car c = (Car) vc;  
        // vc actually refers to a Car object
        // Downcasting is VALID here

        c.engineType(); 
        c.carName();
        
        // Method execution depends on actual object (Car)
        // Since Car does not override, Vehicle.engineType() runs
    }
}
