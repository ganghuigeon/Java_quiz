package ch02;

public class ch02quiz {
    public static void main(String[] args) {
//1. 논리형 boolean, 문자형 char, 정수형 short, int, long 실수형 float, double
        //2. byte < short = char < int < long < float < double
        /*
        3.
        System.out.println(“1” + “2”) → (12)
        문자열끼러 연산하는 것으로 1과2가 나열됨

        System.out.println(‘A' + 'B') → (131)
        유니코드 값을 출력하기 때문에 AB값이 출력되는 것이 아니라 131이 출력됨

        System.out.println('1' + 2) → (51)
        유니코드 값을 출력하기 때문에 12가 아니라, 49 + 2 값이 출력됨

        System.out.println('1' + '2') → (99)
        유니코드 값을 출력하기 때문에 49+50값이 출력됨

        System.out.println('J' + “ava”) → (JAVA)
	    문자열 AVA로 인하여 유니코드 값이 출력되는 것이 아니라 JAVA가 출력됨
         */
        /*
         * 4. short shortValue = charValue; 값에 컴파일 에러 발생함
         *  서로의(short -32768~32767 마이너스 포함/ 0~65535 마이너스 범위 없음) 범위가 달라서 형변환시 값손실이 발생하다보니, 자동적으로 형변환이 이뤄질 수 없음
         *
       
         * */

        /*
         * 5. char var4 = (char) strValue; 값에 컴파일 에러 발생함
         * 하나는 클래스고, char는 기본형 타입이기 때문
         *
         * 아래는 올바른 정답
         * *String은 클래스이고 char는 2byte로 정수로 이루어진 기본형 타입(primitive type)중에 하나이다.
         * */

        /*
         * 6. byte result1 = byteValue + byteValue; 값에 컴파일 에러 발생함
         * 연산할 떄에는 int로 인식하기 때문에 int로 받는 값을 변환을 해주어야 한다.
         * */

        //7. int var2 = Int.parseInt(str);가 틀림, int var2 = Integer.parseInt(str);로 작성해야 올바름

        //8. 17라인의 v3와, 22라인 v2, 전역변수 v1과 다르게, v3과 v2는 각기 범위 중괄호를 벗어났으므로, 오류가 발생함

        /* 9.
        -리터럴: 20, 1.2, 'a'
        -변수: a, num, ch
        -키워드: int, double, char
        */

        /*10.
        int로 바꿔주어야 함
        byte b = 256;
        공백의 유니코드 값 32
        char c = '';
        char형은 문자 하나만 사용가능
        char answer = 'no';
        */

        //11. i = (int)ch; int 에 선언된 값이 char 타입의 한도를 넘지 않았기 때문에 올바른 유니코드르 받아 낼 수 있음, 별도로 형변환이 필요 하지 않음
    }
}
