/* specifies the level of red (R), green (G), and blue (B) on an integer scale from 0 to 255.
The primary format for publishing books and magazines—known as the CMYK format—
Specifies the level of cyan (C), magenta (M), yellow (Y), and black (K) on a real scale from 0.0 to 1.0.
 */

public class CMYKtoRGB {
    public static void main(String[] args) {
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);

        double white = 1 - black;
        double red = 255 * white * (1 - cyan);
        double green = 255 * white * (1 - magenta);
        double blue = 255 * white * (1 - yellow);

        System.out.println("red = " + (int) Math.ceil(red));
        System.out.println("green = " + (int) Math.ceil(green));
        System.out.println("blue = " + (int) Math.ceil(blue));

    }
}
