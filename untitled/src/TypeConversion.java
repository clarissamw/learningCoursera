import java.util.Scanner;

/* specifies the level of red (R), green (G), and blue (B) on an integer scale from 0 to 255.
The primary format for publishing books and magazines—known as the CMYK format—
Specifies the level of cyan (C), magenta (M), yellow (Y), and black (K) on a real scale from 0.0 to 1.0.
 */


public class TypeConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please input the level of cyan, magenta, yellow, and black from 0.0 to 1.0");

        double cyan = input.nextDouble();
        double magenta = input.nextDouble();
        double yellow = input.nextDouble();
        double black = input.nextDouble();

        CMYKtoRGB(cyan, magenta, yellow, black);

    }

    public static void CMYKtoRGB(double cyan, double magenta, double yellow, double black) {
        double white = 1 - black;
        double red = 255 * white * (1 - cyan);
        double green = 255 * white * (1 - magenta);
        double blue = 255 * white * (1 - yellow);

        System.out.println("red = " + (int) red);
        System.out.println("green = " + (int) green);
        System.out.println("blue = " + (int) blue);
    }
}
