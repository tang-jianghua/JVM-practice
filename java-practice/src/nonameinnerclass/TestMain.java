package nonameinnerclass;

public class TestMain {
    public static void main(String[] args) {
        Test test = new Test(){
            @Override
            public boolean test(String str) {
                return str == null;
            }
        };
        boolean test1 = test.test("");
        System.out.println(test1);
    }

}
