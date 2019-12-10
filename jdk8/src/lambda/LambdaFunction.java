package lambda;

@FunctionalInterface
public interface LambdaFunction<T> {

    T add(T a,T b);
}
