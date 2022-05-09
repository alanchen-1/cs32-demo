// A very basic pbt predicate that fails if any of the input lines it
// receives are odd numbers
public class FailsIfOdd {
  public static void main(String[] args) {
    String[] stdOut = args[0].split("\n");
    for (int i = 0; i < stdOut.length; i++) {
      if (Integer.valueOf(stdOut[i]) % 2 != 0) System.exit(1);
    }
    System.exit(0);
  }
}
