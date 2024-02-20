package ch06;

public class quiz18 {
    public class Example
    {
        int iv = 10;
        static int cv = 20;
        int iv2 = cv;
     //   static int cv2 = iv; // 첫번째 컴파일 에러, instance 멤버를 static 멤버로 가져올 경우 컴파일 에러가 발생함,
        // instance멤버를 static 멤버로 바꿔주거나(static 없는 멤버에 static 추가), static멤버를 instance멤버(static 제거) 해주어야 해결됨


        static void staticMethod1() { //static 필드에, instance 멤버를 호출해서 컴파일 에러 발생, 선언된 static을 지우면 컴파일 에러 해결됨
            System.out.println(cv);
      //      System.out.println(iv); // 두번째 컴파일 에러,
        }


        void instanceMethod1() {
            System.out.println(cv);
            System.out.println(iv);
        }


        static void staticMethod2() { // static 필드에 instance 메소드를 호출해서 발생한 문제 static제거 시 컴파일 에러 해결됨
            staticMethod1();
      //      instanceMethod1();   // 세번째 컴파일 에러
        }


        void instanceMethod2() {
            staticMethod1();
            instanceMethod1();
        }
    }

}
