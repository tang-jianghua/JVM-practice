package thread;

public class Thread2 extends Thread {
    public void run(){
        try {
            System.out.println("Thread2---start");
            Thread.sleep(2000);
            System.out.println("Thread2---end");
        }catch (Exception e){

        }
    }

    public static void main(String[] args) {
        Thread2 thread2 = new Thread2();
        thread2.start();
    }
}
