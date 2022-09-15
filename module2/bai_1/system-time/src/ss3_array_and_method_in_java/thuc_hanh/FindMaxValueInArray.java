package ss3_array_and_method_in_java.thuc_hanh;

import java.util.Scanner;

public class FindMaxValueInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int max;

        do {
            System.out.println("Nhap so phan tu cua mang :");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Nhap lai so n >0");
            }
        } while (n < 0);

        // Khoi tao mang va cap phat bo nho cho mang
        int[] array = new int[n];
        System.out.println("Nhap cac phan tu cua mang ");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + " :");
            array[i] = sc.nextInt();
        }

        // Hien thi mang vua khoi tao
        System.out.println("Mang vua nhap :");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + "\t");
        }

        // Tim max in array
        max = array[0];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (max < array[i]) {
                max = array[i];
                index += i;
            }
        }
        System.out.println("GTLN :" + max + " Vi tri :" + index);
    }
}
