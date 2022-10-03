package chapter_07_facade.subsystems;

public class StreamingPlayer {
    String movie;

    public void on() {
        System.out.println("스프리밍 플레이어가 켜졌습니다.");
    }

    public void play(String movie) {
        this.movie = movie;
        System.out.println("스프리밍 플레이어에서 \"" + movie + "\"를 재생합니다.");
    }

    public void stop() {
        System.out.println("스프리밍 플레이어에서 \"" + movie + "\"를 종료합니다.");
    }

    public void off() {
        System.out.println("스프리밍 플레이어가 꺼졌습니다.");
    }
}
