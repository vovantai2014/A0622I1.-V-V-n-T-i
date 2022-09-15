package DemoJavaBasic;

import java.util.Scanner;

public class CheckTamGiacVuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;

        System.out.println("Nhap canh a :");
        a = sc.nextInt();
        System.out.println("Nhap canh b :");
        b = sc.nextInt();
        System.out.println("Nhap canh c :");
        c = sc.nextInt();
        if(a*a == b*b + c*c || b*b == a*a + c*c || c*c == b*b + a*a){
            System.out.println(" La 3 canh cua tam giac vuong");
        }else{
            System.out.println("Khong phai la 3 canh cua tam giac vuong");
        }
    }
}
