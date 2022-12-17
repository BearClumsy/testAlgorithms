package dplatonov;

public class MergeTwoSortedArrays {

  public static void main(String[] args) {
    int[] a = newArray(15, 0);
    int[] b = newArray(10, 15);
    int n1 = a.length;
    int n2 = b.length;
    int[] result = new int[n1 + n2];

    show(merge(a, b, n1, n2, result));
  }

  private static int[] merge(int[] a, int[] b, int n1, int n2, int[] result) {
    int i = 0, j = 0, k = 0;
    while (i < n1 && j < n2) {
      if (a[i] < b[j]) {
        result[k++] = a[i++];
      } else {
        result[k++] = b[j++];
      }
    }

    while (i < n1) {
      result[k++] = a[i++];
    }

    while (j < n2) {
      result[k++] = b[j++];
    }

    return result;
  }

  private static void show(int[] result) {
    System.out.print("{");
    for (int value : result) {
      System.out.print(value + (value != result[result.length - 1] ? ", " : "}"));
    }
  }

  private static int[] newArray(int size, int limit) {
    int[] result = new int[size];
    for (int i = 0; i < size; i++) {
      result[i] = i + limit;
    }
    return result;
  }
}
