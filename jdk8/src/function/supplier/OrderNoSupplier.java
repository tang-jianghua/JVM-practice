package function.supplier;

import java.time.Instant;
import java.util.function.Supplier;

public class OrderNoSupplier implements Supplier<String> {
    @Override
    public String get() {
        return String.valueOf(Instant.now().getEpochSecond());
    }
}
