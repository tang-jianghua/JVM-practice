package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class  ThreadTest implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("thread1----run");
            Thread.sleep(2000);
            System.out.println("thread1----stop");
        }catch (Exception e){
        }
    }

    public static void main(String[] args) throws Exception{

        ThreadTest test = new ThreadTest();
        synchronized (test){

        }
     /*   Thread thread = new Thread(test);
        thread.start();

        thread = new Thread(() -> {
            try {
                System.out.println("thread2----run");
                Thread.sleep(2000);
                System.out.println("thread2----stop");
            }catch (Exception e){
            }
        });
        thread.start();*/

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> submit = executorService.submit(test, 1);
        Integer integer = submit.get();
        System.out.println(integer);
    }

}
