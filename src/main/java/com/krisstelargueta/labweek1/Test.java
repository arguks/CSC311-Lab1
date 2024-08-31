
package com.krisstelargueta.labweek1;

public class Test {
    
    public static void main(String[] args) {
       Vehicle vehicle = new Vehicle(16, "White", 12.7f, "Disel");
       Car car = new Car(4, "Red", 2f, "Premium", "Mazda");
    
        System.out.println(vehicle.displayInfo());
        System.out.println("");
        System.out.println(car.displayInfo());
        System.out.println("");
        System.out.println(car.honk());
        System.out.println("");
        
        vehicle.setColor("Black");
        vehicle.setNumberOfWheels(18);
        vehicle.setEngineSize(14.8f);
        vehicle.setFuelType("Regular");
        
        car.setColor("Blue");
        car.setNumberOfWheels(5);
        car.setEngineSize(1.5f);
        car.setFuelType("Regular");
        car.setBrand("Toyota");
        
        System.out.println(vehicle.displayInfo());
        System.out.println("");
        System.out.println(car.displayInfo());
    
    }
 
}
