package chapter_07_facade.subsystems;

public class TheaterLights {
    public void dim(int brightness) {
        System.out.println("조명 밝기를 " + brightness + "%로 설정합니다.");
    }

    public void on() {
        System.out.println("조명이 켜졌습니다.");
    }
}
