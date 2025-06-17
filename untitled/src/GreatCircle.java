import java.util.Scanner;

public class GreatCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("insert the two shortest paths between (x1, y1) and (x2, y2)");

        double x1 = Math.toRadians(input.nextDouble());
        double y1 = Math.toRadians(input.nextDouble());
        double x2 = Math.toRadians(input.nextDouble());
        double y2 = Math.toRadians(input.nextDouble());

        calculateGreatCircle(x1, y1, x2, y2);
    }

    public static void calculateGreatCircle(double x1, double y1, double x2, double y2) {
        double r = 6371;

        // formula for the first sin
        double sin1 = (x2 - x1)/2;

        // formula for the second sin
        double sin2 = (y2 - y1)/2;

        // formula of the first sin square
        double a = Math.pow(Math.sin(sin1), 2);

        // formula of the second sin square
        double b = Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin(sin2),2);

        // formula after the arcsin
        double arcsin = Math.sqrt(a + b);

        // the whole formula
        double formula = 2 * r * Math.asin(arcsin);

        System.out.println(formula + " kilometers");
    }
}
