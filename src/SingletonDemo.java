class SingletonDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            Singleton singleton = Singleton.getInstance();
            singleton.doSomething();
        });
        Thread t2 = new Thread(() -> {
            Singleton singleton = Singleton.getInstance();
            singleton.doSomething();
        });

        t1.start();
        t2.start();
    }
}
