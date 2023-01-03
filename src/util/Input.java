import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public static boolean yesNo() {
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("si")
    }

    public static getInt(int min, int max) {
        System.out.printf("Enter a number between %d and %d", min, max);
        int userNumber = scanner.nextInt();
        if(userNumber < min || userNumber > max) {
            getInt(min, max);
        }
    }



}