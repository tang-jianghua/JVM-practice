package function.supplier;

import java.time.Instant;
import java.util.function.Supplier;

public class SupplierTest<T> {

    public T testGet(Supplier<T> supplier){
        return supplier.get();
    }

    public static void main(String[] args) {
        SupplierTest<String> test = new SupplierTest<>();
        String s = test.testGet(() -> String.valueOf(Instant.now().getEpochSecond()));
        System.out.println(s);
    }
}
