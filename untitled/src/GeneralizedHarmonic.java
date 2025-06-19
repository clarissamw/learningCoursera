public class GeneralizedHarmonic {
  public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
    int firstInput = Integer.parseInt(args[0]);
    int secondInput = Integer.parseInt(args[1]);
//    int firstInput = scanner.nextInt();
//    int secondInput = scanner.nextInt();
    double sum = 0;

    for (int n = 1; n <= firstInput; n++) {
      int divisor = (int) Math.pow(n, secondInput);

      // we need to use 1.0 otherwise it's gonna be integer
      sum += (1.0 / divisor);
    }
    System.out.println(sum);
  }
}
