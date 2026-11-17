import java.util.Scanner;

class FrizzBuzz {
    public static void main(String... args) {
        for (int number = 0; number <= 100; number++) {

            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("FrizzBuzz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else if (number % 3 == 0) {
                System.out.println("Frizz");
            }else {
                System.out.println(number);
            }

        }
    }
}
