class Singleton {
    public String name;

    private static Singleton instance = null;

    private Singleton() {
        name = "SingletonTest Initialized";
    }

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2= Singleton.getInstance();
        System.out.println(singleton1.name);
        System.out.println(singleton2.name);
        singleton1.name = singleton1.name.toUpperCase();
        System.out.println(singleton1.name);
        System.out.println(singleton2.name);
    }
}
