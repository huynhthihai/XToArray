package huynhthihai_7541;

import java.util.Scanner;

public class bai6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap so luong phan tu: ");
    int n = scanner.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.print("nhap phan tu trong mang: ");
      a[i] = scanner.nextInt();
    }
    int sum=0;
    for (int i = 0; i < n; i++) {
      sum+=a[i];
        }
    System.out.println("tong cac phan tu trong mang la: "+sum);
  }
}
