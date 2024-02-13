package ch03;

public class quiz11 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        //연산의 결과는 int가 받기 때문에
        int c = a + b;

        char ch = 'A';
        ch = (char) ((ch) + 2);

        float f = (float) (3 / 2.0);
        long l = (long)3000 * 3000 * 3000; //int로 인식하다보니, long으로 인식하도록 처리해줘야 데이터 손실 없어짐

        float f2 = 0.1f;
        double d = 0.1;

        boolean result = (float) d==f2;

        System.out.println("c="+c);
        System.out.println("ch="+ch);
        System.out.println("f="+f);
        System.out.println("l="+l);
        System.out.println("result="+result);

        /*
        실행결과
        c=30
        ch=C
        f=1.5
        l=27000000000
        result=true
        */

    }
}
