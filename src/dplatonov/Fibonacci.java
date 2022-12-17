package dplatonov;

public class Fibonacci {
  public static void main(String[] args) {
    int n1 = 1, n2 = 1, size = 11;
    int[] result = new int[size];
    for (int i = 0; i < size; i++) {
      if (i < 2) {
        result[i] = n1;
      } else {
        result[i] = n1 + n2;
        n1 = n2;
        n2 = result[i];
      }
    }

    print(result);
  }

  public static void print(int[] a) {
    int size = a.length;
    System.out.print("dplatonov.Fibonacci of 11 = {");
    for (int i = 0; i < size; i++) {
      System.out.print(a[i]);
      if (i != size - 1) {
        System.out.print(", ");
      } else {
        System.out.print("}");
      }
    }
  }
}
