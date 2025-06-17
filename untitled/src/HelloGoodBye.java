import java.util.Scanner;

public class HelloGoodBye {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please type hello and followed by your name and your friend's name");

        String input = scanner.nextLine();

        if(input.endsWith(".")) {
            input = input.substring(0,input.length()-1);
        }

        String[] cleanInput = input.split(" ");

        String firstName = cleanInput[1];
        String secondName = cleanInput[3];

        sayGoodbye(firstName, secondName);
    }

    public static void sayGoodbye(String firstName, String secondName) {
        System.out.println("Goodbye " + secondName + " and " + firstName + ".");

    }
}
