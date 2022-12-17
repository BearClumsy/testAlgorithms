package dplatonov;

public class TestFib {
  public static void main(String[] args) {
    int n0, n1 = 1, n2 = 2;
    for (int i = 0; i < 10; i++) {
      n0 = n1 * n2;
      n1 = n0;
      n2++;
      System.out.print(n0 + ", ");
    }
  }
}
