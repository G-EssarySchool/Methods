import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double celsius = InputHelper.getDouble(scan, "Enter temperature in Celsius: ");

        double fahrenheit = celsiusToFahrenheit(celsius);

        System.out.printf("Temperature in Fahrenheit: %.2f Fahrenheit%n", fahrenheit);
    }
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }
}
