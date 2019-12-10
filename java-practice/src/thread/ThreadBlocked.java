package thread;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class ThreadBlocked {

    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static void main(String[] args) throws Exception{

        ThreadBlocked threadBlocked = new ThreadBlocked();
        threadBlocked.setA(2);
        Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
        theUnsafe.setAccessible(true);
        Unsafe unsafe = (Unsafe)theUnsafe.get(null);
        long a = unsafe.objectFieldOffset(threadBlocked.getClass().getDeclaredField("a"));
        unsafe.putInt(threadBlocked,a,1);
        System.out.println(threadBlocked.getA());
    }
}
