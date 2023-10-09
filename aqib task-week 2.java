import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("Please enter the temperature value:");

        double temperature = input.nextDouble();

        System.out.println("Please specify the unit (C for Celsius, F for Fahrenheit):");

        String unit = input.next().toUpperCase();

        if (unit.equals("C")) {
            double fahrenheit = (temperature * 9/5) + 32;
            System.out.println(temperature + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
        } else if (unit.equals("F")) {
            double celsius = (temperature - 32) * 5/9;
            System.out.println(temperature + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");
        } else {
            System.out.println("Invalid unit specified.");
        }
    }
}
  