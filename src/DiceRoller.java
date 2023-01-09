import java.util.Scanner;

public class DiceRoller {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of sides for a pair of dice: ");
        int numSides = sc.nextInt();

        while (true) {
            System.out.println("Rolling the dice...");
            int dice1 = rollDice(numSides);
            int dice2 = rollDice(numSides);
            System.out.println("Dice 1: " + dice1 + " Dice 2: " + dice2);

            System.out.print("Roll the dice again? (y/n) ");
            String choice = sc.next();
            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.println("Thanks for playing!");
        sc.close();
    }

    public static int rollDice(int numSides) {
        return (int) (Math.random() * numSides + 1);
    }
}