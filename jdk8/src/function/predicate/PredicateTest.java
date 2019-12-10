package function.predicate;

import java.util.function.Predicate;

public class PredicateTest<T> {

    public boolean test(T t,Predicate<T> predicate){
        return predicate.test(t);
    }
    public Predicate<T> testAnd(Predicate<T> predicate,Predicate<T> predicateAnd){
        return predicate.and(predicateAnd);
    }
    public Predicate<T> testOr(Predicate<T> predicate,Predicate<T> predicateOr){
        return predicate.or(predicateOr);
    }
    public Predicate<T> testNegate(Predicate<T> predicate){
        return predicate.negate();
    }
    public Predicate<T> testEqual(T t){
        return Predicate.isEqual(t);
    }
    public static void main(String[] args) {
        PredicateTest<Integer> predicateTest = new PredicateTest<>();
        Integer i = 1;
        //1.test 判断i是否大于0
        boolean test = predicateTest.test(i, integer -> integer != null && integer > 0);
        System.out.println(test);

        //2.and 判断i是否大于0同时小于10
        Predicate<Integer> testAnd = predicateTest.testAnd(integer -> integer != null && integer > 0, integer -> integer < 10);
        System.out.println(testAnd.test(i));
        i=10;
        System.out.println(testAnd.test(i));

        //3.negate 判断i是否!test
        Predicate<Integer> testNegate = predicateTest.testNegate(integer -> integer != null && integer > 0);
        System.out.println(testNegate.test(i));

        //3.negate 判断i是否!test
        Predicate<Integer> testEqual = predicateTest.testEqual(10);
        System.out.println(testEqual.test(i));


    }
}
