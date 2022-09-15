package ss3_array_and_method_in_java.thuc_hanh;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] students = {"An", "Hoa", "Minh", "Binh", "Dung"};

        System.out.print(" Nhap ten sinh vien :");
        String name = sc.nextLine();

        boolean isExits = false;
        for(int i =0; i< students.length; i++){
            if(students[i].equals(name)){
                System.out.println("Ten :" + name + " thu tu trong danh sach :" +(i+1));
                isExits = true;
                break;
            }
        }
        if(!isExits){
            System.out.println("Khong tim thay " +name + "trong danh sach ");
        }
    }
}
