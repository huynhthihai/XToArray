package huynhthihai_7541;

import java.util.Scanner;

public class bai4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap so luong phan tu: ");
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.print("nhap phan tu trong mang:");
      arr[i] = scanner.nextInt();
    }
    int[] uniqueArr = new int[n];
    int index = 0;
    for (int i = 0; i < n; i++) {
      boolean trungLap = false;
      for (int j = 0; j < index; j++) {
        if (arr[i] == uniqueArr[j]) {
          trungLap = true;
          break;
        }
      }
      if (!trungLap) {
        uniqueArr[index++] = arr[i];
      }
    }
    System.out.print("Output: ");
    for (int i = 0; i < index; i++) {
      System.out.print(uniqueArr[i] + " ");
    }
  }
}