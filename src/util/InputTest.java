package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("Enter a string: ");
        String str = input.getString();
        System.out.println("You entered: " + str);

        System.out.println("Enter y/n: ");
        boolean bool = input.yesNo();
        System.out.println("You entered: " + bool);

        System.out.println("Enter an integer between 1 and 10: ");
        int num = input.getInt(1, 10);
        System.out.println("You entered: " + num);

        System.out.println("Enter any integer: ");
        int num2 = input.getInt();
        System.out.println("You entered: " + num2);

        System.out.println("Enter a decimal number between 1 and 10: ");
        double decimal = input.getDouble(1, 10);
        System.out.println("You entered: " + decimal);

        System.out.println("Enter any decimal number: ");
        double decimal2 = input.getDouble();
        System.out.println("You entered: " + decimal2);
    }
}
