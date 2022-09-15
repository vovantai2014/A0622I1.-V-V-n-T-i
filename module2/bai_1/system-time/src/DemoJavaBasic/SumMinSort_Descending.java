package DemoJavaBasic;

import java.util.Scanner;

public class SumMinSort_Descending {
    public static void main(String[] args) {
        int sum = 0;
        int n;
        int sortTemp;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng :");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("So khong hop le! Nhap lai so >0");
            }
        } while (n < 0);

        // Khởi tạo và cấp phát bộ nhớ cho mảng
        int[] array = new int[n];
        System.out.println("Nhập các phần tử của mảng :");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + i + " :");
            array[i] = sc.nextInt();
        }

        // Hiển thị mảng vừa nhập
        System.out.println("Mảng ban đầu : ");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + "\t");

        }

        // Tính tổng các phần tử trong mảng
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        System.out.println("Tổng các phần tử trong mảng :" + sum);

        //Sắp xếp theo thứ tự giảm dần
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] < array[j]) {
                    sortTemp = array[i];
                    array[i] = array[j];
                    array[j] = sortTemp;
                }
            }

        }
        System.out.println("Mảng sau khi sắp xếp giảm dần là :");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + "\t");

        }
        int min = array[0];
        for (int i = 0; i < n; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(" GTNN của mảng :" + min);
    }

}
