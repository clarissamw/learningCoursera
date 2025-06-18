public class BandMatrix {
  public static void main(String[] args) {
    int size = Integer.parseInt(args[0]);
    int width = Integer.parseInt(args[1]);

    // for row
    for(int i = 0; i < size; i++) {

      // for column
      for(int j = 0; j < size; j++) {

        // this is the diagonal
        int distance = Math.abs(i - j);

        if(distance > width) {
          System.out.print("0  ");
        }
        else {
          System.out.print("*  ");
        }
      }

      // after all column down, we go to the next row
      System.out.println(" ");
    }
  }
}
