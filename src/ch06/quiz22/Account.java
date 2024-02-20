package ch06.quiz22;

public class Account {
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        //매개 값이 음수이거나 백만원을 초과하면 현재 balance값을 유지
        if (balance < Account.MIN_BALANCE ||
                balance > Account.MAX_BALANCE)
        {
            return;
        }
        this.balance += balance;
    }
}
