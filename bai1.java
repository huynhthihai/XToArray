package huynhthihai_7541;

import java.util.Scanner;

public class bai1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap so luong phan tu: ");
    int n = scanner.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.print("nhap phan tu trong mang:");
      a[i] = scanner.nextInt();
    }
    for (int i = 0; i < n / 2; i++) {
      int temp = a[i];
      a[i] = a[n - 1 - i];
      a[n - 1 - i] = temp;
    }
    System.out.println("mang sau khi dao nguoc: ");
    for (int i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }
  }
}