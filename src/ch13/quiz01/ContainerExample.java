package ch13.quiz01;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> container1 = new Container<String>();
        container1.set("홍길동");

        String str = container1.get();

        Container<Integer> container2 = new Container<Integer>();
        container2.set(6);

        int value = container2.get(); // Integer를 직접 반환하기 때문에 변환이 필요하지 않음
    }
}


