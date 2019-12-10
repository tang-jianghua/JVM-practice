package function.function;

import java.util.function.Function;

public class FunctionTest<T,R,V> {

    public R testApply(T t, Function<T,R> function){
        return function.apply(t);
    }
    public Function<V,R> testCompose(Function<V,T> before,Function<T,R> function){
        return function.compose(before);
    }
    public Function<T,V> testAndThen( Function<T,R> function,Function<R,V> after){
        return function.andThen(after);
    }
    public Function<T,T> testIdentity(){
        return Function.identity();
    }

    public static void main(String[] args) {
        FunctionTest<Integer, String, Long> functionTest = new FunctionTest<>();
        //1.apply，实现一个函数，并执行apply
        String s = functionTest.testApply(1, integer -> integer.toString());
        System.out.println(s);

        //2.compose 定义一个由Long得到Integer的函数before，再定义一个由Integer得到String的函数，最后组成一个新的由Long得到String的函数。
        Function<Long, String> objectStringFunction = functionTest.testCompose(lo -> lo.intValue(), integer -> integer.toString());
        String apply = objectStringFunction.apply(123l);
        System.out.println(apply);

        //3.andThen 定义一个由Integer得到String的函数，再定义一个由String得到Long的函数after，最后组成一个新的由Integer得到Long的函数。
        Function<Integer, Long> integerLongFunction = functionTest.testAndThen(integer -> integer.toString(), str -> Long.valueOf(str));
        Long apply1 = integerLongFunction.apply(123);
        System.out.println(apply1);

        //4.identity
        Function<Integer, Integer> identity = functionTest.testIdentity();
        Integer apply2 = identity.apply(123);
        System.out.println(apply2);
    }
}
