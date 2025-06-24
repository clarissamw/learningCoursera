public class Birthday {
  public static void main(String[] args) {
    int days = Integer.parseInt(args[0]);
    int trials = Integer.parseInt(args[1]);
    double probability = 0.0;
    int people = 0;


    // plus 2 because if we only have exact days, that means no duplicate. if we add 1 more,
    // there's a chance of array out of bounds
    // to store how many trials we do to be finally able to find a share birthday
    // index 2 and the value let's say 100 means
    // we have 100 times out of million trials to put 2 people and they already share the birthday

    int[] count = new int[days + 2];

    System.out.printf("%-10s %-10s %-10s\n", "1", "0", "0.0");

    while (probability < 0.5) {
      people++;
      for (int i = 0; i < trials; i++) {
        boolean[] birthdayTaken = new boolean[days];
        int birthday = (int) (Math.random() * days);
        if (birthdayTaken[birthday] == true) {
          count[people] += 1;
          break;
        } else {
          birthdayTaken[birthday] = true;
        }
      }


      System.out.printf("%-10s %-10s %-10s\n", people, count, probability);
    }

    // calculate the probability with the sum of all current trials
//    int sum = 0;
//    double probability = 0.0;
//    for (int i = 0; i < count.length; i++) {
//      sum += count[i];
//      probability = sum/trials;

    }
  }

