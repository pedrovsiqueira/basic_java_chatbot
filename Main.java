import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        greet("Aid", "2020");
        remindName();
        guessAge();
        count();
        testKnowledge();
        end();
    }

    static void greet(String botName, String birthYear) {
        System.out.println("Hello! My name is " + botName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String yourName = scanner.next();
        System.out.println("What a great name you have, " + yourName);
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");

        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();

        int yourAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.println("Your age is " + yourAge + " that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");

        int count = scanner.nextInt();

        for (int i = 0; i <= count; i++) {
            System.out.println(i + "!");
        }
    }

    static void testKnowledge() {
        System.out.println("Let's test your programming knowledge.\n" +
                "Why do we use methods?\n" +
                "1. To repeat a statement multiple times.\n" +
                "2. To decompose a program into several small subroutines.\n" +
                "3. To determine the execution time of a program.\n" +
                "4. To interrupt the execution of a program.");


        while (scanner.hasNext()) {
            int userInput = scanner.nextInt();

            if (userInput != 2) {
                System.out.println("Please, try again.");
            } else {
                break;
            }
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
