package synchronizedtest;

public  class  SynchronizedDemo {

    private  String name;

    public SynchronizedDemo(String name) {
        this.name = name;
    }

    synchronized static void run(){
            while (true) {
                try {

                    Thread.sleep(2000);
                } catch (Exception e) {

                }
                System.out.println(Thread.currentThread().getName() + "----run");
            }
    }
    synchronized static void run2(){
            while (true) {
                try {

                    Thread.sleep(2000);
                } catch (Exception e) {

                }
                System.out.println(Thread.currentThread().getName() + "----run2"  );
            }
    }

}
