import java.util.Scanner;

public class FloatingPointValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        int count = 0;

        while (count < 5) {
            System.out.print("Enter a floating-point value: ");
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                total += value;
                if (value > max) {
                    max = value;
                }
                if (value < min) {
                    min = value;
                }
                count++;
            } else {
                System.out.println("Invalid input. Please enter a valid floating-point value.");
                scanner.next(); // Clear the invalid input
            }
        }

        double average = total / 5;
        double interest = total * 0.20;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Interest on total at 20%: " + interest);

        scanner.close();
    }
}
