import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Birth Information Input:");

        int year = InputHelper.getRangedInt(scan, "Enter year of birth (1950 - 2010): ", 1950, 2010);
        int month = InputHelper.getRangedInt(scan, "Enter month of birth (1 - 12): ", 1, 12);

        int maxDays;
        switch (month) {
            case 2:
                maxDays = 29;
                break;
            case 4: case 6: case 9: case 11:
                maxDays = 30;
                break;
            default:
                maxDays = 31;
                break;
        }

        int day = InputHelper.getRangedInt(scan, "Enter day of birth (1 - " + maxDays + "): ", 1, maxDays);
        int hour = InputHelper.getRangedInt(scan, "Enter hour of birth (1 - 24): ", 1, 24);
        int minute = InputHelper.getRangedInt(scan, "Enter minute of birth (1 - 59): ", 1, 59);

        System.out.println("\nBirth Information:");
        System.out.printf("Year:  %d\nMonth:  %d\nDay: %d%nTime: %02d:%02d%n", year, month, day, hour, minute);
    }
}
