import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double itemPrice = InputHelper.getRangedDouble(scan, "Enter the item price: $" , .50, 9.99);
        String getYN = InputHelper.getYNConfirm(scan, "Do you want to add another item? [Y/N]");
        






    }
}