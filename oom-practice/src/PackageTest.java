public class PackageTest {

	public static void main(String[] args) {
		Integer a= 1;
		Integer b= 2;
		Integer c= 3;
		Integer d= 3;
		Integer e= 321;
		Integer f= 321;
		Long g= 3L;
		Long x= 3000000000000L;
		Long y= 3000000000000L+3L;
		System.out.println(c==d);
		System.out.println(e==f);
		System.out.println(c==(a+b));
		System.out.println(c.equals(a+b));
		System.out.println(g==(a+b));
		System.out.println(g.equals(a+b));
		System.out.println(x.equals(y-g));
		System.out.println(x==(y-g));
	}
}
