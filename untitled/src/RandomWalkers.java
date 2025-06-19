public class RandomWalkers {
  public static void main(String[] args) {
    int r = Integer.parseInt((args[0]));
    int trial = Integer.parseInt(args[1]);
    int x = 0;
    int y = 0;
    int steps = 0;
    int attempt = 1;
    long totalSteps = 0;

    while (attempt < trial) {
      // reset the position, almost forgot
      x = 0;
      y = 0;
      while (Math.abs(x) + Math.abs(y) != r) {
        double random = Math.random();

        if (random < 0.25) {
          x--; // west
        } else if (random < 0.5) {
          x++; // east
        } else if (random < 0.75) {
          y++; //north
        } else {
          y--; // south
        }
        steps++;

      }
      totalSteps += steps;
      attempt++;
    }
    System.out.println("average number of steps = " + (double) totalSteps/trial);
  }

}
