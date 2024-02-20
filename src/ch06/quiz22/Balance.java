package ch06.quiz22;

/*
은행 계좌 객체인 Account 객체는 잔고(balance) 필드를 가지고 있습니다. balance 필드는
음수값이 될 수 없고, 최대 백만 원까지만 저장할 수 있습니다. 외부에서 balance 필드를 마음대로
변경하지 못하도록 하고, 0 <= balance <= 1,000,000 범위의 값만 가질 수 있도록 Account 클래
스를 작성해보세요.

➊ Setter와 Getter를 이용
➋ 0과 1,000,000은 MIN_BALANCE와 MAX_BALANCE 상수를 선언해서 이용
➌ Setter의 매개값이 음수이거나 백만 원을 초과하면 현재 balance 값을 유지
 */

public class Balance {
    public static void main(String[] args) {
        Account account = new Account();

        account.setBalance(10000);
        System.out.println("현재 잔고: " + account.getBalance());

        account.setBalance(-100);
        System.out.println("현재 잔고: " + account.getBalance());

        account.setBalance(2000000);
        System.out.println("현재 잔고: " + account.getBalance());

        account.setBalance(300000);
        System.out.println("현재 잔고: " + account.getBalance());

    }
}
