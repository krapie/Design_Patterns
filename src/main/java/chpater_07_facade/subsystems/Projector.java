package chpater_07_facade.subsystems;

public class Projector {
    public void on() {
        System.out.println("프로젝트가 켜졌습니다.");
    }

    public void wideScreenMode() {
        System.out.println("프로젝터 화면 비율을 와이드 모드로 설정합니다(16:9비율).");
    }

    public void off() {
        System.out.println("프로젝터가 꺼졌습니다.");
    }
}
