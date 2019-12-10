package synchronizedtest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedTest {

    public static void main(String[] args) {
        SynchronizedDemo synchronizedDemo1 = new SynchronizedDemo("test1");
        SynchronizedDemo synchronizedDemo2 = new SynchronizedDemo("test2");
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(() ->  synchronizedDemo1.run());
        executorService.execute(() ->  synchronizedDemo2.run2());
        executorService.shutdown();
    }
}
