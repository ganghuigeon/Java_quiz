package ch07;

public class quiz08 {
    /*
    public class Tire {
        public void run() {
            System.out.println(“일반 타이어가 굴러갑니다.”);
        }
    }
    public class SnowTire extends Tire {
        @Override
        public void run() {
            System.out.println(“스노우 타이어가 굴러갑니다.”);
        }
    }
    public class SnowTireExample {
        public static void main(String[] args) {
            SnowTire snowTire = new SnowTire();
            Tire tire = snowTire;

            snowTire.run();
            tire.run();
        }
    }
*/
    //Tire클래스에서 run을 선언하고, SnowTire클래스에서 Tire클래스를 상속받고 run을 재정의했고
    //SnowTireExample에서 SnowTire를 호출하여 실행했기 때문에 "스노우 타이어가 굴러갑니다."가 두 번 출력될 것임
}
