public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while(i <= 15) {
            System.out.println(i);
            i++;
        }

        int x = 100;
        do{
            x -= 5;
            System.out.println(x);
        } while(x >= -10);

        for (int x = 100; x >= -10; x -= 5) {
            System.out.println(x);
        }


        int number = 2;
        do {
            // Display the number squared on each line
            System.out.println(number * number);
            // Increment the number by 1
            number++;
        } while (number < 66000);

        //Refactor to For Loop //
        for (int number = 2; number < 1000000; number++) {
            // Display the number squared on each line
            System.out.println(number * number);
        }



    }
}
