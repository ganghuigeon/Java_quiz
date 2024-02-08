package ch03;

public class quiz2 {
    public static void main(String[] args) {
        int score = 85;
        String result = (!(score>90))? "가":"나";
        System.out.println(result);
        //90이상이 아니라면 "가"를 출력하도록 하기 때문에, 가를 출력하게 된다.
    }
}
