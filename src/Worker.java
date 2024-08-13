import java.util.concurrent.CountDownLatch;

class Worker implements Runnable {
    private CountDownLatch latch;
    private String name;

    public Worker(CountDownLatch latch, String name) {
        this.latch = latch;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " is doing work.");
            Thread.sleep((long) (Math.random() * 2000));
            System.out.println(name + " has finished work.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            latch.countDown();
        }
    }
}
