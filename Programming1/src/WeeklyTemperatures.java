import java.util.Scanner;

public class WeeklyTemperatures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Double[] temperatures = {56.6, 66.6, 76.6, 86.6, 96.6, 68.0, 70.0};


        System.out.println("Enter the day or 'week' to display the temperatures for each day and the weekly average:");
        String input = scanner.next();

        if (input.equalsIgnoreCase("week")) {
            double totalTemp = 0;
            System.out.println("Temperatures for the week:");
            for (int i = 0; i < weekDays.length; i++) {
                System.out.println(weekDays[i] + ": " + temperatures[i] + "°F");
                totalTemp += temperatures[i];
            }
            double averageTemp = totalTemp / weekDays.length;
            System.out.println("Weekly average temperature: " + averageTemp + "°F");
        }else{
            int index = 0;
            for (String weekDay : weekDays) {
                if (weekDay.equalsIgnoreCase(input)) {
                    System.out.println(weekDay + "'s temperature : " + temperatures[index] + "°F");
                    break;
                }
                index++;
            }
        }

        scanner.close();
    }
}
