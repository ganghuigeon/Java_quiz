package ch04;

public class quiz03 {
    public static void main(String[] args) {
       // 1부터 20까지의 정수 중에서 2와 3의 배수가 아닌 수의 총합을 구하는 코드를 작성하시오.
       // 총합: 73
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            if ((i % 3) != 0 && (i % 2) != 0) {
                sum += i;
            }
        }
        System.out.println("3과 2의 배수를 제외한 합: " + sum);

    }
}
