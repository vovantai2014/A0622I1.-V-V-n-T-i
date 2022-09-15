package DemoJavaBasic;

import java.util.Scanner;

public class SumN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        System.out.println("Nhap vao so nguyen duong :");
        n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i% 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Tong :" + sum);
    }
}

