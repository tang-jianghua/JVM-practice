package interfacedefault;

public interface ChildService extends ParentService {

    default void test2(){
        System.out.println("ChildTest");
    }
}
