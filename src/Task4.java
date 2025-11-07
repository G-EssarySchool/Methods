import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total = 0;
        boolean moreItems;

        do {
            double price = InputHelper.getRangedDouble(scan, "Enter item price ($0.50 - $9.99): ", 0.50, 9.99);
            total += price;
            moreItems = Boolean.parseBoolean(InputHelper.getYNConfirm(scan, "Do you have more items? [Y/N]: "));
        } while (moreItems);

        System.out.printf("%nTotal cost of your items: $%.2f%n", total);
    }
}
