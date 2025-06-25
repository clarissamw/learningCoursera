public class Checkerboard {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    // set the canvas with the size 0 until n so it doesnt look squeezed
    StdDraw.setScale(0, n);

    // looping for printing checkers
    for (int row = 0; row < n; row++) {
      for (int col = 0; col < n; col++) {

        // if the cell is even, paint with blue
        // the color starts from 0,0
        if ((row + col) % 2 == 0) {
          // set the color
          StdDraw.setPenColor(StdDraw.BLUE);
        } else {
          StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        }
        // coloring the square one by one
        // col + 0.5 to find the center from axis x. less than this there will be empty space
        // row + 0.5 to find the center from axis y
        StdDraw.filledSquare(col + 0.5 , row + 0.5, 0.5);
      }
    }
  }
}
