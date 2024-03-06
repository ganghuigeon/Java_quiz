package ch12.quiz07;

public class IntegerCompareExample {
    public static void main(String[] args) {
        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;

        System.out.println(obj1 == obj2);
        System.out.println(obj3 == obj4);

        //자바 기능상 byte정도의 크기는 실제 값끼리 비교를 해주기 때문에 obj1,obj2는 true가 출력이 되나,
        //byte의 범위를 벗어난 obj3,obj4는 실제 값을 비교하는 게 아닌 객체 주소와 비교하기 때문에, false가 출력이 된다. equals로 비교주어야 실제 값끼리 비교해줄 수 있다.
        System.out.println("실제 값 비교: " + obj3.equals(obj4));


    }
}

