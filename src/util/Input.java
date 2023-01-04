package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        String input = this.scanner.nextLine();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        int input = this.getInt();
        if (input < min || input > max) {
            System.out.println("Input must be between " + min + " and " + max);
            return getInt(min, max);
        }
        return input;
    }

    public int getInt() {
        try {
            return Integer.valueOf(this.getString());
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer. Please try again.");
            return getInt();
        }
    }

    public double getDouble(double min, double max) {
        double input = this.getDouble();
        if (input < min || input > max) {
            System.out.println("Input must be between " + min + " and " + max);
            return getDouble(min, max);
        }
        return input;
    }

    public double getDouble() {
        try {
            return Double.valueOf(this.getString());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number. Please try again.");
            return getDouble();
        }
    }
}
