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




    }
}
