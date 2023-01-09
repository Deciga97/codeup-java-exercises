import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // While Loop
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }

        // Do While Loop
        int x = 100;
        do {
            x -= 5;
            System.out.println(x);
        } while (x >= -10);

        // Refactor do while loop to for loop
        for (int z = 100; z >= -10; z -= 5) {
            System.out.println(x);
        }

        // Do While Loop
        int number = 2;
        do {
            System.out.println(number * number);
            number++;
        } while (number < 66000);

        // Refactor do while loop to for loop
        for (int num = 2; num < 1000000; num++) {
            // Display the number squared on each line
            System.out.println(num * num);
        }

        // FizzBuzz
        for (int y = 1; y <= 100; y++) {
            if (y % 3 == 0) {
                System.out.println("Fizz");
            } else if (y % 5 == 0) {
                System.out.println("Buzz");
            }
        }

        // Table of powers
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("What number would you like to go up to? ");
        int n = scanner.nextInt();

        // Display the table header
        System.out.println("Here is your table!");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");

        // Display the table rows
        for (int k = 1; k <= n; k++) {
            System.out.printf("%d      | %d       | %d\n", k, k * k, k * k * k);
        }

        // Ask if the user wants to continue
        System.out.print("Would you like to continue? (y/n) ");
        String userAnswer = scanner.next();

        // Only continue if the user agrees to
        if (userAnswer.equalsIgnoreCase("y")) {
            System.out.println("Jk");
        }
    }

    }

