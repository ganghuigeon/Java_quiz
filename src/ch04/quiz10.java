package ch04;

import java.util.Scanner;

public class quiz10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean banking = true; //은행업무중인지?
        int account = 0;//잔고

        System.out.println("===============================");
        System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
        System.out.println("===============================");
        while (banking) {
            //메뉴생성


            //스캐너로 값을 입력받음
            System.out.println("진행하실 은행업무를 선택해주세요: ");
            String strNum = scanner.nextLine(); //입력받은 값을 저장

            if (strNum.equals("1")) {
                //1.예금: 잔고를 올림
                account += scanner.nextInt();
                System.out.println("입급하셨습니다." + account + "원");

            } else if (strNum.equals("2")) {
                //2.출금: 잔고를 내림
                account -= scanner.nextInt();
                System.out.println("출금하셨습니다." + account + "원");

            } else if (strNum.equals("3")) {
                //3. 잔고: 현재 잔고를 확인
                System.out.println(account);
            } else if (strNum.equals("4")) {
                //종료
                banking = false;
                System.out.println("프로그램 종료");
            } else {
                System.out.println("잘못 선택하셨습니다. 보안을 위해 종료합니다.");
                break;
            }
        }
    }
}
