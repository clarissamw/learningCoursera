public class DiscreteDistribution {
  public static void main(String[] args) {
    int slot = Integer.parseInt(args[0]);
    int[] slots = new int[slot];
    int[] distribution = new int[args.length-1];
    int sum = 0;

    // read all the weights and store them into distribution array
    for (int i = 1; i < args.length; i++) {
      // we cast to int because the return of args[i] is a string
      distribution[i-1] = Integer.parseInt(args[i]);

      // calculate the sum of all the weights
      sum += distribution[i-1];
    }

    // calculate the cumulative to implicitly know the range
    int[] cumulative = new int[distribution.length];
    cumulative[0] = distribution[0];

    for (int i = 1; i < distribution.length; i++) {
      cumulative[i] = cumulative[i-1] + distribution[i];
    }

    // random the number
    for (int i = 0; i < slots.length; i++) {
      int r = (int) (Math.random() * sum);

      // find which index that the r falls under
      for (int j = 0; j < cumulative.length; j++) {

        // if the r is lesser than the value in the cumulative, print the index j
        if (r < cumulative[j]) {
          System.out.println(j + " ");
          break;
        }
      }
    }
  }
}
