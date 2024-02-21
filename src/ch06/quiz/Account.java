package ch06.quiz;

//shift + insert = println
//alt + insert = code 생성기
public class Account {
    private String ano; //계좌번호
    private  String owner; //계좌주

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAno() {
        return ano;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    private int balance; //잔고


//컨스트럭터 선택하면 아래와 같이 만들어짐
    public Account(String ano, String owner, int balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }
}
