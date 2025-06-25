import java.util.Random;

public class Minesweeper {
  public static void main(String[] args) {
    int row = Integer.parseInt(args[0]);
    int column = Integer.parseInt(args[1]);
    int numberOfMines = Integer.parseInt(args[3]);
    int[][] area = new int[row][column];
    int minesCounter = 0;

    // put the mines in random cells
    while (minesCounter < numberOfMines) {
      Random rand = new Random();
      int r = rand.nextInt(row);
      int c = rand.nextInt(column);

      if (area[r][c] == 0) {
        area[r][c] = -1;
        minesCounter++;
      }
    }

    // check each cell and print based on the rules
    // 0 if there's no mines around
    // print total of mines around if there's any

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        if (area[i][j] == -1) {
          continue;
        }

        // top-right, top-left, bottom-left, bottom-right, top, bottom, left, right
        int[] drow = {-1, -1, 1, 1, -1, 1, 0, 0};
        int[] dcol = {1, -1, -1, 1, 0, 0, -1, 1};
        int direction = drow.length;
        for (int loop = 0; loop < direction; loop++) {


          // checking the surrounding
          int newRow = i + drow[loop];
          int newCol = j + dcol[loop];

          // make sure that the surrounding is still inside the area
          if (newRow >= 0 && newRow < row && newCol >= 0 && newCol < column) {
            if (area[newRow][newCol] == -1) {
              area[i][j]++;
            }
          }
        }
      }
    }

    // to print the array
    for (int p = 0; p < row; p++) {
      for (int q = 0; q < column; q++) {
        if (area[p][q] == -1) {
          System.out.print("*  ");
        }
        else {
          System.out.print(area[p][q] + "  ");
        }
      }
      System.out.println();
    }
  }
}
