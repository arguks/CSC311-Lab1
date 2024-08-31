/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.krisstelargueta.labweek1;

public class Car extends Vehicle{
    //attributes
    private String brand;
    //constructor
    public Car(int numberOfWheels , String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels , color, engineSize, fuelType);
        this.brand = brand;
    }
    //set method
    public void setBrand (String brand){
        this.brand = brand;
    }
    //get method
    public String getBrand () {
        return brand;
    }
    //Honk method
    public String honk(){
        return"\"Honk, honk!\"";
    }
    //override the displayInfo method from vehicle class
    @Override
    public String displayInfo () {
       return "Number of wheels: " + getNumberOfWheels() +"\nColor: "+ getColor() + "\nEngine Size: " + getEngineSize() + " liters" + "\nFuel Type: " + getFuelType() + "\nBrand: " + getBrand();
    }
}
