import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // While Loop //
//        int i = 5;
//        while(i <= 15) {
//            System.out.println(i);
//            i++;
//        }

        // Do While Loop //
        int x = 100;
        do{
            x -= 5;
            System.out.println(x);
        } while(x >= -10);

        //Refactor do while loop to for loop //

//        for (int x = 100; x >= -10; x -= 5) {
//            System.out.println(x);
//        }

        // Do While Loop //
        int number = 2;
        do {
            System.out.println(number * number);
            number++;
        } while (number < 66000);

        //Refactor do while loop to for loop //
//        for (int number = 2; number < 1000000; number++) {
//            // Display the number squared on each line
//            System.out.println(number * number);
//        }

        // FizzBuzz //
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
        }

        // table of powers //
                Scanner scanner = new Scanner(System.in);

                // Prompt the user to enter an integer
                System.out.print("What number would you like to go up to? ");
                int n = scanner.nextInt();

                // Display the table header
                System.out.println("Here is your table!");
                System.out.println("number | squared | cubed");
                System.out.println("------ | ------- | -----");

                // Display the table rows
                for (int i = 1; i <= n; i++) {
                    System.out.printf("%d      | %d       | %d\n", i, i * i, i * i * i);
                }

                // Ask if the user wants to continue
                System.out.print("Would you like to continue? (y/n) ");
                String answer = scanner.next();

                // Only continue if the user agrees to
                if (answer.equalsIgnoreCase("y")) {
                    // TODO: Add code here to continue3 the program
                }

        // Prompt the user for a numerical grade
        System.out.print("Enter a numerical grade from 0 to 100: ");
        int grade = scanner.nextInt();

        // Display the corresponding letter grade
        if (grade >= 88) {
            System.out.println("The letter grade is: A");
        } else if (grade >= 80) {
            System.out.println("The letter grade is: B");
        } else if (grade >= 67) {
            System.out.println("The letter grade is: C");
        } else if (grade >= 60) {
            System.out.println("The letter grade is: D");
        } else {
            System.out.println("The letter grade is: F");
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

