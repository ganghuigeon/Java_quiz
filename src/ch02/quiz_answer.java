package ch02;

public class quiz_answer {
    public static void main(String[] args) {
        // 3번 문제
        /*
        //char 형 + char 형 = int형으로 자동 타입변환
        System.out.println('A' + 'B');
        //char 형 + int형 = int형으로 자동 타입변환
        System.out.println('1' + 2);
        //char 형 + char 형 = int형으로 자동 타입변환
        System.out.println('1' + '2');
        //String형 + 타른타입 = 항상 String형으로 자동 타입 변환
        System.out.println('J' + "AVA");
        */

        // 4번 문제
        /*
        byte byteValue = 10;
        char charValue = 'A';

        int intValue1= byteValue;
        int intValue2 = charValue;

        //서로의 가용범위가 달라서 자료손실이 발생할 수 있음
        //특히 short는 최상휘 부호비트를 음수를 표현하는데 사용함
        short shortValue = charValue;

        double doubleValue = byteValue;
        */

        // 5번 문제
        /*
        int intValue = 10;
        char charValue = 'A';
        double doubleValue = 5.7;
        String strValue = "A";

        double var1 = (double) intValue;
        byte var2 = (byte) intValue;
        int var3 = (int) doubleValue;
        //타입이 달라 형변환이 진행될 수 없다.
        char var4 = (char) strValue;
        //String 객체이자 참조타입
        //char 기본타입
        */

        //6번문제
        /*
        byte byteValue = 10;
        float floatValue = 2.5F;
        double doubleValue = 2.5
        
        //byte + byte = int형으로 타입이 자동변환 되어야 하나 byte로 값을 받기 때문에 오류 발생
        byte result1 = byteValue + byteValue;
        //int + byte = int 자동 타입 변환
        int result2 = 5 + byteValue;
        //int + float = float형으로 타입 변환, 정수보다 실수가 허용범위가 더 크다는 점에 유의
        float result3 = 5 + floatValue;
        //int + double = double형으로 타입 변환
        double result4 = 5 + doubleValue;
         */

        //7번문제
        /*
        String str = "5";

        byte var1 = Byte.parseByte(str);
        //Integer.parseInt(str)로 작성해야 올바름
        int var2 = Int.parseInt(str);
        float var3 = Float.parseFloat(str);
        double var4 = Double.parseDouble(str);
        */

        //8번문제
        /*
        int v1 = 1;
        System.out.println("v1:" + v1);


        if (true) {
            int v2 = 2;
            if (true) {
                int v3 = 2;
                System.out.println("v1:" + v1);
                System.out.println("v2:" + v2);
                System.out.println("v3:" + v3);
            }


            System.out.println("v1:" + v1);
            System.out.println("v2:" + v2);
            System.out.println("v3:" + v3); //범위 밖, 오류 발생
        }


        System.out.println("v1:" + v1);
        System.out.println("v2:" + v2); //범위 밖, 오류 발생
        */
        //10번 문제
        /*
        //int로 바꿔주어야 함
        byte b = 256;
        //공백의 유니코드 값 32
        char c = '';
        //char형은 문자 하나만 사용가능
        char answer = 'no';
        double d = 1.4e3f; //1.4 * 10^3
        */

        //11번 문제
        byte b = 10;
        char ch = 'A';
        int i = 100;
        long l = 1000L;

        b = (byte) i;
        ch = (char) b; //음수부호를 가지는 byte는 음수를 사용하지 않는 char형으로 자동타입변환을 할 수 없다
        short s = (short) ch; // 음수부호 문제, char형이 short보다 가용범위가 크므로 자동타입 변환 x
        i = (int) ch; //char 형은 int보다 허용범위가 작으므로 자동타입변환이 발생


    }

}
