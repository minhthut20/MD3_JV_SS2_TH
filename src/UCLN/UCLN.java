package UCLN;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số a : ");
        int a = scanner.nextInt();
        System.out.println("Nhập vào số b : ");
        int b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a==0 || b==0){
            System.out.println("Không có ước chung lớn nhất");
        }else {
            while (a!=b){
                if (a>b){
                    a = a-b;
                    System.out.println(" a = " + a);
                }else {
                    b = b-a;
                    System.out.println(" b = " + b);
                }
            }
            System.out.println("Ước chung lớn nhất là " + a);
        }

    }
}
