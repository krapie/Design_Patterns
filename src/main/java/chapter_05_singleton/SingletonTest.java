package chapter_05_singleton;

public class SingletonTest {

    private static Singleton singleton;
    private static Singleton singleton2;

    public static void main(String[] args) {

        Thread thread = new Thread(() -> singleton = Singleton.getInstance());
        Thread thread2 = new Thread(() -> singleton2 = Singleton.getInstance());

        thread.start();
        thread2.start();

        System.out.println(singleton == singleton2);

        thread.interrupt();
        thread2.interrupt();
    }
}
