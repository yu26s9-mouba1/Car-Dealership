package com.pluralsight;
import java.util.ArrayList;


/**
 * Dealership class to store all dealership infos
 */

public class Dealership {

    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;


    //Constructor
    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }



    //A method to add vehicles to the arrayList
    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    // A method to call all vehicle in the arraylist
    public ArrayList<Vehicle> getAllVehicles() {
        return inventory;
    }


    // A method to remove vehicle
    public void  removeVehicle(Vehicle vehicle) {
        inventory.remove(vehicle);
    }
}
