public class Birthday {
  public static void main(String[] args) {
    int days = Integer.parseInt(args[0]);
    int trials = Integer.parseInt(args[1]);

    double probability = 0.0;
    int people = 1;

    // first we check whether the probability is 50%
    while (probability < 0.5) {
      int duplicateCount = 0;

      // n number of trials we always reset the boolean and the foundDuplicate
      for (int i = 0; i < trials; i++) {
        boolean[] birthdayTaken = new boolean[days];
        boolean foundDuplicate = false;

        // i number of people for each trial until it reaches the number of trial
          for (int p = 0; p < people; p++) {
            int birthday = (int) (Math.random() * days);

            // if the birthday on certain date is true, we found a duplicate so we break
            if (birthdayTaken[birthday]) {
              foundDuplicate = true;
              break;
            } else {
              birthdayTaken[birthday] = true;
            }
          }

          // when there's a duplicate found, we increase the counter of duplicates
          // we calculate after every trial
        if (foundDuplicate) {
          duplicateCount++;
        }
      }

      // count the probability after running x trials at i people
      probability = (double) duplicateCount / trials;
      System.out.printf("%-10s %-10s %-10s\n", people, duplicateCount, probability);

      people++;
    }
  }
}

