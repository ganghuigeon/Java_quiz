package ch03;

public class quiz4 {
    public static void main(String[] args) {
        int value = 356;
        System.out.println((value / 100) * 100); // 정수 연산 결과이다보니, 실제값 3.56에서 소수점 이하자리는 절삭되고, 3이 100곱해져서 300이라는 결과가 출력된다.
    }
}
