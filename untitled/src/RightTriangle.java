import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 3 digits of input separate with space");

        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        isTwoSquaresOfTwoIntegersEqualTheThirdInteger(a, b, c);
    }

    public static void isTwoSquaresOfTwoIntegersEqualTheThirdInteger(int a, int b, int c) {
        if(Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }

}
