/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hobbitus Ryzen
 */
public class Car 
{
    String brand;
    String model;
    String engine;
    int power;
    int price;
    String doors;
    String seats;
    String colour;
    
    public void setCarSpecs(String brand, String model, String engine, int power, int price, String doors, String seats, String colour)
    {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.power = power;
        this.price = price;
        this.doors = doors;
        this.seats = seats;
        this.colour = colour;        
    }
    
    @Override
    public String toString()
    {
        return "Brand: " + brand + "\nModel: " + model + "\nEngine: " + engine +
                "\nPower: " + power + "\nPrice: " + price + "\nDoors: " + doors
                + "\nSeats: " + seats + "\nColour: " + colour;
    }
}
