package IsPrime;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        if (number<2){
            System.out.println(number+" không phải là số nguyên tố");
        } else if (number==2) {
            System.out.println(number + " là số nguyên tố");
        }else {
            boolean flag = true;
            for (int i = 2; i < number; i++) {
                if (number%i ==0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println(number + " là số nguyên tố ");
            }else {
                System.out.println(number + " không phải là số nguyên tố");
            }
        }
    }
}
