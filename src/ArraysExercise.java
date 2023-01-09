public class ArraysExercise {
    private String name;

    public void Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static Person[] addPerson(Person[] people, Person person) {
        // Create a new array that is 1 element larger than the passed array
        Person[] newPeople = new Person[people.length + 1];

        // Copy the elements of the passed array into the new array
        for (int i = 0; i < people.length; i++) {
            newPeople[i] = people[i];
        }

        // Add the passed person object to the end of the new array
        newPeople[newPeople.length - 1] = person;

        // Return the new array
        return newPeople;
    }

    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Alice");
        people[1] = new Person("Bob");
        people[2] = new Person("Charlie");

        // Add a new person to the array
        Person[] newPeople = addPerson(people, new Person("David"));

        // Print the names of the people in the new array
        for (Person person : newPeople) {
            System.out.println(person.getName());
        }
    }
}
