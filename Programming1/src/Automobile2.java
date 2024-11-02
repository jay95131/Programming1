public class Automobile2 {
        private String make;
        private String model;
        private String color;
        private int year;
        private int mileage;

        // Default constructor
        public Automobile2() {
            this.make = "";
            this.model = "";
            this.color = "";
            this.year = 0;
            this.mileage = 0;
        }

        // Parameterized constructor
        public Automobile2(String make, String model, String color, int year, int mileage) {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
        }

        // Add a new vehicle method
        public String addVehicle(String make, String model, String color, int year, int mileage) {
            try {
                this.make = make;
                this.model = model;
                this.color = color;
                this.year = year;
                this.mileage = mileage;
                return "Vehicle added successfully.";
            } catch (Exception e) {
                return "Failed to add vehicle: " + e.getMessage();
            }
        }

        // List vehicle information method
        public String[] listVehicle() {
            try {
                return new String[]{make, model, color, String.valueOf(year), String.valueOf(mileage)};
            } catch (Exception e) {
                return new String[]{"Failed to list vehicle: " + e.getMessage()};
            }
        }

        // Remove a vehicle method
        public String removeVehicle() {
            try {
                this.make = "";
                this.model = "";
                this.color = "";
                this.year = 0;
                this.mileage = 0;
                return "Vehicle removed successfully.";
            } catch (Exception e) {
                return "Failed to remove vehicle: " + e.getMessage();
            }
        }

        // Update vehicle attributes method
        public String updateVehicle(String make, String model, String color, int year, int mileage) {
            try {
                this.make = make;
                this.model = model;
                this.color = color;
                this.year = year;
                this.mileage = mileage;
                return "Vehicle updated successfully.";
            } catch (Exception e) {
                return "Failed to update vehicle: " + e.getMessage();
            }
        }
    }

