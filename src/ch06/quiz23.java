package ch06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class quiz23 {
    public static void main(String[] args) {

        boolean banking = true;
        String name = "";
        String birth = "";
        List<Account> accounts = new ArrayList<>(); // 계좌 목록 초기화
        Scanner scanner = new Scanner(System.in);

        while (banking) {
            System.out.println("===============================");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5. 종료");
            System.out.println("===============================");
            System.out.println("진행하실 은행업무를 선택해주세요: ");
            //이용할 업무 선택을 위한 nextLine
            String strNum = scanner.nextLine();
            if (strNum.equals("1")) {
                // 계좌 생성
                System.out.println("성함을 입력해주세요");
                //이름 입력 받기 위한 nextLine
                name = scanner.nextLine();
                boolean validInput = false;
                while (!validInput) {
                    System.out.println("생년월일을 6자리로 숫자로 입력해주세요");
                    try {
                        birth = scanner.nextLine();
                        long longBirth = Long.parseLong(birth);
                        if (longBirth >= 1 && longBirth <= 999999) {
                            //100000이면 2000년생 입력이 불가했던 관계로 초기 값을 1부터 시작하는 걸로 설정함
                            validInput = true;
                        } else {
                            System.out.println("생년월일 6자리 입력해주세요.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("올바른 생년월일 입력이 아닌 거 같습니다. 다시 입력해주세요.");
                    }
                }
                int accountNumber = (int) (Math.random() * 999999) + 100000;
                accounts.add(new Account(accountNumber, name)); // 생성된 계좌를 계좌 목록에 추가

                System.out.println("입력된 성함: " + name);
                System.out.println("입력된 생년월일: " + birth);
                System.out.println("발급된 계좌번호: " + accountNumber);
            } else if (strNum.equals("2")) {
                // 보유한 계좌번호 조회
                System.out.println("===============================");
                System.out.println("보유한 계좌번호 조회");
                System.out.println("===============================");
                for (Account acc : accounts) {
                    System.out.println("성함: " + acc.getName());
                    System.out.println("계좌번호: " + acc.getAccountNumber());
                    System.out.println("잔고"  + acc.getAccountBalance() + "원");
                }
            } else if (strNum.equals("3")) {
                System.out.println("입금할 계좌번호를 입력해주세요: ");
                int depositAccountNumber = Integer.parseInt(scanner.nextLine());
                Account depositAccount = findAccount(accounts, depositAccountNumber);
                if (depositAccount != null) {
                    System.out.println("입금할 금액을 입력해주세요: ");
                    int depositAmount = Integer.parseInt(scanner.nextLine());
                    depositAccount.deposit(depositAmount);
                    System.out.println("입금하셨습니다. 잔고: " + depositAccount.getAccountBalance() + "원");
                } else {
                    System.out.println("해당 계좌가 존재하지 않습니다.");
                }
            } else if (strNum.equals("4")) {
                System.out.println("출금할 계좌번호를 입력해주세요: ");
                int withdrawAccountNumber = Integer.parseInt(scanner.nextLine());
                Account withdrawAccount = findAccount(accounts, withdrawAccountNumber);
                if (withdrawAccount != null) {
                    System.out.println("출금할 금액을 입력해주세요: ");
                    int withdrawAmount = Integer.parseInt(scanner.nextLine());
                    if (withdrawAccount.withdraw(withdrawAmount)) {
                        System.out.println("출금하셨습니다. 잔고: " + withdrawAccount.getAccountBalance() + "원");
                    } else {
                        System.out.println("잔고가 부족합니다.");
                    }
                } else {
                    System.out.println("해당 계좌가 존재하지 않습니다.");
                }
            } else if (strNum.equals("5")) {
                banking = false;
                System.out.println("프로그램 종료");
            } else {
                System.out.println("잘못 선택하셨습니다. 보안을 위해 종료합니다.");
                break;
            }
        }
        scanner.close();
    }

    private static Account findAccount(List<Account> accounts, int accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accountNumber) {
                return acc;
            }
        }
        return null;
    }
}

class Account {
    int accountNumber;
    String name; // name 필드 추가
    int accountBalance; // 계좌 잔고 필드 추가

    public Account(int accountNumber, String name) { // 생성자 수정
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void deposit(int amount) {
        accountBalance += amount;
    }

    public boolean withdraw(int amount) {
        if (accountBalance >= amount) {
            accountBalance -= amount;
            return true;
        }
        return false;
    }
}
