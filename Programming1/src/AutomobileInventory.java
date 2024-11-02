import java.util.Scanner;

public class AutomobileInventory {
    public static void main(String[] args) {
        try {
            Automobile2 auto = new Automobile2("Toyota", "Camry", "Red", 2020, 15000);
            printVehicleInfo(auto);

            System.out.println(auto.removeVehicle());
            System.out.println(auto.addVehicle("Honda", "Civic", "Blue", 2021, 10000));
            printVehicleInfo(auto);

            System.out.println(auto.updateVehicle("Ford", "Mustang", "Black", 2022, 5000));
            printVehicleInfo(auto);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Do you want to print the information to a file (Y or N)? ");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("Y")) {
                printToFile(auto);
            } else {
                System.out.println("File will not be printed.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static void printVehicleInfo(Automobile2 auto) {
        String[] info = auto.listVehicle();
        for (String detail : info) {
            System.out.println(detail);
        }
    }

    private static void printToFile(Automobile2 auto) {
        try {
            java.io.FileWriter writer = new java.io.FileWriter("C:\\Temp\\Autos.txt");
            String[] info = auto.listVehicle();
            for (String detail : info) {
                writer.write(detail + "\n");
            }
            writer.close();
            System.out.println("Information printed to file successfully.");
        } catch (Exception e) {
            System.out.println("Failed to print to file: " + e.getMessage());
        }
    }
}