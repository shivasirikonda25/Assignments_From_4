import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class EvenOddNumberPrinter {
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();

        Thread evenThread = new Thread(new EvenNumberTask(printer));
        Thread oddThread = new Thread(new OddNumberTask(printer));

        evenThread.start();
        oddThread.start();
    }
}

