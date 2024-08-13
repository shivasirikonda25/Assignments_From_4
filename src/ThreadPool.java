import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
    public static void main(String[] args) {
        int corePoolSize = 5;
        int maxPoolSize = 10;
        long keepAliveTime = 1;
        TimeUnit unit = TimeUnit.MINUTES;

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(corePoolSize);
        for (int i = 0; i <= 10; i++) {
            Runnable task = new Task(i);
            System.out.println("Submitting task " + i);
            executor.execute(task);
        }
        executor.shutdown();

        try {
            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }

        System.out.println("Finished all tasks");
    }
}
