import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        // PI //
        double pi = 3.14159; // define the value of pi
        System.out.printf("The value of pi is approximately %.2f. %n", pi); // print the value of pi with 2 decimal places

        // Scanner //

        Scanner scanner = new Scanner(System.in); // create a new Scanner object

        System.out.print("Please enter an integer: "); // prompt the user to enter an integer
        int number = scanner.nextInt(); // read the integer using the nextInt method

        System.out.println("You entered: " + number); // print the value of the number variable

        // Prompting User to pick 3 words //
        System.out.print("Pick the first number");
        String firstWord = scanner.nextLine();

        System.out.print("Pick the second number");
        String secondWord = scanner.nextLine();

        System.out.print("Pick the third number");
        String thirdWord = scanner.nextLine();

        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);

        // Sentence //

        System.out.print("Please enter a sentence: ");
        String sentence = scanner.next();
        System.out.println("You entered " + sentence);

        System.out.print("Please enter a sentence: "); // prompt the user to enter a sentence
        String userInput = scanner.next(); // read the sentence using the next method

        System.out.println("You entered: " + userInput); // print the value of the sentence variable

        // NextLine //
        System.out.print("Please enter a sentence: "); // prompt the user to enter a sentence
        String sentence = scanner.nextLine(); // read the sentence using the nextLine method

        System.out.println("You entered: " + sentence); // print the value of the sentence variable

        // Measurement //
                // Prompt the user to enter the length
                System.out.println("Enter the length of the classroom: ");
                String lengthInput = scanner.nextLine();
                double length = Double.parseDouble(lengthInput);

                // Prompt the user to enter the width
                System.out.println("Enter the width of the classroom: ");
                String widthInput = scanner.nextLine();
                double width = Double.parseDouble(widthInput);

                // Calculate the area and perimeter
                double area = length * width;
                double perimeter = 2 * length + 2 * width;

                // Print the results
                System.out.println("The area of the classroom is " + area);
                System.out.println("The perimeter of the classroom is " + perimeter);
            }
        }

    }



}
}