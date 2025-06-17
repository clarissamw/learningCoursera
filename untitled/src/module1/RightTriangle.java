package module1;

import java.util.Scanner;

/*Write a program module1.RightTriangle that takes three int command-line arguments
and determines whether they constitute the side lengths of some right triangle.
a^2 + b^2 = c^2

The following two conditions are necessary and sufficient:
- Each integer must be positive.
- The sum of the squares of two of the integers must equal the square of the third integer.
*/


public class RightTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 3 digits of input separate with space");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        isTwoSquaresOfTwoIntegersEqualTheThirdInteger(a, b, c);
    }

    public static void isTwoSquaresOfTwoIntegersEqualTheThirdInteger(int a, int b, int c) {
        System.out.println(Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2));
    }
}
