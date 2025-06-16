import java.util.Scanner;

/*Write a program RightTriangle that takes three int command-line arguments
and determines whether they constitute the side lengths of some right triangle.
a^2 + b^2 = c^2

The following two conditions are necessary and sufficient:
- Each integer must be positive.
- The sum of the squares of two of the integers must equal the square of the third integer.
*/

public class RightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the input");
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        isSumOfTwoSquaresTrue(a,b,c);
    }

    // I tried without static it didn't work. It can't call the method
    public static void isSumOfTwoSquaresTrue(int a, int b, int c) {
        int sumOfTwoSquares = (int) Math.pow(a,2) + (int) Math.pow(b,2);
        int squareThirdInt = (int) Math.pow(c,2);

        if(sumOfTwoSquares == squareThirdInt) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}

