import java.util.concurrent.BlockingQueue;

class Producer implements Runnable {
    private BlockingQueue<String> queue;

    public Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        String[] messages = {"Message 1", "Message 2", "Message 3"};
        try {
            for (String message : messages) {
                System.out.println("Producer: " + message);
                queue.put(message);
                Thread.sleep(1000);
            }
            queue.put("DONE");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
