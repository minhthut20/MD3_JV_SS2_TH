package Interest;

import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền muốn gửi : ");
        double money = scanner.nextDouble();
        System.out.println("Số tháng gửi : ");
        int month = scanner.nextInt();
        System.out.println("Lãi suất gửi :");
        double interest = scanner.nextDouble();
        float totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interest / 100) / 12;
        }
        System.out.println(totalInterest );
    }
}
