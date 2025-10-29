public class Main {
    public static void main (String[] args) {
        Rectangle r1 = new Rectangle(3, 4);
        System.out.println("r1 Info: ");
        r1.printRectangle();
        //Making changes
        r1.setLength(6);
        r1.setWidth(7);
        System.out.println("New Info:");
        r1.printRectangle();
    }
}