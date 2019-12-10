package interfacedefault;

public interface ParentService {

    default void test(){
        System.out.println("ParentTest");
    }
}
