package function.consumer;

import java.util.function.Consumer;

public class ConsumerTest<T> {

    public void testAccept(T t,Consumer<T> consumer){
        consumer.accept(t);
    }

    public Consumer<T> testAndThen(Consumer<T> consumer,Consumer<T> after){
       return consumer.andThen(after);
    }

    public static void main(String[] args) {
        ConsumerTest<StringBuilder> consumerTest = new ConsumerTest<>();
        StringBuilder stringBuilder = new StringBuilder();
        //1.test
        consumerTest.testAccept(stringBuilder,sb ->sb.append("1"));
        System.out.println(stringBuilder);

        //2.testAndThen
        Consumer<StringBuilder> testAndThen = consumerTest.testAndThen(sb -> sb.append("1"), sb -> sb.append("2"));
        testAndThen.accept(stringBuilder);
        System.out.println(stringBuilder);
    }
}
