package ss3_array_and_method_in_java.thuc_hanh;


import java.util.Scanner;

public class MaxValueInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;

        do {
            System.out.print(" Enter a size :");
            size = sc.nextInt();
            if (size > 20)
                System.out.print(" Size should not exceed 20");
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + " :");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.println("Property list : ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("GTLN : " + max + "\n" + "Index max : " + index);
    }
}
