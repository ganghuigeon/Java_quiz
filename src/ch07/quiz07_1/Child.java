package ch07.quiz07_1;

public class Child  extends  Parent{
    public String name;

    public Child() {
        //1. 부모 생성자를 먼저 실행하므로 Parent() 생성자 실행
        this("홍길동");//4. Child(String name) 생성자 호출
        System.out.println("Child() call");//5.
    }

    public Child(String name) {
        this.name = name;
        System.out.println("Child(String name) call");
    }

}
