package counter;


import java.util.ArrayList;
import java.util.List;

public class CounterThreadMain{

    public static void main(String[] args) {

        Counter counter = new Counter();

        Thread thread1 = new Thread(()->{
            int i = 0;
            while (i < 5){
                    counter.addCount();
                    System.out.println("Поток 1 добавил единицу");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                    }
                    i++;
            }
        });

        Thread thread2 = new Thread(()->{
            int i = 0;
            while (i < 5){
                    counter.addCount();
                    System.out.println("Поток 2 добавил единицу");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                    }
                i++;
            }
        });

        Thread thread3 = new Thread(()->{
            int i = 0;
            while (i < 5){
                    counter.addCount();
                    System.out.println("Поток 3 добавил единицу. Счётчик: " + counter.getCount());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                    }
                i++;
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

    }

}
