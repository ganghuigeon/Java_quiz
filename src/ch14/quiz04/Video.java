package ch14.quiz04;
public class Video extends Thread {
    private int playVideo;

    public Video() {
        setName("동영상을 재생합니다.");//스레등 이름 변경
    }

    public int getPlayVideo() {
        return playVideo;
    }

    public void setPlayVideo(int playVideo) {
        this.playVideo = playVideo;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 3; i++) {
            playVideo += i;
            System.out.println(getName() + playVideo);
            try {
                Thread.sleep(1000); // 1초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}