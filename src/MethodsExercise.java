import java.util.Scanner;
public class MethodsExercise {
    public static void main(String[] args) {
        System.out.println(addition(1, 2));
        System.out.println(subtraction(1, 2));
        System.out.println(multiplication(1, 2));
        System.out.println(division(1, 2));

        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);




    }

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
    }





