package lambda;

public class Test {

    public static int add(int a,int b){
        return a+b;
    }

    public int add(int a,int b,LambdaFunction<Integer> lambdaFunction){
        return lambdaFunction.add(a,b);
    }

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.add(1,2,( a, b) ->a+b));
        System.out.println(test.add(1,2,Test::add));
    }
}
