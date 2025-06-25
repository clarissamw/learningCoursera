import java.util.Scanner;

public class WorldMap {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // read the first input
    int width = scanner.nextInt();
    int height = scanner.nextInt();

    // read the enter
    scanner.nextLine();

    // preparing the canvas
    StdDraw.setScale(width, height);
    StdDraw.setXscale(0, width);
    StdDraw.setYscale(0, height);
    int max_regions = 2000;

    String[] regionNames = new String[max_regions];
    double[][] xAxis = new double[max_regions][];
    double[][] yAxis = new double[max_regions][];
    int[] vertexCounts = new int[max_regions];

    // marking n-th of region
    int regionIndex = 0;

    while (scanner.hasNext()) {
      // read the region name
      String regionName = scanner.next();
      regionNames[regionIndex] = regionName;

      // read the vertex number
      int vertex = scanner.nextInt();
      vertexCounts[regionIndex] = vertex;

      // read the coordinate
        for (int i = 0; i < vertex; i++) {
          double x = scanner.nextDouble();
          xAxis[regionIndex][i] = x ;
          double y = scanner.nextDouble();
          yAxis[regionIndex][i] = y;
        }

        regionIndex++;
        }

    for (int i = 0; i < regionIndex; i++) {
      StdDraw.polygon(xAxis[i],yAxis[i]);
    }
  }
}
