package ch14;

public class quiz02 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <5 ; i++) {
                    System.out.println("글 작성 중");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        thread1.start();

        for (int i = 0; i < 5 ; i++) {
            System.out.println("음악 듣는중");
        }
    }
    //오버라이드 된 부분을 2초동안 대기가 이뤄진 뒤(Thread.sleep(2000);), 실행이 이뤄진다.(thread1.start();)
    //그러므로 최하단 반복문이 먼저 실행되고, 2초마다 한번씩 실행된다.
}
