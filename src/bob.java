import java.util.Scanner;

public class bob {
    public static void main (String [] args) {

        Scanner bob = new Scanner(System.in);
        System.out.print("Hi, I'm Bob.");
        String userInput = bob.next();


        if(userInput.endsWith("?")) {
            System.out.println("Sure.");
        } else if(userInput.endsWith("!")) {
            System.out.println("Woah, chill out!");
        } else {
            System.out.println("IDK");
        }

    }
}

// // Use a while loop to keep the code running until the user decides to quit
//        while (true) {
//            System.out.print("Hi, I'm Bob. Ask me a question: ");
//            String userInput = bob.next();
//
//            // Check if the user has entered the keyword to quit
//            if (userInput.equalsIgnoreCase("quit") || userInput.equalsIgnoreCase("exit")) {
//                // If the user has entered the keyword, break out of the loop
//                break;