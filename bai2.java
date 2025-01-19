package huynhthihai_7541;

import java.util.Scanner;

public class bai2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap so luong phan tu: ");
    int n = scanner.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.print("nhap phan tu trong mang: ");
      a[i] = scanner.nextInt();
    }
    int max = a[0];
    int min =a[0];
    for (int i = 0; i < n; i++) {
      if(a[i]>max){
        max=a[i];
      }
      if(a[i]<min){
        min=a[i];
      }
    }
    System.out.println("so lon nhat: " +max);
    System.out.println("so nho nhat: " +min);
  }
}
