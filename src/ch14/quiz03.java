package ch14;

public class quiz03 {
    public static void main(String[] args) {
        Thread thread1 = new Thread() {
        };
        for (int i = 0; i <= 3; i++) {
            System.out.println("동영상을 재생합니다.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        for (int j = 0; j <= 3; j++) {
            System.out.println("음악을 재생합니다.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    ;


}

