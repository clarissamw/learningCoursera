public class RandomWalker {
  public static void main(String[] args) {
    int r = Integer.parseInt((args[0]));
    int x = 0;
    int y = 0;
    int steps = 0;

    System.out.println("(" + x + ", " + y + ")");

    while (Math.abs(x) + Math.abs(y) != r) {
      double random = Math.random();

      if(random < 0.25) {
        x--; // west
      }

      else if(random < 0.5) {
        x++; // east
      }

      else if(random < 0.75) {
        y++; //north
      }

      else {
        y--; // south
      }

      System.out.println("(" + x + ", " + y + ")");
      steps++;
    }

    System.out.println("steps = " + steps);
  }
}
