package ch03;

public class quiz3 {
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30;
        int pencilsPerStudent = (pencils / students);//정수의 연산 결과는 정수만을 출력하기 때문에, 소숫점 자리는 출력되지 않는다
        System.out.println(pencilsPerStudent); //학생 한 명이 가지는 연필 수

        int pencilsLeft = (pencils % students);//남은 연필 수
        System.out.println(pencilsLeft);

    }
}
