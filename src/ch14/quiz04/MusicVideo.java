package ch14.quiz04;

public class MusicVideo {
    public static void main(String[] args) {
        Music music = new Music();
        Thread musicThread = new Thread(music);
        musicThread.start();

        Video video = new Video();
        Thread videoThread = new Thread(video);
        videoThread.start();
    }
}
