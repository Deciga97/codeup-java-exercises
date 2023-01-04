//import java.sql.SQLOutput;
//import java.util.Scanner;
//public class MethodsExercise {
//    public static void main(String[] args) {
//        System.out.println(addition(1, 2));
//        System.out.println(subtraction(1, 2));
//        System.out.println(multiplication(1, 2));
//        System.out.println(division(1, 2));
//
////        SZ
//
//        System.out.println("Pick a number between 1 and 10.");
//
//
//
//
//    }
//
//    // Add Method //
//    public static int addition(int x, int y) {
//        return x + y;
//    }
//
//    // Subtraction Method //
//    public static int subtraction(int x, int y) {
//        return x - y;
//    }
//
//    // Multiplication Method //
//    public static int multiplication(int x, int y) {
//        return x * y;
//    }
//
//    // Division Method //
//    public static int division(int x, int y) {
//        return x / y;
//    }
//
//    // Modulus Method //
//    public static int modulus(int x, int y) {
//        return x % y;
//    }
//// getInteger //
//    public static int getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//        int userInput;
//        userInput = sc.nextInt();
//            if (userInput >= min && userInput <= max) {
//                System.out.println("Your input is within range.");
//                return userInput;
//            } else {
//                System.out.println("Your input is out of range.");
//                return getInteger(min, max);
//            }
//        }
//
//
//        public static long factorial() {
//        int NumToFactoralize = getInteger(1, 10) {
//            long currentSum = 1;
//            for(int counter = 1; startPoint <= NumToFactoralize; counter++) {
//                currentSum *= counter * currentSum;
//            }
//
//        // Calculate //
//            Scanner scanner = new Scanner(System.in);
//            boolean continue = true;
//
//            while (continue) {
//                // Prompt the user to enter an integer from 1 to 10
//                System.out.print("Enter an integer from 1 to 10: ");
//                int n = scanner.nextInt();
//
//                // Verify that the user has entered an integer between 1 and 10
//                if (n >= 1 && n <= 10) {
//                    // Calculate the factorial using a for loop
//                    long factorial = 1;
//                    for (int i = 1; i <= n; i++) {
//                        factorial *= i;
//                    }
//
//                    // Display the factorial
//                    System.out.println("The factorial of " + n + " is " + factorial);
//                } else {
//                    System.out.println("Invalid input. Please enter an integer from 1 to 10.");
//                }
//
//                // Ask the user if they want to continue
//                System.out.print("Do you want to continue? (y/n) ");
//                String answer = scanner.next();
//                if (answer.equals("n")) {
//                    continue = false;
//                }
//            }
//
//            // dice //
//            public class DiceRoller {
//
//                public static void main(String[] args) {
//                    Scanner sc = new Scanner(System.in);
//
//                    System.out.print("Enter the number of sides for a pair of dice: ");
//                    int numSides = sc.nextInt();
//
//                    while (true) {
//                        System.out.println("Rolling the dice...");
//                        int dice1 = rollDice(numSides);
//                        int dice2 = rollDice(numSides);
//                        System.out.println("Dice 1: " + dice1 + " Dice 2: " + dice2);
//
//                        System.out.print("Roll the dice again? (y/n) ");
//                        String choice = sc.next();
//                        if (!choice.equalsIgnoreCase("y")) {
//                            break;
//                        }
//                    }
//
//                    System.out.println("Thanks for playing!");
//                    sc.close();
//                }
//
//                public static int rollDice(int numSides) {
//                    return (int) (Math.random() * numSides + 1);
//                }
//            }
//
//
//
//
//}
//    }
//
//
//}
//
//
//
//
//
