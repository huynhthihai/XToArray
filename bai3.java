package huynhthihai_7541;

import java.util.Scanner;

public class bai3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap so luong phan tu: ");
    int n = scanner.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.print("nhap phan tu trong mang:");
      a[i] = scanner.nextInt();
    }
    boolean laDoiXung = true;
    for (int i = 0; i < n / 2; i++) {
      if (a[i] != a[n - 1 - i]) {
        laDoiXung = false;
      }
    }
    System.out.print("La mang Palindromic: :" + laDoiXung);
  }
}