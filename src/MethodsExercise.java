import java.util.Scanner;

public class MethodsExercise {
    // Add Method //
    public static int addition(int x, int y) {
        return x + y;
    }

    // Subtraction Method //
    public static int subtraction(int x, int y) {
        return x - y;
    }

    // Multiplication Method //
    public static int multiplication(int x, int y) {
        return x * y;
    }

    // Division Method //
    public static int division(int x, int y) {
        return x / y;
    }

    // Modulus Method //
    public static int modulus(int x, int y) {
        return x % y;
    }

    // Get Integer Method //
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int userInput;
        userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
            System.out.println("Your input is within range.");
            return userInput;
        } else {
            System.out.println("Your input is out of range.");
            return getInteger(min, max);
        }
    }

    // Factorial Method //
    public static long factorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println(addition(1, 2));
        System.out.println(subtraction(1, 2));
        System.out.println(multiplication(1, 2));
        System.out.println(division(1, 2));

        Scanner scanner = new Scanner(System.in);
        boolean b = true;

        while (b) {
            // Prompt the user to enter an integer from 1 to 10
            System.out.print("Enter an integer from 1 to 10: ");
            int n = getInteger(1, 10);

            // Calculate the factorial using the factorial method
            long result = factorial(n);

            // Display the factorial
            System.out.println("The factorial of " + n + " is " + result);

            // Ask the user if they want to continue
            System.out.print("Do you want to continue? (y/n) ");
            String answer = scanner.next();
            if (answer.equals("n")) {
                b = false;
            }
        }
    }
}
