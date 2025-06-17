import java.util.Scanner;

/* Write a program HelloGoodbye.java that takes two names as command-line arguments and prints hello
 and goodbye messages as shown below
 (with the names for the hello message in the same order as the command-line arguments
 and with the names for the goodbye message in reverse order).
 */


public class HelloGoodBye {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please type hello and followed by your name and your friend's name");

        String input = scanner.nextLine();

        // to collect the names
        String names = input.substring(5,input.length()-1);

        // to find the index where the and is
        int and = names.indexOf(" and ");

        // get the first name from index 0 until the index of and
        String firstName = names.substring(0, and);

        // get the second name after the index of " and " then we add 5 because it has 5 chars
        String secondName = names.substring(and + 5);

        sayGoodbye(firstName, secondName);
    }

    public static void sayGoodbye(String firstName, String secondName) {
        System.out.println("Goodbye " + secondName + " and " + firstName + ".");

    }
}
