/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8.pkg1;

/**
 *
 * @author User
 */
public abstract class Vehicle implements Dieselable {
    protected double fuel;
    
    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
    
    public double getFuel() {
        return fuel;
    }
    
    public Vehicle() {
        this(0);
    }
    
    public Vehicle(double fuel) {
        this.fuel = fuel;
    }
    
    public void addFuel(double fuel) {
        if (this.fuel > 0) {
            fuel += this.fuel;
        }
        else {
            System.out.println("Fuel is empty.");
        }
    }
    
    public abstract void honk();
    
}
