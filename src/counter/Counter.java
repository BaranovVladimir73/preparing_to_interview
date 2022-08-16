package counter;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {

    Lock lockForCounter = new ReentrantLock();

    private int count;

    public Counter() {
        count = 0;
    }

    public void addCount(){
        try {
            lockForCounter.lock();
            count++;
        } finally {
            lockForCounter.unlock();
        }

    }

    public int getCount() {
        return count;
    }
}
