/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.krisstelargueta.labweek1;

public class Car extends Vehicle{
    private String brand;

    public Car(int numberOfWheels , String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels , color, engineSize, fuelType);
        this.brand = brand;
    }
    
    public void setBrand (String brand){
        this.brand = brand;
    }
    
    public String getBrand () {
        return brand;
    }
    
    public String honk(){
        return"\"Honk, honk!\"";
    }
    
    @Override
    public String displayInfo () {
       return "Number of wheels: " + getNumberOfWheels() +"\nColor: "+ getColor() + "\nEngine Size: " + getEngineSize() + " liters" + "\nFuel Type: " + getFuelType() + "\nBrand: " + getBrand();
    }
}
