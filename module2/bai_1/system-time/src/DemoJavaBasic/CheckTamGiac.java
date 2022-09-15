package DemoJavaBasic;

import java.util.Scanner;

public class CheckTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;

        System.out.println("Nhap canh a :");
        a = sc.nextInt();
        System.out.println("Nhap canh b :");
        b = sc.nextInt();
        System.out.println("Nhap canh c :");
        c = sc.nextInt();

        if(a+b>c && a+c>b && b+c>a){
            System.out.println( "la 3 canh cua tam giac");
        }else{
            System.out.println("Khong phai la 3 canh cua tam giac");
        }
    }
}
