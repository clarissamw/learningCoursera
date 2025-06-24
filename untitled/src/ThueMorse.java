public class ThueMorse {
  public static void main(String[] args) {
    int input = Integer.parseInt(args[0]);
    int[] sequence = new int[input];

    // to get the first sequence based on the input
    int length = 1;
    while (length < input) {
      for (int i = 0; i < length && i < length + 1; i++) {
        sequence[length+i] = 1 - sequence[i];
      }

      length *= 2;
    }

    // compare the element on the row with the element on the column
    for (int row = 0; row < input; row++) {
      for (int column = 0; column < input; column++) {
        if (sequence[row] == sequence[column]) {
          System.out.print("+  ");
        }
        else {
          System.out.print("- ");
        }
      }
      System.out.println();
    }

  }
}
