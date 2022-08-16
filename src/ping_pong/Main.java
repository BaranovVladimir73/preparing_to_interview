package ping_pong;

import counter.Counter;
import ping_pong.PingPongThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {

        Object lock = new Object();

        Thread thread1 = new Thread(new PingPongThread(lock, "Ping"));
        Thread thread2 = new Thread(new PingPongThread(lock, "Pong"));

        thread1.start();
        thread2.start();

    }

}
