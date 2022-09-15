package DemoJavaBasic;

import java.util.Scanner;

public class CheckNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap vao so n :");
        n = sc.nextInt();
        if (n > 0) {
            System.out.println(n + " la so nguyen duong");
        } else if (n == 0) {
            System.out.println(n + " la so 0");
        } else {
            System.out.println(n + "Day la so am");
        }

    }
}
