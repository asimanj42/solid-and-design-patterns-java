package az.example.designpatterns.creational.singleton;

public class Singleton {

    private static Singleton singleton;

    private Singleton() {
        System.out.println("yarandim");
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }

            }
        }
        return singleton;
    }
}
