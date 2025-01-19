package huynhthihai_7541;

import java.util.Scanner;

public class bai5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap so luong phan tu: ");
    int n = scanner.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.print("nhap phan tu trong mang: ");
      a[i] = scanner.nextInt();
    }
    for (int i = 0; i < n; i++) {
      for (int j = n - 1; j > i; j--) {
        if (a[j] < a[j - 1]) {
          int temp = a[j];
          a[j] = a[j - 1];
          a[j - 1] = temp;

        }
      }
    }
    System.out.print("mang sau khi sap xep tang dan la: ");
    for (int i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }
  }
}
