package ping_pong;

public class PingPongThread implements Runnable{

    private Object lock;
    private String message;
    private int count;

    public PingPongThread(Object lock, String message) {
        this.lock = lock;
        this.message = message;
        this.count = 0;
    }

    @Override
    public void run() {

        while (!(count == 10)){
            synchronized (lock) {
                System.out.println(message);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                count++;
                lock.notify();
                try {
                    lock.wait(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


}
