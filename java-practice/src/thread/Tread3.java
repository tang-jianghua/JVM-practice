package thread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class Tread3 implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("Thread3----start");
        Thread.sleep(2000);
        System.out.println("Thread3----end");
        return "Thread3";
    }

    public static void main(String[] args) throws Exception{
     Tread3 thread3 = new Tread3();
         FutureTask<String> futureTask = new FutureTask<>(thread3);
       Thread thread = new Thread(futureTask);
        thread.start();
        Thread.sleep(1000);
        System.out.println(futureTask.cancel(false));
        System.out.println(futureTask.cancel(false));
        System.out.println(futureTask.isCancelled());
        System.out.println(futureTask.isDone());
        String s = futureTask.get();
        System.out.println(s);

          /* ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<String> future = executorService.submit(thread3);
        Thread.sleep(1000);
        executorService.shutdown();
        System.out.println(future.cancel(false));
        System.out.println(future.cancel(false));
        String s = future.get();
        System.out.println(s);*/
   /*     ExecutorService executorService = Executors.newSingleThreadExecutor();
        List<Tread3> list = new ArrayList<>(1000);
        IntStream.range(0,1000).forEach(i->list.add(new Tread3()));
        List<Future<String>> futures = executorService.invokeAll(list, 2l, TimeUnit.SECONDS);
        executorService.shutdown();
        System.out.println(futures.size());
        for (int i = 8; i < 12; i++) {
            System.out.println(futures.get(i).isDone());
            System.out.println(futures.get(i).isCancelled());
        }*/


        HashMap hashMap = new HashMap() {{
            put("name", "sdf");

        }};

        Test test = new Test();
    }

    static class Test{
        private String name ;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
