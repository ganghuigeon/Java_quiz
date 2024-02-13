package ch04;

public class quiz08 {
    public static void main(String[] args) {
        // for 문을 이용해서 다음과 같은 실행 결과가 나오는 코드를 작성해보세요.
        //       힌트: 이중 for문 사용, System.out.print()은 줄바꿈을 하지 않고 출력한다.

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
