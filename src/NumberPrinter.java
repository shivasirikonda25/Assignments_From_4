import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class NumberPrinter {
    private int number = 1;
    private final Lock lock = new ReentrantLock();
    private final Condition evenCondition = lock.newCondition();
    private final Condition oddCondition = lock.newCondition();
    private boolean evenTurn = false;

    public void printEvenNumber() {
        lock.lock();
        try {
            while (!evenTurn) {
                evenCondition.await();
            }
            System.out.println("Even: " + number++);
            evenTurn = false;
            oddCondition.signal();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }

    public void printOddNumber() {
        lock.lock();
        try {
            while (evenTurn) {
                oddCondition.await();
            }
            System.out.println("Odd: " + number++);
            evenTurn = true;
            evenCondition.signal();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }
}
