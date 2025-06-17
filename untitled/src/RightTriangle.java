/* Write a program module1.RightTriangle that takes three int command-line arguments
and determines whether they constitute the side lengths of some right triangle.
a^2 + b^2 = c^2

The following two conditions are necessary and sufficient:
- Each integer must be positive.
- The sum of the squares of two of the integers must equal the square of the third integer.
*/

public class RightTriangle {
    public static void main(String[] args) {
        System.out.println("enter 3 digits of input separate with space");

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        System.out.println(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2));
    }
}
