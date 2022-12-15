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