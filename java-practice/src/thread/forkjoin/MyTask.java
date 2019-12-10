package thread.forkjoin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.IntStream;

public class MyTask extends RecursiveTask<List<List>>{

    int a = 10;

    private List list;

    public MyTask( List list) {
        this.list = list;
    }

    @Override
    protected List<List> compute() {
        if(list.size()>10){
            int i = list.size() / 2;
            MyTask myTask = new MyTask(list.subList(0,i));
            MyTask myTask2 = new MyTask(list.subList(i,list.size()));
            myTask.fork();
            myTask2.fork();
            List<List> join = myTask.join();
            List<List> join2 = myTask2.join();
            join.addAll(join2);
            return join;
        }else{
            List<List> x = new ArrayList<>();
            x.add(list);
            return x;
        }
    }

    public static void main(String[] args) throws Exception{
        List<String> m = new ArrayList<>();
        IntStream.range(1,100).forEach(i -> m.add(i+""));
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
        ForkJoinTask<List<List>> submit = forkJoinPool.submit(new MyTask(m));
        List<List> lists = submit.get();
        System.out.println(lists);
        forkJoinPool.shutdown();
    }
}
