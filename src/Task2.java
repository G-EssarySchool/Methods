import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int favInt = InputHelper.getInt(scan, "Please enter your favorite int: ");
        double favDouble = InputHelper.getDouble(scan, "Please enter your favorite double:");
        System.out.println("Your favorite int is " + favInt + " and your favorite double is " + favDouble + ".");
    }
}