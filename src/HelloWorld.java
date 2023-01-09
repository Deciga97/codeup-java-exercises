public class HelloWorld {
    public static void main(String[] args) {
        int myFavoriteNumber = 18;
        System.out.println("My favorite number is " + myFavoriteNumber + ".");

        String myString = "I sleep before I wake.";
        System.out.println(myString);

        double myNumber = 3.14;

        int x = 5;
        System.out.println(x++);
        System.out.println(x);

        x = 5;
        System.out.println(++x);
        System.out.println(x);

        String theNumberThree = "three";
        Object o = theNumberThree;
        try {
            int three = (int) o;
        } catch (ClassCastException e) {
            System.out.println("Cannot cast string to int.");
        }

//        try {
//            int three = (int) "three";
//        } catch (ClassCastException e) {
//            System.out.println("Cannot cast string literal to int.");
//        }

        x = 4;
        x += 5;

        x = 3;
        int y = 4;
        y *= x;

        x = 10;
        y = 2;
        x /= y;
        y -= x;

        System.out.println("Hello World");
    }
}
