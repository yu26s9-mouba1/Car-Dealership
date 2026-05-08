package com.pluralsight.ui;
import com.pluralsight.models.Dealership;
import com.pluralsight.data.DealershipFileManager;
import com.pluralsight.models.Vehicle;

import java.util.ArrayList;

public class UserInterface {
    private Dealership dealership;



    public UserInterface() {

    }



    //Loading files
    private void init() {
        DealershipFileManager fileManager = new DealershipFileManager();
        this.dealership = fileManager.getDealership();

    }

    //Main Menu
    public void display() {
        init();

        String commamd;
        do {
            String menu = """
                    1 - Find vehicles within price range
                    2 - Find vehicles by make/model
                    3 - Find vehicles by year range
                    4 - Find vehicles by color
                    5 - Find vehicles by mileage range
                    6 - Find vehicles by type
                    7 - List all vehicles
                    8 - Add vehicle
                    9 - Remove vehicle
                    99 - Quit
                    
                    
                    
                    """;

            System.out.println(menu);
            commamd = Console.promptForString("Enter Command: ").trim().toUpperCase();

        switch (commamd) {
            case "1":
                processGetByPriceRequest();
                break;
            case "2":
                processGetByMakeModelRequest();
                break;
            case "3":
                processGetByYearRequest();
                break;
            case "4":
                processGetByColorRequest();
                break;
            case "5":
                processGetByMileageRequest();
                break;
            case "6":
                processGetByVehicleTypeRequest();
                break;
            case "7":
                processAllVehiclesRequest();
                break;
            case "8":
                processAddVehicleRequest();
                break;
            case "9":
                processRemoveVehicleRequest();
                break;
            case "99":
                System.out.println("Goodbye!");;
                break;
            default:
                System.out.println("Invalid Command!");
                break;

        }

        } while (!commamd.equals("99"));

    }



    //Prints each vehicle
    private void displayVehicles(ArrayList<Vehicle> vehicles) {

        System.out.println("Vehicles:");
        if (vehicles == null || vehicles.isEmpty()) {
            System.out.println("No vehicles found!");
            return;
        }
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle);
            }



    }


    //Gets all vehicles from dealership
    private void processAllVehiclesRequest() {
        ArrayList<Vehicle> vehicles = dealership.getAllVehicles();
        displayVehicles(vehicles);


    }

    private void processGetByPriceRequest() {

        

    }

    private void processGetByMakeModelRequest() {

    }

    private void processGetByYearRequest() {

    }

    private void processGetByColorRequest() {

    }

    private void processGetByMileageRequest() {

    }

    private void processGetByVehicleTypeRequest() {

    }

    private void processAddVehicleRequest() {

    }

    private void processRemoveVehicleRequest() {

    }



}






