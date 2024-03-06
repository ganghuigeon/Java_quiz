package ch08.quiz05;

public class Tv implements Remocon {

    @Override
    public void powerOn() {
        System.out.println("TV를 켭니다.");
    }

    public static void main(String[] args) {
            Remocon r = new Tv();
            r.powerOn();
        }
    }


