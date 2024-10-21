import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Automobile {
    private String make;
    private String model;
    private String color;
    private int year;

    // Map to store automobiles with a unique key
    private static Map<String, Automobile> automobileMap = new HashMap<>();

    // Constructor to initialize the automobile
    public Automobile(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // Method to generate a unique key from make, model, color, and year
    public static String generateKey(String make, String model, String color, int year) {
        // Pseudo code:
        // Concatenate make, model, color, and year to form a unique key
        return make + "-" + model + "-" + color + "-" + year;
    }

    // Method to add a vehicle
    public static String addVehicle(String make, String model, String color, int year, Automobile automobile) {
        // Generate the key using the provided details
        String key = generateKey(make, model, color, year);
        // Pseudo code:
        // If the key is not already in the map
        //     Add the vehicle to the map
        //     Return success message
        // Else
        //     Return error message
        if (!automobileMap.containsKey(key)) {
            automobileMap.put(key, automobile);
            return "Vehicle added successfully.";
        } else {
            return "Vehicle with this key already exists.";
        }
    }

    // Method to remove a vehicle
    public static String removeVehicle(String make, String model, String color, int year) {
        // Generate the key using the provided details
        String key = generateKey(make, model, color, year);
        // Pseudo code:
        // If the key exists in the map
        //     Remove the vehicle from the map
        //     Return success message
        // Else
        //     Return error message
        if (automobileMap.containsKey(key)) {
            automobileMap.remove(key);
            return "Vehicle removed successfully.";
        } else {
            return "Vehicle with this key does not exist.";
        }
    }

    // Method to update vehicle details
    public static String updateVehicle(String key, Automobile newAutomobile) {
        // Pseudo code:
        // If the key exists in the map
        //     Update the vehicle details
        //     Return success message
        // Else
        //     Return error message
        if (automobileMap.containsKey(key)) {
            automobileMap.put(key, newAutomobile);
            return "Vehicle updated successfully.";
        } else {
            return "Vehicle with this key does not exist.";
        }
    }

    // Helper method to validate vehicle details
    private boolean isValid(String make, String model, String color, int year) {
        // Pseudo code:
        // Check if the vehicle details are valid
        // Return true if valid, false otherwise
        return make != null && model != null && color != null && year > 0;
    }

    // Main method to accept inputs to add and remove vehicles
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option: 1. Add Vehicle 2. Remove Vehicle 3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.println("Enter make:");
                String make = scanner.nextLine();
                System.out.println("Enter model:");
                String model = scanner.nextLine();
                System.out.println("Enter color:");
                String color = scanner.nextLine();
                System.out.println("Enter year:");
                int year = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                Automobile automobile = new Automobile(make, model, color, year);
                String result = addVehicle(make, model, color, year, automobile);
                System.out.println(result);
            } else if (choice == 2) {
                System.out.println("Enter make:");
                String make = scanner.nextLine();
                System.out.println("Enter model:");
                String model = scanner.nextLine();
                System.out.println("Enter color:");
                String color = scanner.nextLine();
                System.out.println("Enter year:");
                int year = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                String result = removeVehicle(make, model, color, year);
                System.out.println(result);
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
