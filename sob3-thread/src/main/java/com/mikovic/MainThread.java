package src.main.java.com.mikovic;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        final Typography typography = new Typography();
        Thread t1 = new Thread(() -> {
            typography.printPing();
        });

        Thread t2 = new Thread(() -> {
            typography.printPong();
        });
        t1.start();
        t2.start();

        Lock lock = new ReentrantLock();
        Counter counter = new Counter();
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10; j++) {
                        try {
                            //ставим лок в течение 5 сек
                            if(lock.tryLock(5, TimeUnit.SECONDS)) {
                                counter.increase();
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }finally{
                            //убираем лок
                            lock.unlock();
                        }
                    }
                }
            }).start();
        }
        Thread.sleep(2000);
        System.out.println(counter.counter.get());
    }

}




