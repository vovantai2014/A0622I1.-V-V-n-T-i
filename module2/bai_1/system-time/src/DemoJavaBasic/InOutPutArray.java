package DemoJavaBasic;

import java.util.Scanner;

public class InOutPutArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so phan tu cua mang :");
        int sizeArray = sc.nextInt();
        int[] arr = new int[sizeArray];
        inputArray(arr,sc);
        System.out.println("Mang vua nhap :");
        outputArray(arr); // ??????
        // Xuat mang thu cong
       // System.out.println("Mang vua nhap :");
       // for (int i = 0; i < sizeArray ; i++) {
           // System.out.printf(arr[i] + "\t");
        //}

    }

    public static void inputArray(int[] array, Scanner sc) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Nhap phan tu thu  " + "array["+i + "] :");
            array[i] = sc.nextInt();
        }
    }

    public static void outputArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] +"\t");
        }
        System.out.println();
    }
}
