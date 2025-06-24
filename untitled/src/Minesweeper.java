public class Minesweeper {
  public static void main(String[] args) {
    int row = Integer.parseInt(args[0]);
    int column = Integer.parseInt(args[1]);
    int numberOfMines = Integer.parseInt(args[3]);
    int[][] area = new int[row][column];
    int minesCounter = 0;

    // put the mines in random cells
    while (minesCounter < numberOfMines) {
      int r = (int) (Math.random() * row);
      int c = (int) (Math.random() * column);

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
        // top-left corner
        if (i == 0 && j == 0) {
          if (area[i][j + 1] == -1) area[i][j] += 1; // right
          if (area[i+1][j+1] == -1) area[i][j] += 1; //  right bottom diagonal
          if (area[i+1][j] == -1) area[i][j] += 1; // below
        }

        // first row without corner
        else if (i == 0 && j > 0 && j < column - 1) {
          if (area[i][j - 1] == -1) area[i][j] += 1;  // left
          if (area[i + 1][j] == -1) area[i][j] += 1; // bottom
          if (area[i][j + 1] == -1) area[i][j] += 1; // right
          if (area[i + 1][j - 1] == -1) area[i][j] += 1;  // left bottom diagonal
          if (area[i + 1][j - 1] == -1) area[i][j] += 1; // right bottom diagonal
        }

        // first column without corner
        else if (j == 0 && i > 0 && i < row -1) {
          if (area[i - 1][j] == -1) area[i][j] += 1;  // top element
          if (area[i - 1][j + 1] == -1) area[i][j] += 1; // top right diagonal
          if (area[i][j + 1] == -1) area[i][j] += 1; // right
          if (area[i + 1][j + 1] == -1) area[i][j] += 1; // bottom right diagonal
          if (area[i + 1][j] == -1) area[i][j] += 1; // below
        }

        // top-right corner
        else if (i == 0 && j == column - 1) {
          if (area[i][j - 1] == -1) area[i][j] += 1; // left
          if (area[i + 1][j] == -1) area[i][j] += 1; // below
          if (area[i + 1][j - 1] == -1) area[i][j] += 1; // bottom left diagonal
        }

        // bottom-left corner
        else if (i == row - 1 && j == 0) {
          if (area[i - 1][j] == -1) area[i][j] += 1; // top
          if (area[i][j + 1] == -1) area[i][j] += 1; // right
          if (area[i - 1][j + 1] == -1) area[i][j] += 1; // top right diagonal
        }

        // bottom-right corner
        else if (i == row - 1 && j == column - 1) {
          if (area[i - 1][j] == -1) area[i][j] += 1; // top
          if (area[i][j - 1] == -1) area[i][j] += 1; // left
          if (area[i - 1][j - 1] == -1) area[i][j] += 1; // top left diagonal
        }

        // last column without corners
        else if (j == column - 1 && i > 0 && i < row - 1) {
          if (area[i - 1][j] == -1) area[i][j] += 1;
          if (area[i + 1][j] == -1) area[i][j] += 1;
          if (area[i - 1][j - 1] == -1) area[i][j] += 1;
          if (area[i][j - 1] == -1) area[i][j] += 1;
          if (area[i + 1][j - 1] == -1) area[i][j] += 1;
        }

        // last row without corners
        else if (i == row - 1 && j > 0 && j < column - 1) {
          if (area[i][j - 1] == -1) area[i][j] += 1;
          if (area[i][j + 1] == -1) area[i][j] += 1;
          if (area[i - 1][j - 1] == -1) area[i][j] += 1;
          if (area[i - 1][j] == -1) area[i][j] += 1;
          if (area[i - 1][j + 1] == -1) area[i][j] += 1;
        }

        // center, ensuring we're not on the top row, first column, etc
        else {
          if (i - 1 >= 0 && j - 1 >= 0 && area[i - 1][j - 1] == -1) area[i][j]++; // top left diagonal, not on the first row, not on the first column,
          if (i - 1 >= 0 && area[i - 1][j] == -1) area[i][j]++; // top, not on the first row
          if (i - 1 >= 0 && j + 1 < column && area[i - 1][j + 1] == -1) area[i][j]++; // top right diagonal, not on the first row
          if (j - 1 >= 0 && area[i][j - 1] == -1) area[i][j]++; // left, not on the first column
          if (j + 1 < column && area[i][j + 1] == -1) area[i][j]++;
          if (i + 1 < row && j - 1 >= 0 && area[i + 1][j - 1] == -1) area[i][j]++;
          if (i + 1 < row && area[i + 1][j] == -1) area[i][j]++;
          if (i + 1 < row && j + 1 < column && area[i + 1][j + 1] == -1) area[i][j]++;

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
