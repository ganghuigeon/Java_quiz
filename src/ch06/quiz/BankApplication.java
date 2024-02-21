package ch06.quiz;

import java.util.Scanner;

public class BankApplication {
    //private: BankApplication클래스 안에서만 사용가능
    //static: static main 메소드 안에서 사용 가능
    private static Scanner scanner = new Scanner(System.in);
    private static Account[] accountArray = new Account[100]; //account 객체만 저장가능

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            System.out.println("===================================================");
            System.out.println("1. 계좌 생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("===================================================");

            System.out.println("선택>");
            int selctNo = scanner.nextInt();//입력받음

            switch (selctNo) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    run = false;
                    break;
            }

        }
        System.out.println("프로그램 종료");
    }

    //static: static이 붙은 main메소드 안에서 호출하기 위해 붙여줌
    //1. 계좌 생성
    private static void createAccount() {
        System.out.println("==========================");
        System.out.println("계좌생성");
        System.out.println("==========================");

        System.out.print("계좌번호: ");
        String ano = scanner.next();

        System.out.print("계좌주: ");
        String owner = scanner.next();

        System.out.print("초기입금액: ");
        int balance = scanner.nextInt();

        //입력 받은 정보를 이용해 account객체 생성
        Account newAccount = new Account(ano, owner, balance);

        //accountArray배열에 Account 객체를 저장하기

        for (int i = 0; i < accountArray.length; i++) {
            //accountArray의 디폴트 값은 null이 들어가 있다.
            //계좌객체를 순서대로 저장하기 위해 null체크

            if (accountArray[i] == null) {
                accountArray[i] = newAccount;
                System.out.println("계좌가 생성되었습니다.");
                //★쓸데없는 반복은 피하는 것이 바람직하다. newAccount객체를 배열에 전부 저장하지 않는다.
                break;
            }
        }

    }

    //2. 계좌 목록 보여줌
    private static void accountList() {
        System.out.println("==========================");
        System.out.println("계좌목록");
        System.out.println("==========================");

        for (int i = 0; i < accountArray.length; i++) {
            Account account = accountArray[i];

            //★accountArray 배열안에서 Account 객체가 있는 부분만 가져온다.
            if (account != null) {
                System.out.println(account.getAno() + " " + account.getOwner() + " " + account.getBalance());
            } else break; //★쓸데없는 반복 피하기
        }
    }

    //3. 예금
    private static void deposit() {
        System.out.println("==========================");
        System.out.println("예금");
        System.out.println("==========================");
        System.out.println("계좌 번호: ");
        String ano = scanner.next();

        System.out.println("예금액: ");
        int money = scanner.nextInt();

        //입력받은 계좌번호로 고객 계좌 객체 찾기
        Account account = findAccount(ano);//찾은 고객 계좌

        //해당 고객계좌가 없으면 메.소드를 종료시킴
        if ((account) == null) {
            System.out.println("계좌가 없습니다.");
            return;
        }
        //기존에 저장되어 있던 예금액 + 새로 입금할 예금액을 더해서 예금해준다.
        account.setBalance(account.getBalance() + money);
        System.out.println("입금처리가 완료되었습니다.");
    }

    //4. 출금
    private static void withdraw() {
        System.out.println("==========================");
        System.out.println("출금");
        System.out.println("==========================");
        System.out.println("계좌 번호: ");
        String ano = scanner.next();

        System.out.println("출금액: ");
        int money = scanner.nextInt();

        //입력받은 계좌번호로 고객 계좌 객체 찾기
        Account account = findAccount(ano);//찾은 고객 계좌

        //해당 고객계좌가 없으면 메.소드를 종료시킴
        if ((account) == null) {
            System.out.println("계좌가 없습니다.");
            return;
        }
        //기존에 저장되어 있던 예금액 + 새로 출금할 금액을 빼서 출금해준다.
        account.setBalance(account.getBalance() - money);
        System.out.println("출금처리가 완료되었습니다.");

    }

    //5. 계좌번호로 본인 계좌 찾기(Account 객체를 리턴해준다)
    private static Account findAccount(String ano) {
        Account account = null; //return하기 위해 for문 밖에 변수 선언

        //배열에 저장된 객체별 계좌번호를 하나씩 비교해 고객계좌를 찾는다.
        for (int i = 0; i < accountArray.length; i++) {
            //★accoutArray 배열 안에서 account 객체가 있는 부분만 가져온다
            if (accountArray[i] != null) {
                //객체에 저장된 계좌번호 가져오기
                String dbAno = accountArray[i].getAno();
                //객체에 저장된 계좌번호와 매개변수의 계좌번호가 같으면 해당 객체를 account 변수에 저장
                if (dbAno.equals(ano)) {
                    account = accountArray[i];
                    break; //계좌번호를 찾으면 반복문 중단, 빠져나온다.
                }
            }
        }
        return account; // 찾는 해당계좌 객체를 리턴
    }

}
