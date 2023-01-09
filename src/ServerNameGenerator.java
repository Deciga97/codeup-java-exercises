import java.util.Random;

public class ServerNameGenerator {
    public static String getRandomElement(String[] array) {
        // Create a random number generator
        Random rand = new Random();

        // Generate a random index between 0 and the length of the array
        int randomIndex = rand.nextInt(array.length);

        // Return the element at the random index
        return array[randomIndex];
    }

    public static void main(String[] args) {
        // Create an array of adjectives
        String[] adjectives = new String[]{"Motivated", "Dedicated", "Hungry", "Lazy", "Brave", "Fearless", "Loyal", "Honor", "Respectful", "Personal Courage"};

        // Create an array of nouns
        String[] nouns = new String[]{"Steve", "Rango", "Beans", "Rattlesnake Jake", "Bad Bill", "Oscar", "Lenny", "Chicken Joe", "Tank", "Geek"};

        // Get a random adjective and noun
        String adjective = getRandomElement(adjectives);
        String noun = getRandomElement(nouns);

        // Hyphenate the adjective and noun
        String name = adjective + "-" + noun;

        // Display the generated name to the user
        System.out.println("Your generated name is: " + name);
    }
}
