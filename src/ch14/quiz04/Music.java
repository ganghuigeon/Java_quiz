package ch14.quiz04;

public class Music extends Thread {
    private int playMusic;

    public Music() {
        setName("음악을 재생합니다."); // 스레드 이름 변경
    }

    public int getPlayMusic() {
        return playMusic;
    }

    public void setPlayMusic(int playMusic) {
        this.playMusic = playMusic;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 3; i++) {
            playMusic += i;
            System.out.println(getName() + playMusic);
            try {
                Thread.sleep(1000); // 1초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
