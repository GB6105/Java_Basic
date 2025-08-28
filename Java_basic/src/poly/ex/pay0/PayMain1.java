package poly.ex.pay0;

import java.util.Scanner;

public class PayMain1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("결제 수단을 입력하세요: ");
        String payOption = scanner.nextLine();
        if(payOption.equals("exit")) {
            System.out.print("프로그램을 종료합니다.");
            System.exit(0);
            return;
        }
        System.out.print("결제 금액을 입력하세요: ");
        int payAmount = scanner.nextInt();

        PayService payService = new PayService();
        payService.processPay(payOption, payAmount);
    }
}
