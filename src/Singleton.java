public class Singleton {
    public static volatile Singleton instance;
    private Singleton(){}

    public static Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    public void doSomething() {
        System.out.println("Doing something");
    }
}

