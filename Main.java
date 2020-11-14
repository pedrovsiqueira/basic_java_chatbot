import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String botName = "Aid";
        int birthYear = 2020;

        System.out.println("Hello! My name is " + botName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");

        String yourName = scanner.next();

        System.out.println("What a great name you have, " + yourName);

    }
}
