import java.util.concurrent.BlockingQueue;

class Consumer implements Runnable {
    private BlockingQueue<String> queue;

    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            String message;
            while (!(message = queue.take()).equals("DONE")) {
                System.out.println("Consumer: " + message);
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Consumer: DONE");
    }
}
